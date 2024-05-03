package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args){
        /* 메서드 리턴값을 이해하고 활용할 수 있다. */
        /* 메서드 리턴값 테스트
        * 메서드는 항상 마지막에 return 명령어가 존재한다.
        * return은 자신을 호출한 구문으로 복귀함을 의미
        * 이 때 값을 가지고 복귀할 수 있고 이를 리턴값이라 한다. */

        /* return값을 반환하기 위해서는 메서드 선언부에 리턴타입을 명시해야 한다.
        * void는 아무 반환값도 가지지 않겠다는 리턴타입에 사용할 수 있는 키워드다.
        * 반환값이 없는 경우 return구문은 생략해도 컴파일러가 자동으로 추가해주지만
        * 반환값이 있는 경우 return구문을 반드시 명시해야한다.
        * 또한 메서드 선언부에 선언한 리턴타입과 반환값의 자료형은 반드시 일치해야한다. */
        System.out.println("main() 메소드 시작");
        Application6 app6 = new Application6();
        app6.testMethod();

        String returnText = app6.testMethod();
        System.out.println(returnText);
        System.out.println(app6.testMethod());

        System.out.println("main() 메소드 종료");

    }

    public String testMethod(){
        System.out.println("testMethod 작동");
        return "Hello World";
    }



}
