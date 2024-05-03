package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.vo.MemberVO;

public class Application {
    public static void main(String[] args) {
        //기본생성자로 인스턴스 생성
        MemberVO member = new MemberVO();

        //getter로 기본값 출력
        System.out.println("Id = " + member.getId());
        System.out.println("Pwd = " + member.getPwd());
        System.out.println("name = " + member.getName());
        System.out.println("age = " + member.getAge());
        System.out.println("gender = " + member.getGender());
        System.out.println("phone = " + member.getPhone());
        System.out.println("email = " + member.getEmail());

        //setter로 값 변경
        member.setId("user01");
        member.setPwd("pass01");
        member.setName("홍길동");
        member.setAge(20);
        member.setGender('M');
        member.setPhone("010-1234-5678");
        member.setEmail("hong123@greedy.com");

        System.out.println("====================================");

        //get로 변경된 값 출력
        System.out.println("변경 후 Id = " + member.getId());
        System.out.println("변경 후 Pwd = " + member.getPwd());
        System.out.println("변경 후 name = " + member.getName());
        System.out.println("변경 후 age = " + member.getAge());
        System.out.println("변경 후 gender = " + member.getGender());
        System.out.println("변경 후 phone = " + member.getPhone());
        System.out.println("변경 후 email = " + member.getEmail());


    }
}
