package com.ohgiraffers.section03.interfaceimplements;

public class Product extends Object implements InterProduct, java.io.Serializable{
    /* 클래스에서 인터페이스를 상속받을 때는 implements 키워드를 사용한다.
    * 또한 인터페이스는 여러 개를 상속 받을 수 있으며
    * extends로 다른 클래스를 상속받는 경우에도 그것과 별개로 인터페이스 추가 상속이 가능해진다.
    * 단 extends 키워드를 앞에 작성하고 implements를 뒤에 작성(순서에 유의)*/

    @Override
    public void monStaticMethod() {
        System.out.println("Product의 nonStaticMethod 오버라이딩한 메소드 호출됨...");

    }

    @Override
    public void absMethod() {
        System.out.println("Product의 absMethod를 오버라이딩한 메소드 호출됨...");

    }

/*  // static 메소드는 오버라이딩할 수 없다.
    @Override
    public static void staticMethod(){}
*/

    /*defaullt 메소드는 인터페이스에서만 작성 가능하다. */
    //public default void defaultMethod(){}


        @Override
    public void defaultMethod() {
            System.out.println("Product의 defaultMethod 오버라이딩한 메소드 호출됨");
    }
}
