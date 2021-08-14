package com.example.codingpractice.ch1;

import java.util.ArrayList;
import java.util.List;

public class Mouegosa {
    public int[] solution(int[] answers) {

        //학생 클래스 생성
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, new int[]{1, 2, 3, 4, 5}));
        students.add(new Student(2, new int[]{2, 1, 2, 3, 2, 4, 2, 5}));
        students.add(new Student(3, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}));

        //학생별 시험 진행
        students.forEach(st -> st.takeTest(answers));

        //학생별 시험 결과 중 최고점 찾기
        int highscore = students.stream().mapToInt(Student::getScore).max().getAsInt();

        //큰수를 맞은 학생을 뽑아 배열로 리턴
        return students.stream().filter(st -> st.getScore()==highscore).mapToInt(Student::getsId).toArray();
    }
}

class Student {

    private int sId;
    private int score;
    private int[] style;

    public int getsId() {
        return sId;
    }

    public int getScore() {
        return score;
    }

    Student(int sId, int[] style) {

        this.sId = sId;
        this.style = style;
    }

    void takeTest(int[] answers) {

        //찍기 순서
        int styleOrder = 0;

        //답변과 찍기순서를 비교하며 점수 책정
        for(int i = 0 ; i < answers.length ; i++) {
            if(i!=0 && i%style.length==0) styleOrder = 0;
            if(answers[i] == style[styleOrder]) score++;
            styleOrder++;
        }
    }
}
