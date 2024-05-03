package com.ohgiraffers.section01.method;

public class Application8 {
    public static void main(String[] args){
        /* 수업목표 : static 메소드를 호출할 수 있다. */
        /* static 메소드를 호출하는 방법
        * 클래스명.메소드명();              //객체를 만들어주지 않는다
        * */

        System.out.println("10과 20의 합 :" + Application8.sumTwoNum(10,20));
        /* 동일한 클래스 내에 작성된 static메소드는 클래스명 생략이 가능하다. */
        System.out.println("10과 20의 합 : " + sumTwoNum(10, 20));

    }
    public static int sumTwoNum(int first, int second){
        return first + second;
    }
}
