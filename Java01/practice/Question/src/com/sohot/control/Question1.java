package com.sohot.control;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        /* 점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격을 출력한다.
        * 4학년의 경우 70점 이상이여아 합격한다. */
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        int score = sc.nextInt();
        System.out.print("학년를 입력하세요 : ");
        int grade = sc.nextInt();

        if(score>=70){
            System.out.println("합격");
        } else if (score>=60 && grade<4) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
    }
}
