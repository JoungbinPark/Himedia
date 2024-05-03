package com.ohgiraffers.chap02.level01;

public class Application02 {
    public static void main(String[] args){

        //변수
        int numOfApples = 92;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples / sizeOfBucket + (numOfApples%sizeOfBucket >0 ? 1 : 0);
        int numOfBucket2 = (int)Math.ceil((double)numOfApples/sizeOfBucket);

        //출력
        System.out.println("필요한 바구니의 수 : " + numOfBucket);

    }
}
