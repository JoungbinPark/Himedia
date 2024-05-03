package com.ohgiraffers.chap01.level01;

public class Application02 {
    public static void main(String[] args){
        // 너비, 높이 변수 저장
        double width = 12.5;
        double height = 36.4;

        //둘레 : (너비+높이)*2
        double perimeter = (width+height)*2;

        //넓이 : 너비*높이
        double area = width*height;

        //출력
        System.out.println("둘레 : " + perimeter);
        System.out.println("넒이 : " + area);
    }
}
