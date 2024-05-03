package com.ohgiraffers.chap02.level01;

public class Application01 {
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; // 문자코드값 : 65

        //문제
        System.out.println(y >= 5 || x < 0 && x > 2);
        // true
        // y>=5 가 true이고 OR연산자이기 때문에 피연산자가 하나만 true여도 true가 나온다. 왼쪽부터 계산

        System.out.println(y += 10 - x++);
        // 13
        // y+=10 의 결과 15이며 이후 -x의 결과 13이 나온다
        // 연산이 모두 끝난 후 x++의 연산으로 x의 값은 3이 된다

        System.out.println(x+=2);
        // 5
        // 앞의 연산으로 x는 3이 되었다. x +=2의 결과 5

        System.out.println( !('A' <= c && c <='Z') );
        // false
        //'A' == c 임으로 true, c의 코드값은 65, Z의 코드값은 90으로 true, 둘다 true임으로 값은 true다.
        // 이후 !인 부정연산자가 붙었기 때문에 반전해줘서 false다

        System.out.println('C'-c);
        // 2
        // 문자에 부여된 숫자값을 빼준다. 'C'의 문자코드는 67 'A'는 65

        System.out.println('5'-'0');
        // 5
        // '5'의 아스키코드값은 53, '0'은 48이다.

        System.out.println(c+1);
        // 66
        // 문자코드값 65에 1을 더한다. 숫자를 더하면서 자료형이 int가 된다.

        System.out.println(++c);
        // B
        // 문자코드값 65에 1을 더한다

        System.out.println(c++);
        // B
        // 문자코드값 66에 1을 더한다

        System.out.println(c);
        // C
        // 문자코드값 출력


    }
}
