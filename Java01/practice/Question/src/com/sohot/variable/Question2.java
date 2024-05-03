package com.sohot.variable;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /* 키보드로 원의 반지름 값을 정수형으로 입력받고 원의 둘레와 면적을 계산*/

        //스캐너 호출, 반지름값 input
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 반지름 입력 : ");
        int radius = sc.nextInt();
        final double pi = 3.14;

        // 원의 둘레, 면적 계산
        double round = 2*radius*pi;
        double area = radius*radius*pi;

        // 출력
        System.out.println("반지름이 "+radius+"인 원의 둘레 : " + round);
        System.out.println("반지름이 "+radius+"인 원의 넒이 : " + area);
    }
}
