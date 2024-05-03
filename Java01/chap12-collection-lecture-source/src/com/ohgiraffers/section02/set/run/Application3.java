package com.ohgiraffers.section02.set.run;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /* TreeSet 클래스
         * 데이터가 정렬된 상태로 저장되는 검색 트리의 형태로 요소를 저장
         * 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 동작 시간이 매우 빠르다
         * Set인터페이스가 가지는 특성을 그대로 가지지만 정렬된 상태를 유지하는 것이 다른 점이다. */

        TreeSet<String> tset = new TreeSet<>();

        tset.add("java");
        tset.add("oracle");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");

        System.out.println("tset = " + tset);


        Set<Integer> lotto = new TreeSet<>();

        while (lotto.size()<6){
            lotto.add((int)(Math.random()*45)+1);
        }

        System.out.println("lotto = " + lotto);

    }
}
