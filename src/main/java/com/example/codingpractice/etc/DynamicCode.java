package com.example.codingpractice.etc;

public class DynamicCode {

    static int[] fibo_memo;

    //피보나치 예제
    public void dynamic1() {

        int a = 30;

        fibo_memo = new int[45];
        fibo(a);
    }

    static void fibo(int a) {
        fibo_memo[0] = 0;
        fibo_memo[1] = 1;

        for(int i = 2 ; (i<=a)&&(i<45); i++) {
            fibo_memo[i] = fibo_memo[i-2] + fibo_memo[i-1];
        }
        System.out.println(fibo_dp(a));
    }

    static int fibo_dp(int a) {
        if(a<45) return fibo_memo[a];
        else return fibo_dp(a-1) + fibo_dp(a-2);
    }

    static int[] change;

    //거스름돈 예제
    public void dynamic2(){

        change = new int[1000];
        int i = 11;
        calc_change(i);
        System.out.println(change[i]);

    }

    static void calc_change(int len) {
        change[0] = 0;

        for(int i=1; i<= len; i++) {
            change[i] = min_change(i);
        }

    }

    static int min_change(int i) {
        int min = change[i-1] + 1; //1원을 더하는 과정
        if(i>=3) if(min>(change[i-3] + 1)) min = change[i-3] + 1; //1원 더한것과 그전에서 3원을 더하는것과 비교
        if(i>=4) if(min>(change[i-4] + 1)) min = change[i-4] + 1; //1원 더한것과 그전에서 4원을 더하는것과 비교
        return min;
    }

    static int[] changeDollar;

    //보석 문제
    public void dynamic3() {

        changeDollar = new int[1000];
        int i = 7;
        calc_change3(i);
        System.out.println(changeDollar[i]);
    }

    static void calc_change3(int len) {
        changeDollar[0] = 0;

        for(int i=1; i<= len; i++) {
            changeDollar[i] = min_change3(i);
        }

    }

    static int min_change3(int i) {

        int maxDoller = changeDollar[i-1]; //그전에 담았던 최대 돈
        if(i>=3) if(maxDoller<(changeDollar[i-3] + 12)) maxDoller = changeDollar[i-3] + 12; //3kg을 빼고 더했을때와 비교
        if(i>=4) if(maxDoller<(changeDollar[i-4] + 40)) maxDoller = changeDollar[i-4] + 40; //4kg을 빼고 더했을때와 비교
        if(i>=5) if(maxDoller<(changeDollar[i-5] + 25)) maxDoller = changeDollar[i-5] + 25; //5kg을 빼고 더했을때와 비교
        if(i>=7) if(maxDoller<(changeDollar[i-7] + 42)) maxDoller = changeDollar[i-7] + 42; //7kg을 빼고 더했을때와 비교
        return maxDoller;
    }
}
