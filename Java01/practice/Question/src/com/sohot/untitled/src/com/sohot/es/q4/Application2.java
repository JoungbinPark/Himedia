package com.sohot.es.q4;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("홀수를 입력하세요 : ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("양수를 입력하세요....");
        } else if(num%2 ==0){
            System.out.println("홀수를 입력하세요...");
        } else{
            for(int i = 1; i<=(num+1)/2; i++){
                for(int j = 1; j<=(num+1)/2-i; j++){
                    System.out.print(" ");
                }
                for(int k = 1; k<=2*i-1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = 1; i<(num+1)/2; i++){
                for(int j = 1; j<=i; j++){
                    System.out.print(" ");
                }
                for(int k = 1; k<(num+1)-2*i; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
