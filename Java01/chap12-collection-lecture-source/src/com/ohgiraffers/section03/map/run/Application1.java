package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* Map 인터페이스의 특징
        * Collection 인터페이스와 다른 저장방식을 가진다.
        * 키(key)와 값(value)을 하나의 쌍으로 저장하는 방식을 사용한다. */

        /* 키(key)란?
        * 값(value)를 찾기 위한 이름 역할을 하는 객체를 의미
        * 1. 요소의 저장순서를 유지하지 않는다.
        * 2. 키는 중복을 허용하지 않지만 키가 다르면 중복되는 값을 저장 가능하다.
        *  */

        /* HashMap
        * 1. 검색 속도가 매우 빠르다. */

        HashMap hashMap = new HashMap();

        hashMap.put("one", new Date());
        hashMap.put(12, "red apple");
        hashMap.put(33, 123.0);

        System.out.println("hashMap = " + hashMap);

        hashMap.put(12, "banana");

        System.out.println("hashMap = " + hashMap);

        hashMap.put(11, "banana");
        hashMap.put(9, "banana");


        System.out.println("hashMap = " + hashMap);

        System.out.println("키 11의 객체값 = " + hashMap.get(11));

        hashMap.remove(9);

        System.out.println("hashMap = " + hashMap);

        System.out.println("hashMap.size() = " + hashMap.size());

        HashMap<String, String> hmap2 = new HashMap<>();
        hmap2. put("one", "java");
        hmap2. put("two", "oracle");
        hmap2. put("three", "jdbc");
        hmap2. put("four", "html");
        hmap2. put("fivs", "css");

        Iterator<String> keyIter = hmap2.keySet().iterator();

        while (keyIter.hasNext()){
            String key = (String) keyIter.next();
            String value = (String) hmap2.get(key);
            System.out.println(key + " = " + value);
        }

        Collection<String> values = hmap2.values();

        /* 반복자를 이용한 처리 */
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()){
            System.out.println("valueIter.next() = " + valueIter.next());
        }


        /* 배열로 만들어서 처리 */
        Object[] valueArr = values.toArray();
        for(int i = 0; i < valueArr.length; i++){
            System.out.println("valueArr[" + i + "] = " + valueArr[i]);
        }

        /* entrySet 메소드로 처리하는 법 : 키와 객체를 쌍으로 묶는 것 */
        Set<Map.Entry<String, String>> set = hmap2.entrySet();

        Iterator<Map.Entry<String, String>> entryIter = set.iterator();
        while (entryIter.hasNext()){
            Map.Entry<String,String> entry = entryIter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }








    }
}
