package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        monster1.setInfo("피까츄");
        monster1.setHp(200);

        Monster monster2 = new Monster();
        monster2.setInfo("파이리");
        monster2.setHp(100);

        Monster monster3 = new Monster();
        monster3.setInfo("이상해씨");
        monster3.setHp(-100);

        System.out.println("monster1.getInfo() = " + monster1.getInfo());
        System.out.println("monster2.getInfo() = " + monster2.getInfo());
        System.out.println("monster3.getInfo() = " + monster3.getInfo());

    }
}
