package com.ohgiraffers.section01.extend;

import java.sql.SQLOutput;

public class Car {
    private boolean runningStatus;
    public Car(){
        System.out.println("Car 클래스 기본생성자 호출됨...");
    }

    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵!빵!");
        } else{
            System.out.println("주행 중이 아닌 상태에선 경적을 울릴 수 없습니다.");
        }
    }

    //private boolean isRunning(){      private 접근제어자를 쓰면 상속이 안됨
    protected boolean isRunning(){
        return runningStatus;
    }
    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

}
