package com.sohot.es.q3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //문자열 입력
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력 : ");
        String get = sc.nextLine();

        int[] iarr = new int[get.length()];

        for(int i = 0; i<get.length(); i++){
            iarr[i] = (int) get.charAt(i);
            System.out.println(get.charAt(i) + " : " + iarr[i]);
        }
    }
}
