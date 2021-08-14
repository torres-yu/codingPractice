package com.example.codingpractice.ch2;

import java.util.HashMap;

// 2.6 위장
public class Disguise {

    public int solution(String[][] clothes) {

        int answer = 1;

        //1. 같은 이름으로 정렬한다.
        HashMap<String, Integer> clothMap = new HashMap<>();

        for(String[] cloth : clothes) {
            if(clothMap.containsKey(cloth[1]))
                clothMap.put(cloth[1], clothMap.get(cloth[1])+1);
            else
                clothMap.put(cloth[1], 1);
        }

        //2. 정렬된 데이터로 조합을 진행한다.
        for(Integer numClothes : clothMap.values())
            answer *= (numClothes + 1);

        answer--;

        //3. 진행된 갯수를 리턴한다.
        return answer;
    }
}
