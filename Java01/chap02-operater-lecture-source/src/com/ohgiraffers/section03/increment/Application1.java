package com.ohgiraffers.section03.increment;

public class Application1 {
    public static void main(String [] args){
        /* 증감연산자에 대해 이해하고 활용할 수 있다. */
        /* 증감연산자
        * 피연산자의 앞 or 뒤에 사용 가능
        * '++' : 1 증가
        * '--' : 1 감소
        * */

        /* 1. 증감연산자를 단독으로 사용 */
        /* 단항으로 사용될 때는 1증가/1감소의 의믜 */
        int num = 20;
        System.out.println("num:"+num);
        num++;          //1 증가
        System.out.println("num:"+num);
        ++num;          //1 증가
        System.out.println("num:"+num);
        num--;          //1 감소
        System.out.println("num:"+num);
        --num;          //1 감소
        System.out.println("num:"+num);

        /* 증감연산자를 다른 연산자와 사용 */
        /* 주의사항
        * 증감연산자는 다른 연산자와 함께 사용할 때 의미가 달라진다.
        * 다른 연산자와 함께 사용할 때 증감연산자의 의미
        * 'num++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자 값을 1 증가
        * '++num' : 피연산자의 값을 먼저 1 증가시킨 후 다른 연산을 진행함
        * */

        int firstNum = 20;
        int result1 = firstNum++ * 3;                   //대입연산까지 끝난 뒤 1 증가
        System.out.println("result1 : " + result1);
        System.out.println("firstNum : " + firstNum);

        int secondNum = 20;
        int result2 = ++secondNum * 3;                  //1 증가 후 연산 진행
        System.out.println("result2 : " + result2);
        System.out.println("secondNum : " + secondNum);

        int num1 = 10;
        int result3 = --num1 * 3;
        System.out.println("result3 : " + result3);
        System.out.println("num1 : " + num1);

        int num2 = 10;
        int result4 = num2-- * 3;
        System.out.println("result4 : " + result4);
        System.out.println("num2 : " + num2);









    }
}
