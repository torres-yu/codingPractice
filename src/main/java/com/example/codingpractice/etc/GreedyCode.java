package com.example.codingpractice.etc;

public class GreedyCode {

    public GreedyCode() {

    }

    //채울 단위가 각각 배수인 경우 greedy를 사용 가능
    public void greedy() {

        int money = 1000;
        int[] array = {500, 100, 50, 10, 5, 1};
        int idx = 0;
        int ans = 0;

        while(money!=0) {
            int change = money / array[idx];
            money -= change * array[idx++];
            ans += change;
        }
        System.out.println(ans);
    }
}
