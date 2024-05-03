package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args){

        /* 수업목표 : 여러 형태의 값들을 출력할 수 있다 */

        /* 1. 숫자 형태의 값 */
        /* 1-1. 정수 형태의 값 */
        System.out.println(1234);
        /* 1-2. 실수 형태의 값 */
        System.out.println(1.234);

        /* 2. 문자 형태의 값 */
        System.out.println('a'); //문자형태의 값은 홀따옴표(single potential)로 감싸준다.
        //System.out.println('ab'); //두개 이상의 문자(character)는 취급하지 않기에 에러가 발생
        //System.out.println(''); //아무 문자도 적지 않으면 에러가 발생
        System.out.println('1'); //숫자값이지만 홀따옴표로 감싸져 있으면 문자 1로 판단한다.
        System.out.println('남'); //한글도 한 문자면 가능

        /* 3. 문자열 형태의 값 출력 */
        System.out.println("안녕하세요"); //문자 여러개를 나열된 형태를 말하며 쌍따옴표(double potential)로 감싸준다.
        System.out.println("123"); // 정수이지만 쌍따옴표로 감싸져 있기 때문에 문자열로 보아야 한다.
        System.out.println(""); // 아무것도 없는 빈 쌍따옴표도 문자열로 취급
        System.out.println("a"); // 한 개의 문자도 쌍따옴표로 감싸면 문자열이다.

        /* 4. 논리 형태의 값 */
        // 참(true) or 거짓(false) 형태의 값을 논리형이라고 한다
        System.out.println(true); // 뱀은 파충류인가요?
        System.out.println(false); // 뱀은 식물인가요?

    }
}
