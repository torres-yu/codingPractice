package com.example.codingpractice.ch1;

//스킬트리
public class SkillTree {

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        //가능 유무 판단 변수
        boolean possible;
        int inx;

        for(String skill_tree : skill_trees) {

            possible = true;
            //첫번째 발견될 선행 스킬의 인덱스가 0이어야 하므로
            inx = 0;

            for(char st : skill_tree.toCharArray()) {
                //스킬트리에서 선행스킬 순서의 위치를 확인
                int checkP = skill.indexOf(st);
                //선행 스킬 목록이 없는 경우에는 일단 보류
                if (checkP > -1) {
                    //첫번째 발견된 값이 선행스킬이 아닌 경우 불가능 처리
                    if(checkP > inx) {
                        possible = false;
                        break;
                    } else {
                        //첫번째 선행스킬이 정상적인 경우 다음 스킬 찾기 위해 인덱스 업!
                        inx++;
                    }
                }
            }
            if(possible) answer++;
        }
        return answer;
    }
}
