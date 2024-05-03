package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement(){
        /* 수업목표 : for 단독 사용에 대한 흐름 이해하고 적용할 수 있다. */
        /*
        * for문 표현식
        * for(초기식; 조건식; 증강식){
        *       조건을 만족할 경우 수행할 구문(반복할 구문)
        * }*/

        // 1부터 10까지 1씩 증가시키며 10번 i값을 증가시키는 기본반복문
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        // 초기식과 증감식은 ()에서 빼서 기술해도 괜찮다.
        int j = 1;
        for(;j<=15;){
            System.out.println(j);
            j++;
        }
    }
    public void testForExample1(){
        /* 우리가 뭘 반복하는지 확인하여 반복문으로 개선할 수 있다. */
        /* 10명의 학생의 이름을 입력받아 이름을 출력해보자. */
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("1번째 학생의 이름을 입력해주세요 : ");
        String student1 = sc.nextLine();
        System.out.println("1번째 학생의 이름은 " + student1 + "입니다.");
        */

        /* 반복해야 하는 내용
        * 1. 학생의 이름을 입력받아 변수에 저장
        * 2. 안내 문구 출력
        * 3. 저장된 이름 출력*/

        /* 반복횟수 1~10까지 1씩 증가하여 총 10번 반복 */

        for(int i = 1; i<=10; i++){
            System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");
        }
    }
    public void testForExample2(){
        /* 우리가 뭘 반복하는지 확인하여 반복문으로 개선할 수 있다. (2) */

        /* 문장 속에 규칙 찾기 */
        /* 1부터 10까지의 합계를 구하라 */

        int sum = 0;;
        for(int i = 1; i<=10; i++){
            sum += i;
        }
        System.out.println("sum의 값 : " +sum);
    }
    public void testForExample3(){
        /* 우리가 뭘 반복하는지 확인하여 반복문으로 개선할 수 있다. (3) */
        /*5 ~ 10 사이의 난수를 발생시켜서
        * 1부터 발생한 난수까지의 합계를 구해보자
        * */
        int random = (int) (Math.random()*6) +5;

        int sum2 = 0;
        for(int i =1; i<=random; i++){
            sum2 += i;
        }
        System.out.println("1부터 "+random+"까지의 합은 "+sum2+"입니다.");
    }
    public void printSimpleGugudan(){
        /* 수업목표 : 무엇을 반복하는지 확인하여 반복문으로 개선할 수 있다. */
        /*
        * 키보드로 2~9 사이의 구구단을 입력받아
        * 2~9 사이의 경우 해당 단의 구구단을 출력하고
        * 그렇지 않은 경우 "반드시 2~9 사이의 양수를 입력해야 합니다." 출력*/

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 구구단의 단 수를 입력하세요 : ");
        int dan = sc.nextInt();

        if(dan>=2 && dan<=9){
            for(int i = 1; i<=9; i++){
                System.out.println(dan + " * " + i + " = " + (dan*i));
            }
        } else {
            System.out.println("반드시 2~9 사이의 양수를 입력해야 합니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

}

