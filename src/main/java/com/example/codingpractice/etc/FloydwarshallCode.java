package com.example.codingpractice.etc;

public class FloydwarshallCode {

    public FloydwarshallCode() {

    }

    public void floydwarshall() {

        final int INF = 999999;
        int[][] dis = {
                {0, 1, INF, 4, 5},
                {INF, 0, 3, 2, 1},
                {1, INF, 0, 5, 3},
                {INF, INF, 4, 0, 2},
                {4, INF, 1, 7, 0}
        };

        for(int n = 0 ; n <dis.length; n++) {

            for(int st = 0 ; st< dis.length ; st++) {

                for(int en = 0 ; en< dis.length ; en++) {

                    //기존 경로가 긴 경우 갱신해 준다.
                    if(dis[st][en] > dis[st][n] + dis[n][en]) {
                        dis[st][en] = dis[st][n] + dis[n][en];
                    }
                }
            }
        }

        for(int i = 0 ; i < dis.length ; i++) {
            for(int j = 0 ; j < dis.length ; j++) {
                System.out.print(dis[i][j] +" ");
            }
            System.out.print("\n");
        }
    }
}
