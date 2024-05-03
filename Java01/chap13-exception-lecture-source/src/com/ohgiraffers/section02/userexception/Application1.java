package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            //정상 작동 시
            et.checkEnoughMoney(30000,50000);
            //상품가격이 음수일 떄
            //et.checkEnoughMoney(-50000, 10000);
            //가진 돈이 음수일 때
            //et.checkEnoughMoney(50000,-60000);
            //가진 돈보다 상품가격이 더 비쌀 때
            //et.checkEnoughMoney(50000,30000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
