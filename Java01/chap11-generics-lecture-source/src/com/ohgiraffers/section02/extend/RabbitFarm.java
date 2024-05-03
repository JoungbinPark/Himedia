package com.ohgiraffers.section02.extend;

//제너릭에 인터페이스를 상속받기 위해선 implements가 아닌 extends를 사용해야한다.
//public class RabbitFarm<T implements Animal> {}          //에러
//public class RabbitFarm<T extends Animal> {}             //정상
//public class RabbitFarm<T extends Rabbit & Animal> {}        //클래스와 인터페이스 상속 : 클래스가 앞에, 인터페이스가 뒤에 와야 가능
//public class RabbitFarm<T extends Rabbit, snake> {}            //타입변수로서 받는다


public class RabbitFarm<T extends Rabbit> {
    private T animal;

    public RabbitFarm(){}
    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}