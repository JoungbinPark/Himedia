package com.ohgiraffers.section07.kindsofvariable;

public class KindsOfVariable {  //클래스 영역의 시작
    /* 수업목표 : 다양한 변수들을 이해하고 사용할 수 있다. */
    /*
    * 클래스 영역에 작성하는 변수를 필드라고 한다.
    * 필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
    * */

    /* non-static field를 인스턴스변수라고 한다.(인스턴스 생성 시점에서 사용가능한 변수라는 의미) */
    private int globalNum;

    /* static field를 정적필드(클래스변수)라고 한다. 정적(클래스)영역에 생성되는 변수라는 의미다. */
    private static int staticNum;

    public void testMethod(int num){     //메소드 영역의 시작
        /*
        * 메소드 영역에서 작성하는 변수를 지역변수라 한다.
        * 메소드 괄호 안에 선언하는 변수를 매개변수라 한다.
        * 매개변수도 일종의 지역변수라 생각하면 된다.
        * 지역변수도 매개변수도 모두 메소드 호출 시 stack을 할당받아 stack에 생성된다. */
        int localNum;
        System.out.println("num = "+ num);      //매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화가 필요없음.

        /* 지역변수는 선언 외에 호출하기 위해선 반드시 초기화를 해야한다. */
        //System.out.println("localNum = " + localNum);           // 메소드 내에서 할당이 없으면 컴파일오류가 발생
        System.out.println("globalNum = " + globalNum);         // 기본값(0)    전역변수는 클래스 전역에서 사용 가능
        System.out.println("staticNum = " + staticNum);         // 기본값(0)
    }

    public void testMethod2(){
        //System.out.println("localNum = " + localNum);           //지역변수는 해당 지역(메소드)에서만 사용가능
        System.out.println("globalNum = " + globalNum);
        System.out.println("staticNum = " + staticNum);           // 전역변수는 다른 메소드에서도 사용 가능
    }




}
