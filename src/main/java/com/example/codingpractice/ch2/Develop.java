package com.example.codingpractice.ch2;

import java.util.ArrayList;
import java.util.List;

//2-3 기능개발
public class Develop {

    public int[] solution(int[] progresses, int[] speeds) {

        List<Schedule> scheduleList = new ArrayList<>();
        List<Deployment> deployments = new ArrayList<>();


        //1. 배포 목록 객체 생성
        for(int i = 0 ; i < progresses.length ; i++)
            deployments.add(new Deployment(progresses[i], speeds[i]));

        //2. 배포 스케줄링
        //inx = 0
        Schedule schedule = new Schedule(1, deployments.get(0).getRemainDay());
        //inx = 1 ~ (n-1)
        for(int i = 1 ; i < deployments.size() ; i++) {

            if(schedule.getDeployDay() < deployments.get(i).getRemainDay()) {
                scheduleList.add(schedule);
                schedule = new Schedule(0, deployments.get(i).getRemainDay());
            }
            schedule.setDeployCount();
        }
        //inx = n
        scheduleList.add(schedule);

        return scheduleList.stream().mapToInt(Schedule::getDeployCount).toArray();
    }
}

class Schedule {

    private int deployCount;
    private int deployDay;

    Schedule(int deployCount, int deployDay) {
        this.deployCount = deployCount;
        this.deployDay = deployDay;
    }

    public int getDeployDay() {
        return deployDay;
    }

    public int getDeployCount() {
        return deployCount;
    }

    public void setDeployCount() {
        this.deployCount++;
    }
}

class Deployment {

    private int progress;
    private int speed;
    private int remainDay;

    Deployment(int progress, int speed) {
        this.progress = progress;
        this.speed = speed;
        calDeployDay();
    }

    public int getRemainDay() {
        return remainDay;
    }

    private void calDeployDay() {
        remainDay = (100-progress)/speed;
        if((100-progress)%speed!=0) remainDay++;
    }
}
