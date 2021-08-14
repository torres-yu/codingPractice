package com.example.codingpractice.more;

import java.util.*;

//프렌즈 사천성
public class Friends {

    public String solution(int m, int n, String[] board) {
        String answer = "";

        TreeMap<Character, Friend> friendMap = new TreeMap<>();

        char[][] boardChar = new char[m][n];
        for(int y = 0 ; y < board.length ; y++) {
            for(int x = 0 ; x < board[y].length() ; x++) {
                boardChar[y][x] = board[y].charAt(x);
            }
        }

        for(int i = 0 ; i < boardChar.length ; i++) {
            for(int j = 0 ; j < boardChar[i].length ; j++) {
                if(boardChar[i][j]!='.' && boardChar[i][j]!='*') {
                    if(friendMap.containsKey(boardChar[i][j])) {
                        friendMap.get(boardChar[i][j]).setPoX2(j);
                        friendMap.get(boardChar[i][j]).setPoY2(i);
                    } else {
                        friendMap.put(boardChar[i][j], new Friend(j, i));
                    }
                }
            }
        }

        int cnt = friendMap.size();
        while (cnt > 0) {

            Set<Character> keyMap = friendMap.keySet();
            boolean isChanged = false;

            for(Character key : keyMap){

                Friend friend = friendMap.get(key);
                if(friend.isClear()) continue;

                if(isDelLowFir(friend, boardChar) || isDelColFir(friend, boardChar)){

                    answer = answer+key;
                    isChanged = true;
                    friend.setClear(true);
                    cnt--;

                    boardChar[friend.getPoY1()][friend.getPoX1()] = '.';
                    boardChar[friend.getPoY2()][friend.getPoX2()] = '.';
                }
            }
            if(!isChanged) return "IMPOSSIBLE";
        }

        return answer;
    }

    private boolean isDelLowFir(Friend friend, char[][] boardChar) {

        if(friend.getPoX1() < friend.getPoX2()) {
            for(int i = friend.getPoX1() +1 ; i <= friend.getPoX2() ; i ++)
                if(boardChar[friend.getPoY1()][i]!='.') return false;
        } else {
            for(int i = friend.getPoX1() -1 ; i >= friend.getPoX2(); i --)
                if(boardChar[friend.getPoY1()][i]!='.') return false;
        }

        for(int i = friend.getPoY1() + 1 ; i < friend.getPoY2(); i ++)
            if(boardChar[i][friend.getPoX2()]!='.') return false;

        return true;
    }

    private boolean isDelColFir(Friend friend, char[][] boardChar) {

        for(int i = friend.getPoY1() + 1; i <= friend.getPoY2(); i ++)
            if(boardChar[i][friend.getPoX1()]!='.') return false;

        if(friend.getPoX1() < friend.getPoX2()) {
            for(int i = friend.getPoX1() + 1 ; i < friend.getPoX2(); i ++)
                if(boardChar[friend.getPoY2()][i]!='.') return false;
        } else {
            for(int i = friend.getPoX1() - 1 ; i > friend.getPoX2(); i --)
                if(boardChar[friend.getPoY2()][i]!='.') return false;
        }

        return true;
    }
}

class Friend {

    private int poX1;
    private int poY1;
    private int poX2;
    private int poY2;
    private boolean isClear;

    Friend(int poX1, int poY1) {
        this.poX1 = poX1;
        this.poY1 = poY1;
        isClear = false;
    }

    public void setPoX2(int poX2) {
        this.poX2 = poX2;
    }

    public void setPoY2(int poY2) {
        this.poY2 = poY2;
    }

    public int getPoX1() {
        return poX1;
    }

    public int getPoX2() {
        return poX2;
    }

    public int getPoY1() {
        return poY1;
    }

    public int getPoY2() {
        return poY2;
    }

    public boolean isClear() {
        return isClear;
    }

    public void setClear(boolean clear) {
        isClear = clear;
    }
}

