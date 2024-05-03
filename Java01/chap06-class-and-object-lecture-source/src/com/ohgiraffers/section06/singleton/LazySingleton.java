package com.ohgiraffers.section06.singleton;

public class LazySingleton {
    private static LazySingleton lazy;
    private LazySingleton() {}      //외부에서 인스턴스를 만드는 것을 차단

    public static LazySingleton getInstance(){
        /* 인스턴스를 생성한 적이 없는 경우 인스턴스를 생성해서 반환하고
        * 생성한 인스턴스가 있는 경우 만들어둔 인스턴스를 반환 */
        if(lazy == null){
            lazy = new LazySingleton();
        }
        return lazy;
    }
}
