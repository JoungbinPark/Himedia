package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            //et.checkEnoughMoney(20000,30000);
            et.checkEnoughMoney(-20000,30000);




            System.out.println("정상동작하니?");

        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException");
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);

        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException");
            System.out.println(e.getMessage());

        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNegativeException");
            System.out.println(e.getMessage());

        } finally {
            /* 에외 발생 여부와 상관없이 실행 */
            System.out.println("finally 동작");
        }

        System.out.println("프로그램을 종료합니다. ");
    }
}
