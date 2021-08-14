package com.example.codingpractice.etc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class AccountCode {

    public AccountCode() {}

    public void account() {

        String[] reqs = {"DEPOSIT 3a 10000", "CREATE 3a 300000", "WITHDRAW 3a 150000", "WITHDRAW 3a 150001"};

        //계좌 리스트
        List<Account> accountList = new ArrayList<>();

        //리턴 데이터
        List<Integer> answer = new ArrayList<>();

        //요청처리 했는지 체크
        AtomicBoolean complete = new AtomicBoolean(false);

        final String CREATE = "CREATE";
        final String DEPOSIT = "DEPOSIT";
        final String WITHDRAW = "WITHDRAW";

        for(int i = 0 ; i < reqs.length ; i++) {

            //요청, 계좌명, 처리할 돈을 각각 따로 변수에 담기
            String[] dataArray = reqs[i].split(" ");
            String request = dataArray[0];
            String newAccountName = dataArray[1];
            int money = Integer.parseInt(dataArray[2]);

            //계좌 개설
            if(request.equals(CREATE)) {

                if(accountList.stream().filter(account -> account.getName().equals(newAccountName)).count() > 0) {
                    answer.add(403);
                } else {
                    //계좌가 없는 경우 생성 및 한도금액
                    accountList.add(new Account(newAccountName, 0, money*(-1)));
                    answer.add(200);
                }

            //계좌 입금
            } else if(request.equals(DEPOSIT)) {

                  accountList.stream().map(account -> {

                      //계좌가 있는 경우
                    if(account.getName().equals(newAccountName)){
                        //입금액 추가
                        account.setDeposit(account.getDeposit() + money);
                        complete.set(true);
                    }
                    return account;
                }).collect(Collectors.toList());
                if(complete.get()) answer.add(200);
                else answer.add(404);

            //계좌 출금
            } else if(request.equals(WITHDRAW)) {

                AtomicBoolean overDeposit = new AtomicBoolean(false);
                accountList.stream().map(account -> {

                    //계좌가 있는 경우
                    if(account.getName().equals(newAccountName)){

                        //예금 + 한도를 넘는 경우
                        if(account.getMaxLoan()*(-1) + account.getDeposit() < money) {
                            overDeposit.set(true);
                        } else {
                            //예금으로 가능한 경우
                            if(account.getDeposit() >= money) {
                                account.setDeposit(account.getDeposit() - money);
                            //예금이 부족하여 한도를 사용하는 경우
                            } else {
                                account.setDeposit(0);
                                account.setMaxLoan(account.getMaxLoan() + money);
                            }
                            complete.set(true);
                        }
                    }
                    return account;
                }).collect(Collectors.toList());
                if(complete.get()) answer.add(200);
                else if(overDeposit.get()) answer.add(403);
                else answer.add(404);

                //찾을 수 있는 한도 초과 인지 구분 초기화
                overDeposit.set(false);
            }

            //처리 데이터 확인 후 다시 false로
            complete.set(false);
        }

        Integer[] an = answer.toArray(new Integer[answer.size()]);


        for(int i = 0 ; i < an.length ; i++) {
            System.out.println(an[i]);
        }
    }
}

