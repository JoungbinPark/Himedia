package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void testSimpleIfStatement(){
        /* 수업목표. if 단독사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* [if문 표현식]
         * if(조건식) {
         *       조건식이 true일 경우 실행할 명령문;
         * }
         * */

        /* 조건식 : true or false가 나오는 연산식을 조건식이라고 한다.
         * if문은 조건식 결과가 true면 {명령문}을 실행하고,
         * 조건식 결과가 false면 {명령문}을 무시하고 넘어감.
         * */

        /* 정수 한개를 입력 받아 그 수가 짝수면 입력하신 숫자는 짝수입니다라고 출력하고,
         * 짝수가 아니면 출력하지 않는 구문을 만들어보자.
         * 단 조건과 관련없이 프로그램이 종료될 때 프로그램을 종료합니다 라고 출력되도록 하자. */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력하세요 : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("입력하신 숫자는 짝수입니다.");
        }

        System.out.println("프로그램을 종료합니다. ");
    }

    public void testNestedIfStatement(){
        /* 수업목표 : 중첩된 if문의 흐름을 이해하고 적용할 수 있다. */
        /* 중첩된 if문 실행 흐름 확인 */

        /* 정수 한 개를 입력 받아 그 수가 양수인 경우에만 짝수인지를 확인하고
        * 짝수면 "입력하신 숫자는 양수이면서 짝수입니다." 라고 출력하고
        * 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 구문을 작성해보자.
        * 단 조건과 상관 없이 프로그램이 종료할 때 "프로그램이 종료됩니다."라고 출력한다. */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 한 개를 입력하세요 : ");
        int num = sc.nextInt();

        if(num>0){
            if(num%2==0){
                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
