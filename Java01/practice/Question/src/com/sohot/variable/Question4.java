package com.sohot.variable;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        // 정수 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int firstNum = sc.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int secondNum = sc.nextInt();

        // 조건문을 통해 출력
        if(firstNum%2==0 && secondNum%2==0){
            System.out.println("두 정수 모두 짝수입니다.");
        } else {
            System.out.println("하나 이상의 정수가 홀수입니다. ");
        }
    }
}
