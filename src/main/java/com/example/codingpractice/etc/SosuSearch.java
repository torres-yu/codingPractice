package com.example.codingpractice.etc;

public class SosuSearch {

    SosuSearch() {}

    public void sosuSearch() {

        int answer = 0;

        int[] number = new int[21];

        //2부터 n까지의 수를 배열에 넣는다.
        for(int i=2; i<21; i++) {
            number[i] = i;
        }

        //2부터 시작해서 그의 배수들을 0으로 만든다.
        //후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
        for(int i=2; i<21; i++) {
            if(number[i]==0) continue;

            for(int j= 2*i; j<21; j += i) {
                number[j] = 0;
            }
        }

        //배열에서 0이 아닌 것들의 개수를 세준다.
        for(int i=0; i<number.length; i++) {
            if(number[i]!=0) {
                System.out.print(number[i]+" ");
                answer++;
            }
        }
    }
}
