package com.sohot.es.q2;

public class Application {
    public static void main(String[] args){

        Order order = new Order(2022073001, "abc123", 2022, 7, 30, "허대훈", "PD0327-12","경기도 용인시 처인구 포곡읍 에버랜드로 199");

        System.out.println("주문번호 = " + order.num);
        System.out.println("주문자 아이디 = " + order.id);
        System.out.println("주문날짜 = " + order.year +"년 "+order.month+"월 "+order.day+"일");
        System.out.println("주문자 이름 = " + order.name);
        System.out.println("주문 상품 번호 = " + order.product);
        System.out.println("배송 주소 = " + order.address);
    }
}
