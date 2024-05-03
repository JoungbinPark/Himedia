package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass{
    /* 1. 메소드 이름을 변경하면 에러 발생 */
    /*@Override
    public void method2(int num){
    }*/

    /* 2. 메소드의 리턴타입을 변경하면 에러 발생 */
    /*@Override
    public int method(int num) {
        return 0;
    }*/

    /* 3. 매개변수의 타입, 개수, 순서가 변경되면 에러 발생 */
    /*@Override
    public void method(String num) {
    }*/

    /* 4, 메소드이름, 리턴타입, 매개변수의 개수/타입/순서가 일치할 경우 오버라이드 성립*/
    @Override
    public void method(int num){
    }

    /* 5. private 메소드는 오버라이딩 불가*/
/*    @Override
    private void privateMethod(){}*/

    /* 6. final 메소드는 오버라이딩 불가 */
    /*@Override
    public final void finalMethod(){}*/

    /* 같은 범위라 오버라이딩 가능*/
 /*   @Override
    protected void protectedMethod() {
    }
    */
    /* 더 넓은 범위도 오버라이딩 가능 */
    @Override
    public void protectedMethod(){
    }

    /* 참고로 클래스에도 final 키워드를 추가할 수 있는데 이는 상속을 제한하는 키워드(클래스 확장 불가)*/

}
