package com.ohgiraffers.section03.uses;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {

        /* try-with-resource
         * close 해야하는 인스턴스의 경우 try옆에 괄호 안에서 생성하면
         * 해당 try-catch 블럭이 완료될 떄 자동으로 close 처리해준다.
         * */

        try (BufferedReader in = new BufferedReader(new FileReader("test.dat"))) {
            String s;
            while((s=in.readLine()) != null){
                System.out.println(s);
            }

        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
