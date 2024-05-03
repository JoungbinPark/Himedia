package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args){

        /* 수업목표: 변수를 선언하고 값을 할당하여 사용할 수 있다*/
        /* 변수를 사용하는 방법
        * 1. 변수를 준비(선언)
        * 2. 변수에 값을 대입(값 대입 및 초기화)
        * 3. 변수를 사용
        * */

        /* 자료형이란?
        * 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드
        * ex) int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속
        * 자료형은 기본자료형(Primary type)과 참조자료형(Reference type)으로 나뉜다.
        * 기본자료형 8가지를 살펴보자.
        * */

        /* 1-1-1. 숫자를 취급하는 자료형 */
        /* 정수를 취급하는 자료형은 4가지가 있다. */
        byte bnum;      //1byte
        short snum;     //2byte
        int inum;       //4byte
        long lnum;      //8byte

        /* 실수를 취급하는 자료형은 2가지가 있다. */
        float fnum;     //4byte
        double dnum;    //8byte

        /* 1-1-2. 문자를 취급하는 자료형 */
        char ch;        //2byte
        char ch2;

        /* 1-1-3. 논리값을 취급하는 자료형 */
        boolean isTrue; //1byte
        /* 이상 8가지를 기본자료형 */

        /* 1-1-4. 문자열을 취급하는 자료형*/
        String str;     //4byte(엄밀히 이야기하면 주소값은 4byte 정수값)

        /* 2. 변수에 값을 대입 */
        /* 2-1. 정수를 취급하는 자료형 값 대입 */
        bnum = 1;       //-128~ 127
        snum = 2;       //-32768~ 32767
        inum = 3;       //-2147483648~ 2147483647
        //lnum = 8;       // 아무 문제 없을 것 같지만 뒤에 대문자 L을 붙여야 함.(형변환에서 이유 나옴)
        lnum = 8L;

        /*2-2. 실수를 취급하는 자료형 값 대입 */
        fnum = 4.0f;    //꼭 뒤에 f를 붙여줘야함
        dnum = 8.0;

        /*2-3. 문자를 취급하는 자료형 값 대입 */
        ch = 'a';       //문자 형태의 값을 저장 가능
        ch2 = 97;       //'a'는 아스키코드로 '97'에 대응하기 때문에 숫자로 저장 가능

        /*2-4. 논리를 취급하는 자료형 값 대입 */
        isTrue = true;
        isTrue = false;

        /*2-5. 문자열을 취급하는 자료형에 값 대입 */
        str= "안녕하세요";

        /* 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표자료형이라 하며
        * 정수는 int, 실수는 double이 대표자료형이다. */

        /* 3. 변수의 사용 */
        /*변수에 저장한 값 출력 */
        System.out.println("=====변수에 저장된 값 출력=====");
        System.out.println("bnum값 출력:"+bnum);
        System.out.println("snum값 출력:"+snum);
        System.out.println("inum값 출력:"+inum);
        System.out.println("lnum값 출력:"+lnum);

        System.out.println("fnum값 출력:"+fnum);
        System.out.println("dnum값 출력:"+dnum);

        System.out.println("ch값 출력:"+ch);
        System.out.println("ch2값 출력:"+ch2);

        System.out.println("isTrue값 출력:"+isTrue);

        System.out.println("str값 출력:"+str);










    }
}
