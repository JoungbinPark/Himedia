package com.ohgiraffers.section03.math;

public class Application1 {
    public static void main(String[] args){
        /* 수업목표 : Math 클래스에서 제공하는 static 메소드를 호출할 수 있다. */
        /* API란?
        * Application Programming Interface는 응용프로그램에서 사용할 수 있도록
        * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스
        * 쉽게 말해 우리가 구현할 수 없거나 구현하기 번거로운 기능들을 JDK에 설치하면 사용할 수 있도록
        * 제공해놓은 소스코드(클래스나 인터페이스)를 말한다.
        * 더 쉽게 말해 누가 작성해놓은 소스코드이니 가져다 쓰는 방법을 본다는 말이다.
        * 모든 코드를 우리가 다 외울 수 없으니 API문서를 별도로 제공해주고 있다.
        * */

        /*
        * java.lang.Math
        * Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스이다.
        * 모든 메소드는 static 메소드로 작성되어 있다.
        * (객체의 상태를 관리하지 않고 기능만을 제공하는 경우 메모리를 효율적으로 사용하기 위해 자주 사용하는 기법이다,)
        * */

        /* 1. 절대값 출력 */
        /* 1-1. 클래스의 풀네임을 다 적은 경우 */
        System.out.println("-7의 절대값 : " +(java.lang.Math.abs(-7)));

        /* 1-2. import를 해서 사용 */
        System.out.println("1.25의 절대값 : " +(Math.abs(1.25)));

        /* 2. 최댓값, 최솟값 출력*/
        System.out.println("10과 20 중 더 작은 것 : " + Math.min(10, 20));
        System.out.println("20과 30 중 더 큰 것 : " + Math.max(20, 30));

        System.out.println("원주율 : " + Math.PI);

        /* 3. 난수 출력 */
        System.out.println("난수 발생 : " + Math.random());





    }
}
