package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        /* 형변환 보조 스트림
        *
        * */

        /* 표준 스트림
        * 자바에서는 콘솔이나 키보드 같은 표준 입출력 장치로부터 데이터를 입출력하기 위한 스트림을 표춘 스트림 형태로 제공하고 있다.
        * System 클래스에 필드 in, out, err가 대상 데이터의 스트림을 말한다.
        * System.in : 콘솔로부터 입력받는다
        * System.out : 콘솔로부터 출력한다.
        * System.err : 콘솔로부터 출력한다.
        * 즉, 자주 사용하는 자원에 대해 미리 스트림을 생성해뒀기 때문에
        * 개발자가 별도로 스트림을 생성하지 않아도 된다.
        * */

        /* System.in을 InputStreamReader로 변환하여 바이트기반 스트림을 문자기반 스트림으로 변환 후 버퍼를 이용한 보조스트림과 연결*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("문자열 입력 : ");
            String value = br.readLine();
            System.out.println("value = " + value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            bw.write("java oracle jdbc");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
