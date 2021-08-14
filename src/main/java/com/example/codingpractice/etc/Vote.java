package com.example.codingpractice.etc;

import java.util.HashMap;

public class Vote {

    public void solution(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()) {

            map.put(x, map.getOrDefault(x,0)+1);
        }
        int maxValue = 0;
        for(char x : map.keySet()) {

            if(map.get(x)!=null && map.get(x) > maxValue) maxValue = map.get(x);
        }
        System.out.println(maxValue);
    }
}
