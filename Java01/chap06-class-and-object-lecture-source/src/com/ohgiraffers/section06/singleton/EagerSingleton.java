package com.ohgiraffers.section06.singleton;

public class EagerSingleton {
    private static EagerSingleton eager = new EagerSingleton();
    private EagerSingleton() {}     //private로 클래스 생성자를 선언 -> 외부에서 생성자에 접근하지 못하게 함
    public static EagerSingleton getInstance(){return eager;}       //대신 getInstance() 메서드를 통해 eager에 접근하게 함

}
