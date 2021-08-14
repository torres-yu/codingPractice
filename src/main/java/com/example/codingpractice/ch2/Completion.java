package com.example.codingpractice.ch2;

import java.util.HashMap;
import java.util.Map;

// 2-5 완주하지 못한 선수
public class Completion {

    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> par = new HashMap<>();
        for(String p : participant) {
            if(par.containsKey(p)) par.put(p, par.get(p) +1 );
            else par.put(p, 1);
        }

        for(String c : completion) {
            if(par.containsKey(c)) par.put(c, par.get(c) -1);
        }

        for(Map.Entry<String, Integer> elem : par.entrySet() ){
            if(elem.getValue()==1) return elem.getKey();
        }

        return "";
    }
}
