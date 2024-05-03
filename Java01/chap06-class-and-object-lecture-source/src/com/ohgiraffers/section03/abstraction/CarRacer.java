package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    private Car car = new Car();

    public void startup(){
        car.startup();
    }

    public void stepAccelerator(){
        car.go();
    }

    public void stepBrake(){
        car.stop();
    }

    public void turnOff(){
        car.turnOff();
    }


}
