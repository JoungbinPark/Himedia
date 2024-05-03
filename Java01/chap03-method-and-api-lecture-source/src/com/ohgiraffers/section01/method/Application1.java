package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args){
        /* 수업목표 : 메소드의 호출 흐름을 이해할 수 있다. */
        /* 메소드란?
        * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합 */
        /* 메소드의 사용 목적
        * 1. 중복되는 코드를 메소드로 만들어 코드 반복사용을 피할 수 있다.
        * 2. 코드의 가독성이 좋아진다.
        * 3. 기능변경이 필요한 경우 메소드 부분만 수정하면 되기 때문에, 유지 보수가 쉽다.
        * */

        System.out.println("main() 시작...");
        /* 1. main 메소드 밖 하단에 methodA라는 메소드를 추가한다. */
        /* 2. 작성한 메소드를 호출하는 부분을 작성한다. */
        /* 메소드의 호출 방법
        * 클래스명 사용할 이름 = new 클래스명();             //객체 생성
        * 사용할이름.메소드명();                            //메소드 호출
        * */
        Application1 app = new Application1();
        app.methodA();
        System.out.println("main() 끝...");
    }

    public void methodA() {
        System.out.println("뱀 선생님 출근!");
        methodB();
        System.out.println("뱀 선생님 퇴근!");
    }

    public void methodB() {
        System.out.println("9시 30분에 수업을 시작합니다.");
        methodC();
        System.out.println("6시 20분에 수업을 끝냅니다.");
    }

    public void methodC() {
        System.out.println("점심시간 시작. 1시 20분입니다.");
        System.out.println("점심시간 끝. 2시 30분입니다.");
    }

}
