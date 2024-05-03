package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args){
        /* 다른 클래스에서 작성한 메소드를 호출할 수 있다. */
        /* 다른 클래스에 작성한 메소드 호출 */

        /* 최댓값 최솟값을 비교할 두 정수를 변수로 선언 */
        int first = 100;
        int second = 50;

        /* non-static 메소드의 경우
        * 클래스가 다르더라도 사용방법은 동일 :
        * 클래스명 사용할이름 = new 클래스명();
        * 사용할이름.메소드명();
        * */

        Calculator cal = new Calculator();
        int min = cal.minNumberOf(first, second);
        System.out.println("두 수 중 최솟값 : " + min);

        /* static 메소드의 경우
        * 다른 클래스에 작성된 static 메소드의 경우 호출할 때 클래스명을 반드시 기술해야한다.
        * 클래스명.메소드명();
        * */
        //int max = maxNumberOf(first,second); //클래스명을 생략하면 에러 발생
        int max = Calculator.maxNumberOf(first, second);
        System.out.println("두 수 중 최댓값 : " + max);
        /*
        * static
        * */

        int max2 = cal.maxNumberOf(first, second);
        System.out.println("두 수 중 최댓값 : " + max2);
        /* static메소드도 non-static메소드처럼 호출은 가능하지만 권장하지 않는다.
        * 이미 메모리에 로딩되어 있는 static 메소드는 여러 객체가 공유하게 된다.
        * 그 때 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에 예상치 못한 동작을 유발할 수 있다.
        * 시스템이 복잡할수록 유지보수에 악영향을 준다. */
    }
}
