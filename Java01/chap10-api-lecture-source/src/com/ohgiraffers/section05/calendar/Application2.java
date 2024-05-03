package com.ohgiraffers.section05.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표 : java.util.Calendar 클래스 사용법을 이해하고 사용할 수 있다. */
        /*
         * API문서를 살펴보면 Calendar클래스는 abstract클래스로 작성되어 있다.
         * 따라서 Calendar 클래스를 이용해서 인스턴스를 생성하는 것은 불가능하다. */

        /* Calendar 클래스를 이용한 인스턴스 생성 방법에는 두 가지가 있다.
         * 1. getInstance() static 메소드를 이용해서 인스턴스를 반환받는 방법
         * 2. 후손 클래스인 GregorianCalender 클래스를 이용해서 인스턴스를 생성하는 방법
         * */

        /* 1. getInstance() static 메소드를 이용해서 인스턴스를 반환받는 방법 */
        Calendar calendar = Calendar.getInstance();

        System.out.println("calender = " + calendar);

        /* 2. 후손 클래스인 GregorianCalendar 클래스를 이용해서 인스턴스를 생성하는 방법 */
        Calendar gregorianCalender = new GregorianCalendar();
        System.out.println("gregorianCalender = " + gregorianCalender);
        
        int year = 2014;
        int month = 8;      //0~11월로 사용되기 때문에 n은 (n+1)월을 의미
        int dayOfMonth = 18;
        int hour = 16;
        int minute = 42;
        int second = 1;
        
        Calendar birthDay = new GregorianCalendar(year, month, dayOfMonth, hour, minute, second);

        System.out.println("birthDay = " + birthDay);
        
                


    }
}
