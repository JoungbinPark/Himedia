package com.ohgiraffers.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {
        /* Wrapper클래스에 대해 이해할 수 있다. */
        /*
        * 상황에 따라 기본타입의 데이터를 인스턴스화해야 하는 경우가 발생한다.
        * 이 때 기본타입의 데이터를 먼저 인스턴스로 변환 후 사용해야하는데
        * 8가지의 기본타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를 Wrapper Class 라 한다. */

        /*     기본타입         래퍼클래스
        *       byte            Byte
        *       short           Short
        *       int             Integer
        *       long            Long
        *       float           Float
        *       double          Double
        *       char            Character
        *       boolean         Boolean
        * */

        /* 박싱(Boxing)과 언박싱(Unboxing)
        * 기본 타입을 레퍼런스의 인스턴스로 인스턴스화 하는 것을 박싱이라고 하며
        * 래퍼클래스 타입의 인스턴스를 기본타입으로 변경하는 것을 언박싱이라 한다.
        * */

        int intValue = 20;
        Integer boxingNum1 = new Integer(intValue);     //인스턴스화 - 박싱  // 생성자 이용
        Integer boxingNum2 = Integer.valueOf(intValue); // static 메소드를 이용

        int unBoxingNum1 = boxingNum1.intValue();       //언박싱   //intvalue()메소드 이용


        /* 오토박싱(autoBoxing)과 오토언박싱(autoUnBoxing)
        * JDK 1.5 부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리해준다.
        * 이런 자동화된 박싱과 언박싱을 오토박싱, 오토언박싱이라 한다. */

        Integer boxingNum3 = intValue;                  //오토박싱
        int unBoxingNum3 = boxingNum3;                  //오토언박싱

        int inum = 20;
        Integer integerNum1 = new Integer(20);
        Integer integerNum2 = new Integer(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        System.out.println("int와 Integer 비교 : " + (inum == integerNum1));   //true (박싱된 값과 int값이 비교 가능)
        System.out.println("int와 Integer 비교 : " + (inum == integerNum3));   //true

        System.out.println("Integer와 Integer 비교 : " + (integerNum1 == integerNum2));    //false (박싱된 두 인스턴스는 서로 다른 인스턴스)

        System.out.println("equals()을 이용한 Integer와 Integer 비교 : " + (integerNum1.equals(integerNum2)));     //true

        System.out.println("valuesOf() : " + (Integer.valueOf(123) == Integer.valueOf(123)));



    }
}
