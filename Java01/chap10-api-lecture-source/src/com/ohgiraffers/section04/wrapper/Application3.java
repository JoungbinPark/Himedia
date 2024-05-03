package com.ohgiraffers.section04.wrapper;

public class Application3 {
    /* 수업목표 : 기본자료형의 값을 문자열로 변경할 수 있다. */
    /*
    * valueOf() : 기본자료형을 Wrapper클래스 타입으로 변환시키는 메소드
    * toString() : 필드값을 문자열로 반환하는 메소드
    * */

    //toString
    String b = Byte.valueOf((byte)1).toString();
    String s = Short.valueOf((short)2).toString();
    String i = Integer.valueOf(4).toString();
    String l = Long.valueOf(8L).toString();
    String f = Float.valueOf(4.0f).toString();
    String d = Double.valueOf(8.0).toString();
    String bl = Boolean.valueOf(true).toString();
    String ch = Character.valueOf('a').toString();

    /* String 클래스의 valueOf를 사용할 수 있다. */
    String str1 = String.valueOf(10);

    /* 문자열 합치기를 통해 String타입으로 변환할 수 있다. */

    String str2 = 123 +"";


}
