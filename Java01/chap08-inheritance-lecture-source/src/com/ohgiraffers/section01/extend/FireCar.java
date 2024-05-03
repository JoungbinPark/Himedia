package com.ohgiraffers.section01.extend;

import org.w3c.dom.ls.LSOutput;

public class FireCar extends Car {
    public FireCar(){
        super();
        System.out.println("FireCar 클래스의 기본 생성자가 호출됨...");
    }

    @Override
    public void soundHorn() {
        if(isRunning()){
            System.out.println("빠아아아아앙!!!빠아아아아앙!!!");
        }else{
            System.out.println("소방차가 앞으로 갈 수 없습니다. 비키세요 비켜~~!");
        }

    }
    public void sprayWater(){
        System.out.println("불난 곳에 물을 뿌립니다.");
    }

}
