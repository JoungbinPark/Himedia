package com.ohgiraffers.section01.exception;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {

            //et.checkEnoughMoney(10000,50000);                 //오류 없을 시
            et.checkEnoughMoney(50000,10000);       //오류 있을 시
            System.out.println("===== 상품 구입 가능 =====");


        } catch (Exception e) {

            System.out.println("===== 상품 구입 불가! =====");
        }

        System.out.println("프로그램을 종료합니다. ");


    }
}
