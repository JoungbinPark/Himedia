package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args){
        /*수업 목표 : 논리 연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다. */
        /* 논리 연산자의 우선순위와 활용
        * 논리and연산자와 논리or연산자의 우선순위
        * && : 11순위
        * || : 12순위
        * 논리and연산자가 논리or연산자보다 우선한다.
        * */

        /* 1. 1부터 100 사이의 값인지 확인 */
        /* '1<=변수<=100'으로 사용 불가 -> '변수>=1 && 변수 <=100'*/
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : "+(num1 >=1 && num1 <=100));
        int num2 = 166;
        System.out.println("1부터 100 사이인지 확인 : "+(num2 >=1 && num2 <=100));

        /* 2. 영어의 대문자인지 확인 */
        /* 영어 대문자냐? --> 문자변수 >='A' && 문자변수 <='Z' */
        char ch1 ='G';
        System.out.println("영어의 대문자인지 확인 : " + (ch1>='A' && ch1<='Z'));
        char ch2 ='g';
        System.out.println("영어의 대문자인지 확인 : " + (ch2>='A' && ch2<='Z'));

        /* 3. 대소문자와 상관없이 영문자 y인지 확인 */
        /* 문자변수=='Y' || 문자변수=='y' */
        char ch3 = 'y';
        System.out.println("영문자 y인지 확인 : " + (ch3=='y' || ch3=='Y'));

        /* 4. 영문자인지 확인 */
        /* A: 65, z: 90, a:97, z:122 (중간의 91~96까지는 영문자가 아님)*/

        char ch4 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch4>='A' && ch4<='Z') || (ch4>='a' && ch4<='z')));
        System.out.println("영문자인지 확인 : " + ((ch4>=65 && ch4<=90) || (ch4>=97 && ch4<=122)));



    }
}
