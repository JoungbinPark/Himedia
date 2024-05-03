package com.sohot.es.q1;

public class Application {
    public static void main(String[] args) {

        Human newman = new Human(40, "David", true, 3);

        System.out.println("나이 = " + newman.age);
        System.out.println("이름 = " + newman.name);
        System.out.println("결혼여부 = " + newman.isMarried);
        System.out.println("자녀 수 = " + newman.kids);
    }
}
