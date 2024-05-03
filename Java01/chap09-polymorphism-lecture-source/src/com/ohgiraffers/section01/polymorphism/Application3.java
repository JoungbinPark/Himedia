package com.ohgiraffers.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {
        /* 다형성을 적용하여 매개변수에 활용할 수 있다. */
        /* 1. 하단에 feed() 메소드 작성 */
        /* 2. 하단에 feed() 메소드 호출 */
        Application3 app3 = new Application3();
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();
        app3.feed(animal1);
        app3.feed(animal2);

        Rabbit animal3 = new Rabbit();
        Tiger animal4 = new Tiger();
        app3.feed(animal3);
        app3.feed(animal4);     //묵시적 형변환 발생

        app3.feed((Animal)animal3);
        app3.feed((Animal)animal4);     //명시적 형변환 발생

        app3.feed(new Rabbit());
        app3.feed(new Tiger());


    }
    public void feed(Animal animal){
        animal.eat();
    }


}
