package com.example.codingpractice.ch3;

import java.util.LinkedList;
import java.util.Queue;

public class MapSearch {

    boolean[][] marked;

    public int solution(int[][] maps) {

        marked = new boolean[maps.length][maps[0].length];

        return bfs(maps);
    }

    private int bfs(int[][] maps) {

        Queue<Point> pointQueue = new LinkedList<>();
        pointQueue.offer(new Point(0,0,1));

        //왼쪽 오른쪽 변화에 따른 처리를 위한 배열
        int[] moveX = {-1, 1, 0, 0};
        int[] moveY = {0, 0, -1, 1};

        while (!pointQueue.isEmpty()) {

            Point po = pointQueue.poll();
            if(po.getPointX()==maps[0].length-1 && po.getPointY()==maps.length-1) return po.getCnt();

            for(int i = 0 ; i < 4 ; i++) {

                Point nextPo = new Point(po.getPointX()+moveX[i], po.getPointY()+moveY[i], po.getCnt()+1);
                if(nextPo.getPointX() >= 0 && nextPo.getPointX() < maps[0].length && nextPo.getPointY() >= 0 && nextPo.getPointY() < maps.length) {

                    if(marked[nextPo.getPointY()][nextPo.getPointX()]) continue;
                    if(maps[nextPo.getPointY()][nextPo.getPointX()]==1) {
                        pointQueue.offer(nextPo);
                        marked[nextPo.getPointY()][nextPo.getPointX()] = true;
                    }
                }
            }
        }

        return -1;
    }

    class Point {

        private int pointX;
        private int pointY;
        private int cnt;

        Point(int pointX, int pointY, int cnt) {
            this.pointX = pointX;
            this.pointY = pointY;
            this.cnt = cnt;
        }

        public int getCnt() {
            return cnt;
        }

        public int getPointX() {
            return pointX;
        }

        public int getPointY() {
            return pointY;
        }
    }
}
