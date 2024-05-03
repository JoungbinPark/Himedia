package com.ohgiraffers.section01.object.book.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application2 {
    public static void main(String[] args) {
        /* 학습목표 : Object 클래스의 equals() 메소드의 오버라이딩 목적을 이해하고 활용할 수 있다. */
        /* equals() 메소드의 오버라이딩
         * equals() 메소드는 매개변수로 전달받은 인스턴스와 ==연산을 하여 true와 false를 반환한다.
         * 동일한 인스턴스인자를 비교하는 기능을 한다. */

        /* 동일개체와 동등객체
         * 동일객체 : 주소가 동일한 인스턴스를 동일객체라고 한다.
         * 동등객체 : 주소가 다르더라도 필드값이 동일한 객체를 동등객체라고 한다.
         * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("두 인스턴스의 == 연산비교 : " + (book1==book2));
        System.out.println("두 인스턴스의 equals 연산비교 : " + (book1.equals(book1)));
        System.out.println("두 인스턴스의 compare 비교 : " + (book1.compare(book2)));

    }
}
