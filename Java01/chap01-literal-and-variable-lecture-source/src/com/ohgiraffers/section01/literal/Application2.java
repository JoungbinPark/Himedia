package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args){

        /* 수업목표 : 값을 직접 연산하여 출력할 수 있다 */
        /* 값의 형태에 따라 사용할 수 있는 연산자 종류와 연산결과가 달라진다 */

        /* 1. 숫자와 숫자의 연산 */
        /* 1-1. 정수와 정수의 연산 */
        /* 수학적으로 사용하는 사칙연산에 추가로 나머지를 구하는 연산을 사용할 수 있다*/
        System.out.println("=====정수와 정수의 연산=====");
        System.out.println(123+456); //더하기
        System.out.println(123-23); //빼기
        System.out.println(123*10); //곱하기
        System.out.println(123/10); //나누기(몫) -> 정수와 정수의 연산이기 때문에 실수로 나오지 않는다.
        System.out.println(123%10); //나누기(나머지)

        /* 1-2 실수와 실수의 연산 */
        /* 실수끼리의 연산도 수학에서 사용하는 사칙연산에 나머지를 구하는 연산을 사용할 수 있다*/
        System.out.println("=====실수와 실수의 연산=====");
        System.out.println(1.23+1.23);
        System.out.println(1.23-0.23);
        System.out.println(1.23*10.0);
        System.out.println(1.23/10.0);
        System.out.println(1.23%1.0); // 실수와 실수의 연산에서는 약간의 오차가 생김

        /* 1-3 정수와 실수의 연산 */
        /* 정수와 실수의 연산도 수학에서 사용하는 사칙 연산에 나머지를 구하는 연산을 사용할 수 있다*/
        /* 정수와 실수의 연산결과는 항상 실수 */
        System.out.println("=====정수와 실수의 연산=====");
        System.out.println(123+1.0);
        System.out.println(123-1.0);
        System.out.println(12.3*10);
        System.out.println(123/0.7);
        System.out.println(123%0.7);

        /* 2. 문자의 연산 */
        /* 2-1. 문자와 문자의 연산 */
        /* 문자끼리의 연산도 사칙연산에 나머지를 구하는 연산까지 가능하다(왜 이런지 보단 연산이 가능함에 집중) */
        System.out.println("=====문자와 문자의 연산=====");
        System.out.println('a'+'b');
        System.out.println('a'-'b');
        System.out.println('a'*'b');
        System.out.println('a'/'b');
        System.out.println('a'%'b');

        /* 2-2. 문자와 정수의 연산 */
        System.out.println("=====문자와 정수의 연산=====");
        System.out.println('a'+1);
        System.out.println('a'-1);
        System.out.println('a'*2);
        System.out.println('a'/2);
        System.out.println('a'%2);
        /*'a'는 97과 같다는 것을 알 수 있다
        컴퓨터는 문자를 인식하지 못하고 숫자로만 인식하기 때문에 모든 문자와 대응하는 숫자가 매칭되어 있다
        아스키코드와 유니코드 */


        /* 2-3. 문자와 실수의 연산 */
        /* 실수도 숫자이기 때문에 정수처럼 모든 연산이 가능하다
        * 단 결과는 실수 형태 */
        System.out.println("=====문자와 실수의 연산=====");
        System.out.println('a'+1.0);
        System.out.println('a'-1.0);
        System.out.println('a'*2.0);
        System.out.println('a'/2.0);
        System.out.println('a'%2.0);

        /* 3. 문자열의 연산 */
        /* 3-1. 문자열과 문자열의 연산 */
        /* 문자열과 문자열의 '+' 연산은 문자열 합치기(이어붙이기)가 된다.
        * 문자열은 '+' 연산 이외의 다른 연산을 할 수 없다.*/
        System.out.println("=====문자열과 문자열의 연산=====");
        System.out.println("hello"+"world");
        //System.out.println("hello"-"world");      //에러발생
        //System.out.println("hello"*"world");      //에러발생
        //System.out.println("hello"/"world");      //에러발생


        /* 3-2. 문자열과 다른 형태의 값 연산*/
        /* 문자열과 연산은 '+' 연산만 가능하다 */
        /* 연산 결과는 다른 형태의 값들도 문자열로 취급하여 문자열합치기 결과가 나온다 */
        System.out.println("=====문자열과 다른 형태의 값의 연산=====");
        /* 3-2-1. 문자열과 정수의 연산 */
        System.out.println("helloworld"+123);
        /* 3-2-2. 문자열과 실수의 연산 */
        System.out.println("helloworld"+1.23);
        /* 3-2-3. 문자열과 문자의 연산 */
        System.out.println("helloworld"+'a');
        /* 3-2-4. 문자열과 논리값의 연산 */
        System.out.println("helloworld"+true);

        /* 주의사항. 숫자로 된 문자열의 형태의 값은 문자열 합치기 결과가 나옴을 주의 */
        System.out.println("123"+456);

        /* 4. 논리값 연산 */
        /* 4-1. 논리값과 논리값 연산 */
        /* 논리값끼리는 모든 연산자 사용이 불가능하다. */
/*        System.out.println(true+false);
        System.out.println(true-false);
        System.out.println(true*false);
        System.out.println(true/false);
        System.out.println(true%false);*/ //에러발생

        /* 4-2. 논리값과 정수의 연산 */
        /* 논리값과 정수의 연산은 모든 연산자 사용이 불가능하다. */
/*
        System.out.println(true+1);
        System.out.println(true-1);
        System.out.println(true*1);
        System.out.println(true/1);
        System.out.println(true%1);*/  // 에러발생

        /* 4-3. 논리값과 실수의 연산 */
        /* 논리값과 실수의 연산은 모든 연산자 사용이 불가능하다. */
        /*
        System.out.println(true+0.1);
        System.out.println(true-0.1);
        System.out.println(true*0.1);
        System.out.println(true/0.1);
        System.out.println(true%0.1);*/  // 에러발생

        /* 4-4. 논리값과 문자의 연산*/
        /* 논리값과 문자의 연산은 모든 연산자 사용이 불가능하다. */
        /* Why:: 문자는 내부적으로 정수 취급을 받기 때문
        System.out.println(true+'a');
        System.out.println(true-'a');
        System.out.println(true*'a');
        System.out.println(true/'a');
        System.out.println(true%'a');*/ // 에러발생

        /*4-5. 논리값과 문자열의 연산*/
        /* 논리값과 문자열의 연산은 '+' 연산만 가능*/
        System.out.println("=====논리값과 문자열의 연산=====");
        System.out.println(true+"a");
        /*System.out.println(true*"a");
        System.out.println(true-"a");
        System.out.println(true/"a");
        System.out.println(true%"a");*/ //에러발생


    }
}
