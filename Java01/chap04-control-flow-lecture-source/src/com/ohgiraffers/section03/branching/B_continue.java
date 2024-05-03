package com.ohgiraffers.section03.branching;

public class B_continue {
    public void testSimpleContinueStatement(){
        /* 수업목표 : continue문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /*
        * continue문을 반복문 내에서 사용한다.
        * 해당 반복문의 반복 회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다.
        * 일반적인 형태 : if(조건식){continue;}
        * 보통 반복문 내에서 특정 조건에 대한 예외처리를 할 때 사용
        * */

        for(int dan = 2; dan < 10; dan++){

            /* 설명. 여기까지 빠져나옴 */
            for(int su = 1; su < 10; su++){
                if(su % 2 == 0){

                    /*  su가 짝수인 경우 해당 회차 반복 내용을 건너 뛰고 증감식으로 이동 */
                    continue;
                }
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            System.out.println();
        }
    }
}
