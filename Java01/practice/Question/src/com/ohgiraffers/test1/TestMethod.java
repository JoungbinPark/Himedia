package com.ohgiraffers.test1;

import java.util.Scanner;

public class TestMethod {

    public double Calculator(double num1, double num2, String op){
        double result = 0;
        switch (op) {
            case "+": result = num1 + num2;
                break;
            case "-": result = num1 - num2;
                break;
            case "*": result = num1 * num2;
                break;
            case "/": result = num1 / num2;
                break;
            case "%": result = num1 % num2;
                break;

            default:
                System.out.println("올바른 연산자가 아닙니다.");
                break;
        }
        System.out.println("계산기 종료");
        return result;
    }

    public double CircleArea(){
        final double pi = 3.14;

        Scanner sc = new Scanner(System.in);
        System.out.println("반지름 값을 입력하세요 : ");
        double radius = sc.nextDouble();

        return radius;
    }

    public static String TestRandom(){
        int random = (int)(Math.random()*10)+1;
        String announce = "생성된 난수는 " + random + "입니다.";
        return announce;
    }
}
