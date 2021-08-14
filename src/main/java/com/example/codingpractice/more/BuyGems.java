package com.example.codingpractice.more;

import java.util.*;

public class BuyGems {

    private int[] answer;

    public int[] solution(String[] gems) {

        answer = new int[2];

        Map<String, Integer> gemMap = new HashMap<>();
        Queue<String> buy = new LinkedList<>();
        Set<String> numOfGem = new HashSet<>();
        for (String gem : gems) numOfGem.add(gem);

        int minPoint = 0;
        int start = 0;
        int buyLength = gems.length;

        for (int i = 0; i < gems.length; i++) {

            if (gemMap.containsKey(gems[i]))
                gemMap.put(gems[i], gemMap.get(gems[i]) + 1);
            else
                gemMap.put(gems[i], 1);

            buy.offer(gems[i]);

            while (true) {
                String gem = buy.peek();
                if (gemMap.get(gem) > 1) {
                    gemMap.put(gem, gemMap.get(gem) - 1);
                    buy.poll();
                    minPoint++;
                } else {
                    break;
                }
            }

            if (gemMap.size() == numOfGem.size() && (buyLength >= buy.size())) {
                buyLength = buy.size();
                start = minPoint;
            }
        }

        answer[1] = start + buyLength;
        answer[0] = start + 1;

        return answer;
    }
}
