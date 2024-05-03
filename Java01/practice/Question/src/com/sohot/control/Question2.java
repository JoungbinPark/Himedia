package com.sohot.control;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /* 에스프레소, 카푸치노, 카페라떼 3500
        * 아메리카노 2000*/

        //주문접수
        Scanner sc = new Scanner(System.in);
        System.out.print("주문하시겠습니까? 메뉴는 아메리카노, 에스프레소, 카푸치노, 카페라떼가 있습니다 : ");
        String order = sc.nextLine();

        switch(order){
            case "아메리카노" :
                System.out.println("2000원입니다.");
                break;
            case "에스프레소" :
                System.out.println("3500원입니다.");
                break;
            case "카푸치노" :
                System.out.println("3500원입니다.");
                break;
            case "카페라떼" :
                System.out.println("3500원입니다.");
                break;
            default:
                System.out.println("메뉴에 없는 주문입니다.");
        }
    }
}
