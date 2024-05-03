package com.ohgiraffers.section03.copy;

public class Application2 {
    public static void main(String[] args){
        /* 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다. */

        /* 얕은 복사의 활용
        * 주로 메소드 호출 시 인자로 사용하는 경우와
        * 리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용 */

        String[] name = {"홍길동", "유관순", "이순신"};

        System.out.println("name.hashCode() = " + name.hashCode());     //1283928880

        /* 1. 인자와 매개변수로 활용 */
        print(name);

        /* 2. 리턴값으로 활용 */
        String[] animals = getAnimals();
        System.out.println("animals.hashCode() = " + animals.hashCode());
        print(animals);



    }
    // 인자로 받은 배열의 해시코드와 값을 출력하는 메소드
    public static void print(String[] sarr){
        System.out.println("sarr.hashCode() = " + sarr.hashCode());
        for(int i = 0; i< sarr.length; i++){
            System.out.print(sarr[i] + " ");
        }
        System.out.println();

    }
    // Animals 배열을 리턴하는 메소드(얕은 복사 형태로 리턴)
    public static String[] getAnimals(){
        String[] animals = new String[] {"뱀", "판다", "다람쥐"};
        System.out.println("새로만든 animals의 hashcode() = " + animals.hashCode());
        return animals;
    }
}
