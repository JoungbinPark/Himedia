package com.ohgiraffers.section05.logical;

public class Application1 {
    public static void main(String[] args){
        /* 수업목표 : 논리연산자에 대해 이해하고 활용할 수 있다. */
        /*논리연산자
        * 논리값(true or false)를 취급하는 연산자
        * */

        /*논리연산자의 종류
        * 1. 논리 연결 연산자: 두 개의 피연산자를 가지는 이항연산자, 연산자의 결합 방향은 왼쪽에서 오른쪽
        *                   두 개의 논리식을 판단하여 참과 거짓을 판단
        *   1-1. &&(논리AND) 연산자 : 두개의 논리식이 모두 참일 경우에만 true 반환, 하나라도 거짓이면 false 반환
        *   1-2. ||(논리OR) 연산자 : 두개의 논리식 중 하나라도 참이면 true 반환, 모두 거짓일 경우에만 false 반환
        * 2. 논리 부정 연산자 : 피연산자가 하나인 단항연산자, 연산자의 결합 방향은 왼쪽에서 오른쪽
        *   2-1. !(논리NOT)연산자 : 논리의 결과가 참이면 거짓을, 거짓이면 참을 반환한다.
         */

        /* 논리 연산자의 결과값 확인 */
        System.out.println("true와 true의 논리 and 연산 : " + (true && true));
        System.out.println("true와 false의 논리 and 연산 : " + (true && false));
        System.out.println("false와 true의 논리 and 연산 : " + (false && true));
        System.out.println("false와 false의 논리 and 연산 : " + (false && false));

        System.out.println("==========");
        System.out.println("true와 true의 논리 or 연산 : " + (true || true));
        System.out.println("true와 false의 논리 or 연산 : " + (true || false));
        System.out.println("false와 true의 논리 or 연산 : " + (false || true));
        System.out.println("false와 false의 논리 or 연산 : " + (false || false));

        /*
        * &&연산자 : 어지간하면 false. 둘다 참이면 true.
        * ||연산자 : 어지간하면 true. 둘다 거짓이면 false.
        * */

        /* 2. 논리식에 논리연산자 활용 */
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("a<b면서 c<d인지 확인 : " + (a<b && c<d));     //둘다 참
        System.out.println("a<b면서 c>d인지 확인 : " + (a<b && c>d));
        System.out.println("a>b면서 c<d인지 확인 : " + (a>b && c<d));
        System.out.println("a>b면서 c>d인지 확인 : " + (a>b && c>d));

        System.out.println("a<b거나 c<d인지 확인 : " + (a<b || c<d));
        System.out.println("a<b거나 c>d인지 확인 : " + (a<b || c>d));
        System.out.println("a>b거나 c<d인지 확인 : " + (a>b || c<d));
        System.out.println("a>b거나 c>d인지 확인 : " + (a>b || c>d));     //둘다 거짓


    }
}
