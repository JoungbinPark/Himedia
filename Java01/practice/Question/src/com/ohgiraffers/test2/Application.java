package com.ohgiraffers.test2;

import com.ohgiraffers.chap03.level01.Calculator;
import com.ohgiraffers.test1.TestMethod;

import static com.ohgiraffers.test1.TestMethod.TestRandom;

public class Application {
    public static void main(String[] args) {
        TestMethod tm = new TestMethod();
        double plus = tm.Calculator(2, 5, "+");
        double minus = tm.Calculator(2, 5, "-");
        double multi = tm.Calculator(2, 5, "*");
        double divide = tm.Calculator(2, 5, "/");
        double rest = tm.Calculator(2, 5, "%");
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multi);
        System.out.println(divide);
        System.out.println(rest);

        double radius = tm.CircleArea();
        double area = radius*radius*3.14;
        System.out.println("원의 넓이는 " + area + "입니다.");

        System.out.println(TestRandom());



    }

}
