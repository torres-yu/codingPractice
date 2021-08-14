package com.example.codingpractice.etc;

import java.util.*;

//문자열 내 마음대로 정렬하기
public class HashOrder {

    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        HashMap<Character, String> hashMap = new HashMap<>();
        for(String s : strings) {
            hashMap.put(s.charAt(n), s);
        }

        // 키로 정렬
        Object[] mapkey = hashMap.keySet().toArray();
        Arrays.sort(mapkey);
        Iterator<Character> keys = hashMap.keySet().iterator();
        while( keys.hasNext() ){
            Character key = keys.next();
            System.out.println(key+"  "+hashMap.get(key));
        }

        List<Character> keySetList = new ArrayList<>(hashMap.keySet());

        // 오름차순
        System.out.println("------value 오름차순------");
        Collections.sort(keySetList, Comparator.comparing(hashMap::get));

        for(Character key : keySetList) {
            System.out.println("key : " + key + " / " + "value : " + hashMap.get(key));
        }

        return answer;
    }
}
