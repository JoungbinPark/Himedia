package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        /* ArrayList 정렬 기능을 이해할 수 있다. */

        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 48000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

        /* 제네릭 타입 제한으로 인해 Comparable 타입을 가지고 있는 경우에만 sort가능 */
        //Collections.sort(bookList);

        /* 우리가 만든 DTO의 경우 이런 방식을 사용하지 못한다. 그래서 다른 방법을 사용해야 한다. */

        for(BookDTO book : bookList){
            System.out.println(book);
        }

        bookList.sort(new AscendingPrice());

        System.out.println("가격을 오름차순으로 정렬합니다.");


        for(BookDTO book : bookList){
            System.out.println(book);
        }

        bookList.sort(new Comparator<BookDTO>() {       //익명클래스
            /* 익명 클래스는 뒤에 {}을 만들어서 인터페이스를 상속받는 클래스인데 한번만 사용하는 객체를 효율적으로 불러오는 방법이다.*/
            @Override
            public int compare(BookDTO o1, BookDTO o2) {


                return o1.getPrice() >= o2.getPrice()? -1 : 1;
            }
        });
        System.out.println("가격을 내림차순으로 정렬합니다.");

        for(BookDTO book : bookList){
            System.out.println(book);
        }

        /* Comparator 인터페이스 : List에 default 메소드인 sort()메소드의 인자로
        * 정렬의 기준이 되는 인스턴스를 넣어주면 우리가 오버라이딩한 메소드가 동작하면서 그걸 기준으로 삼는다. */

        System.out.println("제목의 오름차순으로 정렬합니다. ");
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        for(BookDTO book : bookList){
            System.out.println(book);
        }


    }
}
