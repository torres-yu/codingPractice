package com.example.codingpractice.ch1;

import java.util.regex.Pattern;

//스킬트리 문제 선행스킬 목록만 뽑아서 하는 방식으로
public class SkillTree2 {

    public int solution(String skill, String[] skill_trees) {

        int answer = 0;
        String inPreSkills;

        for(String skill_tree : skill_trees) {

            inPreSkills="";

            for(String s : skill_tree.split("")) {
                if(skill.contains(s))
                    inPreSkills += s;
            }

            if(skill.startsWith(inPreSkills))
                answer++;
        }
        return answer;
    }
}
