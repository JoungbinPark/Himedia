package com.ohgiraffers.section05.logical;

public class Application3 {
    public static void main(String[] args){

        /* 수업목표 : 논리연결연산자의 진리표에 대해 이해할 수 있다. */
        /* AND연산과 OR연산의 특징
        * 논리식 && 논리식 : 앞이 false면 뒤를 실행안함.
        * 논리식 || 논리식 : 앞이 true면 뒤를 실행안함.
        * */

        /* 1. 논리식 && 논리식 : 앞의 결과가 false면 뒤를 실행 안함 */
        /* 둘다 true여야 true값 반환. 앞이 false면 뒤의 조건 확인 없이 false
        * 따라서 false일 가능성이 높은 조건을 앞으로 배치해야 연산 횟수를 줄일 수 있다. */

        int num1 = 10;
        int result1 = (false && ++num1>0)? num1 : num1;
        System.out.println("&&실행 확인 : " + result1);     //뒷 조건인 ++num1이 실행되지 않음

        /* 2. 논리식 || 논리식 : 앞의 결과가 true면 뒤를 실행 안함 */
        /* 둘다 false여야 false값 반환. 앞이 true면 뒤의 조건 확인 없이 true
        * 따라서 true일 가능성이 높은 조건을 앞으로 배치해야 연산 횟수를 줄일 수 있다. */

        int num2 = 10;
        int result2 = (true || --num2>0)? num2 : num2;
        System.out.println("||실행 확인 : " + result2);

    }
}
