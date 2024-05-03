package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args){
        /* 수업목표. 메소드 전달인자와 매개변수에 대해 이해하고 메소드 호출 시 사용할 수 있다. */
        /* 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
        * 지금까지 우리가 배운 변수는 지역변수에 해당
        * */

        /* 변수의 종류
        * 1. 지역 변수
        * 2. 매개 변수
        * 3. 전역(필드) 변수
        * 4. 클래스(static) 변수
        * */

        /* 지역변수는 선언한 메소드블럭 내에서만 사용가능(지역변수의 스코프)
        *  다른 메소드간 서로 공유해야하는 값이 존재할 경우 메소드 호출시 괄호를 이용해 값을 전달 가능.
        *  이 때 전달하는 값을 전달인자(argument)라 하고
        * 메소드 선언부 괄호 안에 전달인자를 받기 위해 선언하는 변수를 매개변수(parameter)라 한다.
        * */

        Application3 app3 = new Application3();
        /* 전달인자와 매개변수를 이용한 메소드 호출 테스트 */
        /* 1. 전달인자로 값 전달 테스트 */
        app3.testMethod(40);
        //app3.testMethod("40");             //매개변수는 int형인데 전달인자가 String형이라 호출할 수 없다.
        //app3.testMethod(30,40,50);         //매개변수는 1개지만 전달인자가 3개라 호출할 수 없다.

        /* 2. 변수에 저장한 값 전달 테스트 */
        /* 2-1. 변수에 저장한 값을 이용하여 값을 전달할 수 있다. */
        int age = 20;
        app3.testMethod(age);

        /* 2-2. 자동형변환을 이용하여 값을 전달할 수 있다. */
        byte byteAge = 10;
        app3.testMethod(byteAge);

        /* 2-3. 강제형변환을 이용하여 값을 전달할 수 있다. */
        long longAge = 80;
        //app3.testMethod(longAge);         //자동형변환이 안되서 에러
        app3.testMethod((int)longAge);      //데이터 손실에 주의

        /* 2-4. 연산결과를 이용하여 값을 전달할 수 있다. */
        app3.testMethod(age+3);

    }
    public void testMethod(int age){
        System.out.println("당신의 나이는 " + age + "세 입니다.");

    }

}
