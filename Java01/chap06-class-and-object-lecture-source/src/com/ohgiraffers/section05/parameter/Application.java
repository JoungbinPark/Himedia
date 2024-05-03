package com.ohgiraffers.section05.parameter;

public class Application {
    public static void main(String[] args) {
        /* 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */

        /* 매개변수(parameter)로 사용가능한 자료형
        * 1. 기본자료형
        * 2. 기본자료형 배열
        * 3. 클래스 자료형
        * 4. 클래스 자료형 배열
        * 5. 가변인자
        * */

        /* 인스턴스 생성 */
        ParameterTest pt = new ParameterTest();

        /* 1. 기본자료형을 매개변수로 전달받는 메소드 호출확인 */
        int num = 10;
        pt.testPrimaryType(num);

        /* 2. 기본자료형 배열을 매개변수로 전달받는 메소드 호출확인 */
        int [] iarr = new int[] {1,2,3,4,5};
        System.out.println("인자로 전달하는값 : " + iarr);
        pt.testPrimaryTypeArray(iarr);

        /* 3. 클래스 자료형을 매개변수로 전달받는 메소드 호출확인 */
        RectAngle rect = new RectAngle(12.5, 22.5);
        System.out.println("인자로 전달하는 값 :"+rect);
        pt.testClassType(rect);

        System.out.println("변경 후 사각형의 넓이와 둘레");
        rect.calcRound();
        rect.calcArea();

        /* 4. 클래스 자료형 배열은 뒤에서 다룬다. */

        /* 5. 가변인자 */ //String...hobby
        pt.testVariableLengthArray("홍길동");              //가변인자는 전달하지 않아도 됨
        pt.testVariableLengthArray("유관순" ,"볼링");                       //한개도 가능
        pt.testVariableLengthArray("이순신", "볼링","축구","농구");          //여러개도 가능
        pt.testVariableLengthArray("신사임당", new String[]{"테니스", "볼링"});      //배열도 가능

    }
}
