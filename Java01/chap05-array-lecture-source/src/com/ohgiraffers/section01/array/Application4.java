package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args){
        /* 수업목표 : 배열을 사용하는 예시를 이해하고 적용할 수 있다. */
        /* 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램을 만들어보세요. */
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];

        for(int i = 0; i<scores.length; i++){
            System.out.print((i+1)+"번째 학생의 점수를 입력하세요 : ");
            scores[i] = sc.nextInt();
        }

        double sum = 0.0;
        for(int i=0; i< scores.length; i++){
            sum += scores[i];
        }
        System.out.println("합계 : "+ sum);

        double avg = 0.0;
        avg = sum/scores.length;
        System.out.println("평균 : "+ avg);
    }
}
