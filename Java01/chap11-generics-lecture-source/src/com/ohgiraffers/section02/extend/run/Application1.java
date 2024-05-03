package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {
    public static void main(String[] args) {
        /* extends 키워드를 이용하여 특정한 타입만을 사용하도록 제네릭 범위를 제한할 수 있다. */
        //RabbitFarm<Animal> farm = new RabbitFarm<Animal>();       //상속받은 Rabbit의 상위인터페이스라 에러
        //RabbitFarm<Mammal> farm = new RabbitFarm<Mammal>();         //상속받은 Rabbit의 상위클래스라 에러
        //RabbitFarm<Snake> farm = new RabbitFarm<Snake>();           //전혀 다른 타입의 클래스라 에러
        RabbitFarm<Rabbit> farm = new RabbitFarm<Rabbit>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<Bunny>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<DrunkenBunny>();

        //farm.setAnimal(new Snake());      // 상속받은 Rabbit의 후손만 가능
        farm.setAnimal(new Rabbit());
        ((Rabbit)farm.getAnimal()).cry();
        farm.getAnimal().cry();             //형변환 생략 가능

        farm2.setAnimal((new Bunny()));
        farm2.getAnimal().cry();

        farm3.setAnimal((new DrunkenBunny()));
        farm3.getAnimal().cry();


    }
}
