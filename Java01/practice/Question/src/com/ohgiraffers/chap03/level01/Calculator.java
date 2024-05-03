package com.ohgiraffers.chap03.level01;

public class Calculator {
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public int sumTwoNumber(int first, int second){
        return first+second;
    }

    public int minusTwoNumber(int first, int second){
        return first-second;
    }

    public int multiTwoNumber(int first, int second){
        return first*second;
    }
    public int divideTwoNumber(int first, int second){
        return first/second;
    }
}
