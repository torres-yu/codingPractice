package com.example.codingpractice.etc;

import java.util.HashMap;

public class AnaGram {

    public void anaGram(String d1, String d2) {

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        int cnt = 0;
        for(char one : d1.toCharArray()) {
            map1.put(one, map1.getOrDefault(one, 0) +1);
        }

        for(char one : d2.toCharArray()) {
            map2.put(one, map2.getOrDefault(one, 0) +1);
        }

        for(char i : map1.keySet()) {

            for(char j : map2.keySet()) {

                if(map1.get(i)==map2.get(j)) cnt++;
            }
        }

        if(cnt==map1.size()) System.out.println("YES");
        else System.out.println("NO");

    }
}
