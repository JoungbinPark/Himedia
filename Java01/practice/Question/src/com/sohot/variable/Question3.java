package com.sohot.variable;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] height = new double[3];

        //키 입력
        for(int i =0; i<height.length; i++){
            System.out.print((i+1)+"번 학생의 키 입력 : ");
            height[i] = sc.nextDouble();
        }

        //총합 계산
        double sum = 0.0;
        for(int i =0; i< height.length; i++){
            sum += height[i];
        }

        //평균 계산 및 정수형 형변환
        int avg = (int) sum/ height.length;

        System.out.println("키의 평균 : "+avg);
    }
}
