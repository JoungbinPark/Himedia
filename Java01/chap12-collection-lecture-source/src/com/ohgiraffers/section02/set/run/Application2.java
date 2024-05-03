package com.ohgiraffers.section02.set.run;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        /* LinkedHashSet 클래스
        * HashSet의 기능을 모두 가지고 있고 추가적으로 저장순서를 유지하는 기능을 하고 있다. */

        LinkedHashSet<String> lhset = new LinkedHashSet<>();
        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println("lhset = " + lhset);

        TreeSet<String> tset = new TreeSet<>(lhset);
        System.out.println("tset = " + tset);
    }
}
