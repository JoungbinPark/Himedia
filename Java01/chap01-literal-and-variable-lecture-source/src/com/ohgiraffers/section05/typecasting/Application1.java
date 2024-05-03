package com.ohgiraffers.section05.typecasting;

public class Application1 {

    public static void main(String[] args){

        /* 자동형변환 규칙에 대해 이해할 수 있다. */

        /* 데이터의 형변환이 필요한 이유
        * 자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
        * 즉, 같은 데이터 타입끼리만 연산을 수행할 수 있다.
        * */
        /*형변환의 종류와 규칙
        * 1. 자동형변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
        * 1-1. 작은 자료형 -> 큰 자료형
        * 1-2. 정수 -> 실수
        * 1-3. 문자형(char) -> int형 ('a' = 97)
        * 1-4. 논리형은 형변환 규칙에서 제외된다.
        *
        * 2. 강제형변환(명시적 형변환) : 형변환(cast) 연산잔를 이용한 강제적으로 수행하는 형변환
        * 2-1. 자동형변환이 적용되지 않는 경우 강제 형변환이 필요하다.
        * */

        /* 자동형변환 규칙테스트 */
        /* 1-1. 작은 자료형 -> 큰 자료형 */
        /* 작은 자료형에서 큰 자료형으로 공간만 옮기는 경우 데이터 손실이 발생하지 않기에 컴파일러가 자동으로 처리해준다. */

        /*1-1-1. 정수끼리의 자동형변환*/
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 20;
        //int result = num1+num2;     //자동으로 큰 자료형인 long타입으로 변경 후 계산하기 때문에 int형 변수에 값을 담을 수 없다.
        long result = num1+num2;      //int+long은 다른 자료형이라 int -> long 변환 수행 후 연산
        System.out.println("result의 값:"+result);

        /* 1-1-2. 실수끼리의 자동 형변환 */
        float fnum = 4.0f;
        double dnum = fnum;
        double result2 = fnum + dnum;
        System.out.println("result2의 값:"+result2);

        /*1-2. 정수는 실수로 자동 형변환 된다. */
        /* 정수를 실수로 변경할 때 소수점 자리수가 없어도 실수 형태로 표현 가능하다. */

        /*1-3. 문자형은 int형으로 자동 형변환 된다. */
        char ch1 = 'a';
        int num11 =ch1;

        /*1-4. 논리형은 형변환 규칙에서 제외된다. */
        /*어떤 자료형이든 boolean을 형변환해서 담을 수 없다. */
        boolean isTrue = true;
        //byte bnum = isTrue;
        //float fnum = isTrue;
        //char cha = isTrue;

    }
}
