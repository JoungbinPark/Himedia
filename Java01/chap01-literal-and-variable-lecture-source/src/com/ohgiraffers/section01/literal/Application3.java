package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args){

        /* 수업목표 : 문자열 합치기 결과를 예측하고 사용할 수 있다. */
        /* 1. 두 개의 문자열 합치기 */
        System.out.println("=====두 개의 문자열 합치기=====");
        System.out.println(9+9); //18
        System.out.println("9"+"9"); //99
        System.out.println("9"+9); //99
        System.out.println(9+"9"); //99

        /* 2. 세 개의 문자열 합치기 */
        System.out.println("=====세 개의 문자열 합치기=====");
        System.out.println("9"+9+9); //999
        System.out.println(9+"9"+9); //999
        System.out.println(9+9+"9"); //189 //왼쪽 연산부터 수행하기 때문
        System.out.println("9"+(9+9)); //918 //괄호의 내용부터 연산 수행

        /* 3. 문자열 합치기 응용 */
        /* 10과 20의 사칙연산 결과를 출력하세요 */
        System.out.println("=====10과 20의 사칙연산=====");
        System.out.println(10+20);
        System.out.println(10-20);
        System.out.println(10*20);
        System.out.println(10/20);
        System.out.println(10%20);

        System.out.println("=====10과 20의 사칙연산 결과를 보기 좋게 출력=====");
        System.out.println("10+20="+(10+20)); //괄호로 묶지 않으면 문자열합치기로 출력됨
        System.out.println("10-20="+(10-20)); //괄호로 묶지 않으면 문자열의 차연산이 이루어져 오류 발생
        System.out.println("10*20="+10*20);
        System.out.println("10/20="+10/20);
        System.out.println("10%20="+10%20);
        /* 콘솔을 통해 결과값을 확인하는 수업이 진행될 예정 -> 문자열 합치기로 결과값 확인*/
        /*응용문제*/
        System.out.println("기차");   //기차
        System.out.println("기차"+"칙칙폭폭");    //기차칙칙폭폭
        System.out.println("기차"+123+45+"칙칙폭폭"); //기차12345칙칙폭폭
        System.out.println(123+45+"기차"+"출발");   //168기차출발



    }
}
