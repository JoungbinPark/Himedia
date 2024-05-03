package com.ohgiraffers.section03.stringbuilder;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표 : String과 StringBuilder의 차이점을 이해하고 사용할 수 있다. */

        /* 두 클래스는 스레드 동기화 기능 제공 여부에 따라 차이점이 있다.
        * StringBuilder : 스레드 동기화 기능을 제공하지 않음
        *                 스레드 동기화 처리를 고려하지 않는 상황에서 StringBuffer보다 성능이 좋음
        * StringBuffer : 스레드 동기화 기능 제공
        *                성능 면에서 StringBuilder보다 느림
        * 두 개의 차이는 스레드 동기화 유무고, 현재 우리는 스레드를 고려하지 않기 때문에 StringBuilder를 이용
        * */

        /* String과 StringBuilder
        * String : 불변이라는 특징을 가짐.
        *          문자열에 + 연산으로 합치기 하는 경우, 기존 인스턴스를 수정하는 것이 아닌 새로운 인스턴스를 반환
        *          따라서 문자열 변경이 자주 일어나는 경우 성능면에서 좋지 않다.
        *          하지만 변하지 않는 문자열을 자주 읽어들이는 경우엔 오히려 좋은 성능을 기대할 수 있다.
        * StringBuilder : 가변이라는 특징을 가지고 있다.
        *                 문자열에 append()메소드를 이용하여 합치기 하는 경우
        *                 기존 인스턴스를 수정하기 때문에 새로운 인스턴스를 생성하지 않는다.
        *                 따라서 문자열 변경이 일어나는 경우 String보다 성능이 좋다.
        * */

        StringBuilder sb = new StringBuilder("java");
        System.out.println("sb = " + sb);

        /* hashCode는 오버라이딩이 되어 있지 않다.
        * 즉 동일한 값을 가지는 경우에 같은 hashcode를 반환하지 않고
        * 인스턴스가 동일해야 같은 hashCode를 반환한다. */

        System.out.println("sb.hashCode() = " + sb.hashCode());
        sb.append("oracle");
        System.out.println("sb = " + sb);
        System.out.println("sb.hashCode() = " + sb.hashCode());




    }
}
