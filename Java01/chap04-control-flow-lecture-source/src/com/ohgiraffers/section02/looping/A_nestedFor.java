package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {
    public void printGugudanFromTwoToNice(){
        /* 수업목표 : 중첩된 for문의 흐름을 이해하고 적용할 수 있다. */
        /* for문 안에 for문을 이용할 수 있다. */

        for(int dan = 2; dan<10;dan++){
            System.out.println(dan+"단");

            for(int su = 1; su<10;su++){
                System.out.println(dan + " * " + su + " = " + (dan*su));
            }
            System.out.println(dan+"단 출력 완료");
        }
    }

    public void printGugudanOf(int dan) {
        /* 설명. 매개변수로 전달받은 단을 1 ~ 10까지 곱한 내용을 출력해준다. */
        for(int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printStarInputRowTime(){
        /* 학습목표 : 중첩된 for문을 이해할 수 있다. */

        /* 키보드로 정수 하나를 입력받아 한 행에 "*" 5개가 있는 열을 해당 정수만큼 출력하세요 */


        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력하세요 : ");
        int row = sc.nextInt();

        for(int i = 1; i<=row;i++){
            /* (해당 구문을 메소드로 받아보자)
            for(int j = 1; j<6;j++){
                System.out.print("*");
            }
             */
            printStar(5);
            System.out.println();
        }
    }

    public void printStar(int times){
        for(int i = 1; i<=times; i++){
            System.out.print("*");
        }
    }
    public void printSpace(int times){
        for(int i = 1; i<=times; i++){
            System.out.print(" ");
        }
    }


    public void printTriangleStars(){
        /*
        * 예시 : 정수를 입력하세요 : 5
        *       *
        *       **
        *       ***
        *       ****
        *       *****
        * */
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 줄 수를 입력하세요 : ");
        int row = sc.nextInt();
        for(int i = 1; i<=row;i++){
            printStar(i);
            System.out.println();
        }



    }
    // 정삼각형을 만들어보자
    public void printTriangleStars2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 줄 수를 입력하세요 : ");
        int row = sc.nextInt();
        for(int i = 1; i<=row; i++){
            printSpace(row-i);
            printStar(i*2-1);
            System.out.println();
        }


    }





}
