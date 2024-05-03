package com.objectarray.question1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //길이 5짜리 객체배열
        Member[] members = new Member[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<members.length; i++){
            String id;
            String pwd;
            String name;
            int age;
            char gender;
            System.out.print("id를 입력하세요. : ");
            id = sc.nextLine();
            System.out.print("pwd를 입력하세요. : ");
            pwd = sc.nextLine();
            System.out.print("이름을 입력하세요. : ");
            name = sc.nextLine();
            System.out.print("나이를 입력하세요. : ");
            age = sc.nextInt();
            System.out.print("성별을 입력하세요. : ");
            gender = sc.next().charAt(0);
            sc.nextLine();

            members[i] = new Member(id, pwd, name, age, gender);

            System.out.println();
        }


        for(Member i : members){
            System.out.println(i.getId());
            System.out.println(i.getPwd());
            System.out.println(i.getName());
            System.out.println(i.getAge());
            System.out.println(i.getGender());
            System.out.println();

        }
    }
}
