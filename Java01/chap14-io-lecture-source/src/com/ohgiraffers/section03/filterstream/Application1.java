package com.ohgiraffers.section03.filterstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {
        /* java.io 패키지는 입출력 스트림은 기본스트림과 필터스트림으로 분류할 수 있다.
        * 기본스트림은 외부 데이터에 직접 연결되는 스트림이고
        * 필터스트림은 외부 데이터에 직접 연결되는 것이 아니라 기본스트림에 추가로 사용할 수 있는 스트림이다.
        * 주로 성능을 향상시키는 목적으로 사용
        * */

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("src/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

            bw.write("안녕하세요\n");
            bw.write("반갑습니다\n");

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
