package com.sohot.variable;


public class Question1 {
    public static void main(String[] args) {
        /* 정수, 실수, 문자, 문자열, 논리형 변수를 각각 선언하고,
        * 아래의 값으로 초기화한 후 그 값을 출력하고
        * 변수의 값을 변경하여 변경한 값을 출력하는 코드를 작성하시오.*/

        // 변수 선언
        int inum;
        double dnum;
        char ch;
        String str;
        boolean isTrue;

        //아래의 값으로 초기화 후 출력
        inum = 100;
        dnum = 234.567;
        ch = 'A';
        str = "Hello World";
        isTrue = true;

        System.out.println("inum = " + inum);
        System.out.println("dnum = " + dnum);
        System.out.println("ch = " + ch);
        System.out.println("str = " + str);
        System.out.println("isTrue = " + isTrue);

        //값 변경 및 변경한 값 출력
        inum = 10000;
        dnum = 567.123456789;
        ch = 'B';
        str = "Welcome to JAVA";
        isTrue = false;

        System.out.println("inum = " + inum);
        System.out.println("dnum = " + dnum);
        System.out.println("ch = " + ch);
        System.out.println("str = " + str);
        System.out.println("isTrue = " + isTrue);
    }
}
