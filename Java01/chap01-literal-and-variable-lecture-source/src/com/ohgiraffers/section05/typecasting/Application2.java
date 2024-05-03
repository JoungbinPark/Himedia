package com.ohgiraffers.section05.typecasting;

public class Application2 {
    public static void main(String[] args){
        /* 수업목표 : 강제 형변환 규칙에 대해 이해할 수 있다. */
        /*
        * 강제 형변환
        * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
        * ex)(바꿀 자료형)값;
        * */

        /*
        * 자동형변환 규칙의 반대 상황에서 강제형변환이 필요하다.
        * 1. 강제형변환 규칙
        * 1-1. 큰 자료형 -> 작은 자료형
        * 1-2. 실수 -> 정수
        * 1-3. 문자형을 int 미만 크기의 변수로 저장할 떄
        * 1-4. 논리형은 강제 형변환 규칙에서 제외
        * */

        /* 1-1 큰 자료형 -> 작은 자료형 */
        /* 1-1-1. 정수 끼리의 강제 형변환 */
        long lnum = 8;
        //int inum = lnum;      //데이터 손실 가능성을 컴파일러가 알려줌 -> 에러
        int inum = (int)lnum;   //변경하려는 자료형을 명시해서 강제형변환
        short snum = (short)lnum;

        /* 1-1-2. 실수끼리의 강제 형변환 */
        double dnum = 8.0;
        //floast fnum = dnum;
        float fnum = (float)dnum;

        /* 1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다. */
        float fnum1 = 6.0f;
        //long lnum2 = fnum1;     // 소수점 자리 이하의 데이터손실 가능성으로 byte값이 크더라도 자동형변환이 불가능
        long lnum2 = (long)fnum1; // 강제형변환은 "데이터손실을 감안하고 형변환을 함"의 의미
        System.out.println(lnum2);

        /* 1-3. 문자형을 int 미만 크기의 변수에 저장할 때 */
        int num1 = 97;
        int num2 = -97;

        char ch1 = (char)num1;
        char ch2 = (char)num2;
        System.out.println("ch1의 값:"+ch1);
        System.out.println("ch2의 값:"+ch2);
        byte bnum3 = (byte)ch1;
        System.out.println("bnum3의 값:"+bnum3);

        /* 1-4. 논리형은 강제형변환 규칙에서 제외된다. */
        boolean isTrue = true;
        //char ch3 = (char)isTrue;







    }

}
