package com.ohgiraffers.chap03.level01;

public class Application01 {
    public static void main(String[] args){
        // Calculator 객체 생성
        Calculator calc = new Calculator();
        // 호출 확인
        calc.checkMethod();
        // 합
        int sum = calc.sumTwoNumber(10, 20);
        System.out.println("10과 20의 합 : " + sum);
        // 차
        int minus = calc.minusTwoNumber(10, 5);
        System.out.println("10과 5의 차 : " + minus);

        int multi = calc.multiTwoNumber(10, 5);
        System.out.println("10과 5의 곱 : " + multi);

        int divide = calc.divideTwoNumber(10, 5);
        System.out.println("10을 5로 나눈 후의 몫 : " + divide);





    }
}
