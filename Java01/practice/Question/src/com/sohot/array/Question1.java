package com.sohot.array;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //길이 10짜리 배열을 선언해줬어요
        int[] iarr = new int[10];


        // 스캐너를 데리고 왔ㄱㅇ
        Scanner sc = new Scanner(System.in);

        //반복문
        for(int i =0; i< iarr.length; i++){
            System.out.print((i+1)+"번째 정수를 입력하세요 : ");
            iarr[i] = sc.nextInt();
        }

        //배열 0번 9번까지 훝을건데 0번
        int min = iarr[0];
        int max = iarr[0];

        for(int i =0; i<iarr.length; i++){
            if(iarr[i] > max){
                max = iarr[i];
            }
            if(iarr[i] < min){
                min = iarr[i];
            }
        }
        System.out.println("최댓값 : "+max);
        System.out.println("최솟값 : "+min);

    }
}
