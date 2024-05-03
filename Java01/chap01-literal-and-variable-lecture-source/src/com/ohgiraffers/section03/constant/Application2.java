package com.ohgiraffers.section03.constant;

public class Application2 {
    public static void main(String[] args){

        /*수업목표. 상수의 명명규칙에 대해 이해할 수 있다. */
        /* 상수의 명명규칙은 변수의 명명규칙과 컴파일에러를 발생시키는 규칙은 동일하다.
        * 단 개발자끼리의 암묵적인 규칙이 일부 차이가 있다.
        * 1. 모든 문자는 영문대문자 또는 숫자만 사용한다.
        * 2. 단어와 단어의 연결 사이에는 언더스코어(_)를 사용한다.
        * */

        /* 1. 모든 문자는 영문대문자 또는 숫자만 사용한다. */
        final int AGE1 = 20;
        final int AGE2 = 30;
        final int age3 = 40;    //상수를 변수와 구분하기 위해 만들어진 규칙

        /* 2. 단어와 단어의 연결은 언더스코어(_)를 사용한다. */
        final int MAX_AGE = 60;
        final int MIN_AGE = 20;
        final int minAge = 30;  //camelCase 사용이 가능하지만 변수와 구분하기 위해 사용하지 않는다.

    }
}
