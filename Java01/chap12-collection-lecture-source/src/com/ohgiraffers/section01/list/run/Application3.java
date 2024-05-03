package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application3 {
    public static void main(String[] args) {
        /* LinkedList
        * ArrayList와 사용하는 방식은 유사하나 내부적으로 요소를 저장하는 방법에 차이가 있다.
        * 내부는 이중 연결 리스트로 구현되어있다.
        * 단일 연결 리스트 : 저장한 요소가 순서를 유지하지 않고 저장돼 이러한 요소 사이를 링크를 타고 연결하여 구성하며 다시 연결된 리스트 형태인 것처럼 만든 자료구조이다.
        * 이중 연결 리스트 : 단일연결 리스트는 다음 요소만 링크하는 반면 이중 연결 리스트는 이전 요소도 링크하여 이전 요소로 접근하기 쉽게 고안된 자료구조이다.
        * */

        List<String> linkedList = new LinkedList<String>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(linkedList.size());
        for(int i = 0; i <linkedList.size(); i++){
            System.out.println(i + " : " + linkedList.get(i));
        }

        linkedList.remove(1);
        System.out.println(linkedList);

        System.out.println(linkedList.isEmpty());

        linkedList.clear();

        System.out.println(linkedList.isEmpty());



    }
}
