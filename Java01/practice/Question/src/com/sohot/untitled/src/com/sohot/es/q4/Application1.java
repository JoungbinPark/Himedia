package com.sohot.es.q4;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇층까지 쌓아올릴까요? :");
        int floor = sc.nextInt();

        for(int i = 1; i<=floor; i++){
            for(int j = 1; j<=floor-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<2*i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
