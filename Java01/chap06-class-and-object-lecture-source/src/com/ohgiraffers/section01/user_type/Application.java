package com.ohgiraffers.section01.user_type;

public class Application {
    public static void main(String[] args) {
        /* 클래스가 무엇인지 이해하고 작성할 수 있다. */

        /* 1. 변수를 이용한 회원 데이터 관리 */
        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[] {"축구", "야구", "배구"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.print("hobby = ");
        for (int i = 0; i<hobby.length; i++){
            System.out.print(hobby[i] + " ");
        }
        System.out.println();
        /* 변수명으로 데이터를 관리할 때의 단점
        * 1. 변수명을 다 관리해야 하는 어려움이 있다.
        * 2. 모든 회원정보를 인자로 메소드 호출 시 값을 전달해야하면 너무 많은 값들을 인자로 전달해야해서 한 눈에 안들어온다
        * 3. 리턴은 1개의 값만 반환하기에 회원정보를 묶어서 리턴할 수 없다. (서로 다른 자료형이기 때문)*/
        
        /* 사용자 정의의 자료형 사용하기 */
        /* 2-1. 변수 선언 및 객제 생성 
        * 자료형 변수명 = new 클래스명();         <- 지금까지 사용한 구문은 객체(인스턴스)를 생성하는 구문
        * 사용자 정의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap에 할당해야 한다. 
        * 객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체가 생성된다. 
        * 아이디, 비밀번호, 이름, 나이, 성별, 취미를 연속된 메모리 주소에 사용하도록 heap에 공간을 만들었다. 
        * */

        Member member = new Member();       //객체 생성 (사용자 정의 변수명)
        
        /* 2-2. 생성된 인스턴스의 초기값 확인하기 */
        /* 
        * 필드에 접근하기 위해서는 레퍼런스 변수명.필드명
        * "."은 참조연산자라고 하는데 레퍼런스 변수가 참고하고 있는 주소로 접근한다는 의미를 가진다. 
        * 각 공간은 필드명으로 접근한다.(배열은 인덱스로 접근. 객체는 필드명으로 접근)
        * */
        
        System.out.println("member.id = "+ member.id);
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);
        System.out.println("member.gender = " + member.gender);
        System.out.println("member.hobby = " + member.hobby);

        member.id = "user02";
        member.pwd = "pass02";
        member.name = "유관순";
        member.age = 15;
        member.gender = '여';
        member.hobby = new String[] {"축구","야구","농구"};

        System.out.println("member.id = "+ member.id);
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);
        System.out.println("member.gender = " + member.gender);
        System.out.print("member.hobby = ");
        for (int i = 0; i<member.hobby.length; i++){
            System.out.print(member.hobby[i] + " ");
        }

    }
}
