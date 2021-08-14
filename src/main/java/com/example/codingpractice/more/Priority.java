package com.example.codingpractice.more;

import java.util.*;

public class Priority {

    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        List<Integer> integers = new ArrayList<>();

        for(int i = 0 ; i < operations.length ; i++) {

            String[] tempArray = operations[i].split(" ");
            char type = tempArray[0].charAt(0);
            int data = Integer.parseInt(tempArray[1]);

            if(type=='I') {

                integers.add(data);

            } else if(type=='D') {

                if(integers.size()>0) {
                    if (data == -1) {
                        integers.remove(0);
                    } else {
                        integers.remove(integers.size() - 1);
                    }
                }
            }

            Collections.sort(integers);
        }

        if(integers.isEmpty()) return new int[]{0,0};
        else {
            answer[1] = integers.get(0);
            answer[0] = integers.get(integers.size()-1);
        }

        return answer;
    }
}
