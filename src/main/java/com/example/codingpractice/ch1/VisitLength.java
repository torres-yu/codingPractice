package com.example.codingpractice.ch1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

//방문길이
public class VisitLength {

    public int solution(String dirs) {

        //좌표의 범위
        final int minX = -5;
        final int maxX = 5;
        final int minY = -5;
        final int maxY = 5;

        //직전위치
        int[] prePoint = new int[2];
        //현재위치
        int[] nowPoint = new int[2];

        HashSet<MoveHistory> histories = new HashSet<>();

        for(char dir : dirs.toCharArray()) {

            //좌표의 이동
            if(dir=='U' && nowPoint[1] < maxY) nowPoint[1]++;
            else if(dir=='D' && nowPoint[1] > minY) nowPoint[1]--;
            else if(dir=='R' && nowPoint[0] < maxX) nowPoint[0]++;
            else if(dir=='L' && nowPoint[0] > minX) nowPoint[0]--;

            //움직인 경우 저장
            if(!Arrays.equals(prePoint, nowPoint)) {
                //[왼쪽->오른쪽 == 오른쪽->왼쪽]이므로 밑으로 이동한 케이스와 오른쪽으로 이동한 케이스는 이력을 반대로 저장함)
                if(dir=='D' || dir=='R')
                    histories.add(new MoveHistory(nowPoint, prePoint));
                else
                    histories.add(new MoveHistory(prePoint, nowPoint));

                prePoint[0] = nowPoint[0];
                prePoint[1] = nowPoint[1];
            }
        }

        return histories.size();
    }
}

class MoveHistory {

    private int[] prePoint = new int[2];
    private int[] nowPoint = new int[2];

    MoveHistory(int[] prePoint, int[] nowPoint) {
        this.prePoint[0] = prePoint[0];
        this.prePoint[1] = prePoint[1];
        this.nowPoint[0] = nowPoint[0];
        this.nowPoint[1] = nowPoint[1];
    }

    @Override
    public boolean equals(Object o){

        MoveHistory mv = (MoveHistory) o;
        return Arrays.equals(prePoint, mv.prePoint) && Arrays.equals(nowPoint, mv.nowPoint);
    }

    @Override
    public int hashCode(){

        return Objects.hash(prePoint[0], prePoint[1], nowPoint[0], nowPoint[1]);
    }
}
