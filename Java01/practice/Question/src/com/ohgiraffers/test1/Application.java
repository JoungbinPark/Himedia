package com.ohgiraffers.test1;

public class Application {
    public static void main(String[] args) {
        // 1. 기본자료형 8가지를 선언 및 초기화
        // 정수형
        byte bnum = 10;
        short snum = 20;
        int inum = 30;
        long lnum = 40;

        // 실수형
        float fnum = 10.0f;
        double dnum = 20.0;

        // 문자형
        char ch = 'a';

        // 논리형
        boolean isTrue = true;

        // 2. 정수 int값을 long타입과 합함
        long sum = inum + lnum;

        // 3. 삼항연산자를 이용해 sum의 합계를 0보다 클 때 양수입니다. 0보다 작을 때 음수입니다를 표기
        String result = (sum==0)? "0입니다." : ((sum>0)? "양수입니다." : "음수입니다");
    }




}
