package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application4 {
    public static void main(String[] args) {
        /* Stack에 대해 이해하고 사용할 수 있다. */
        /* Stack 메모리 구조는 선형 매미로 공간에 데이터를 저장하며
        * 후입선출(LIFO = Last In First Out) 방식의 자료 구조
        * */

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);

        /* 인덱스가 1부터 시작 */
        System.out.println("integerStack.search(5) = " + integerStack.search(5));       //1
        
        /* 
        * peek() : 해당 스택의 가장 마지막에 있는 (상단의 요소) 반환
        * pop() : 해당 스택의 가장 마지막에 있는 요소 반환 후 제거 
        * */
        System.out.println("integerStack.peek() = " + integerStack.peek());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        //System.out.println("integerStack.pop() = " + integerStack.pop()); //EmptyStackException
        System.out.println("integerStack = " + integerStack);
    }
}
