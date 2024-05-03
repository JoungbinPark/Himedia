package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args){
        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */
        /* 자료형의 값이 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림 처리하고 sign bit를 반전시켜 최소값으로 순환시킴
        * */

        /* 1. 오버플로우 */
        byte num1 = 127;
        System.out.println("num1:"+num1);

        num1++;     //1 증가
        System.out.println("num1의 오버플로우 발생:"+num1);

        /* 2. 언더플로우 */
        /* 오버플로우와 반대의 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상 */
        byte num2 = -128;
        System.out.println("num2:"+num2);

        num2--;     //1 감소
        System.out.println("num2의 언더플로우 발생:"+num2);

        int firstNum = 1000000;     //100만
        int secondNum = 700000;     //70만

        int multi = firstNum*secondNum;
        System.out.println("multi의 값:"+multi);

        /* 3. 해결 방법 */
        /* 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리 */
        long longMulti = firstNum*secondNum;
        System.out.println("longMulti의 값:"+ longMulti);     //이미 firstNum*secondNum 값에서 오버플로우 발생했기 때문

        long result = (long)firstNum*secondNum;
        System.out.println("result의 값:"+result);        //firstNum을 long타입으로 강제형변화








    }
}
