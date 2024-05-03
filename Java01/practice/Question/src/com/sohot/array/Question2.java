package com.sohot.array;

public class Question2 {
    public static void main(String[] args) {
        // 배열 선언 및 길이 할당
        int[] iarr = new int[100];

        // 배열에 값 대입
        for(int i=0; i<iarr.length; i++){
            iarr[i] = (i+1);
        }

        // 배열에서 조건에 맞는 값 합산
        int sum = 0;
        for(int i = 0; i<iarr.length; i++){
            if(iarr[i]%3==0 || iarr[i]%5==0){
                if(iarr[i]%3==0){
                    System.out.println(iarr[i]);
                }
                sum += iarr[i];
            }

        }

        // 출력
        System.out.println("sum의 값 : "+ sum);
    }
}
