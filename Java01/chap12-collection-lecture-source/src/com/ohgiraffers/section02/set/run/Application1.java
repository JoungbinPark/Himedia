package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application1 {
    public static void main(String[] args) {
        /* set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 같은 요소의 중복저장을 허용하지 않는다.(null값도 중복되지 않게 하나의 null값만 저장)
        *  */

        /* HashSet 클래스
        * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나.
        * JDK 1.2부터 제공되고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다. */

        HashSet<String> hset = new HashSet<>();

        hset.add("java");
        hset.add("oracle");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");

        System.out.println("hset = " + hset);

        hset.add(new String("java"));

        System.out.println("hset = " + hset);

        System.out.println("hset에 저장된 객체 수 = " + hset.size());

        System.out.println("hset 포함 확인 = " + hset.contains(new String("oracle")));

        /* set은 순서가 없는 데이터집합이기 때문에 배열로 바꿔 순서를 부여하고 for문으로 출력*/
        /* 1. toArray() 배열로 바꾸고 for loop를 사용*/
        Object[] arr = hset.toArray(new String[0]);
        for(int i = 0; i<arr.length; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        /* iterator()로 목록을 만들어 연속 처리 */
        Iterator<String> iter = hset.iterator();

        while (iter.hasNext()) {
            System.out.println("iter.next() = " + iter.next());
        }

        hset.clear();
        System.out.println(hset.isEmpty());




    }
}
