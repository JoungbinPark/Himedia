package com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {
    /* final 키워드에 대해 이해할 수 있다. */
    /* final
    * 종단의 의미를 가지는 키워드
    * 사용할 수 있는 위치가 다양하며, 조금씩 다르지만 변경 불가를 의미한다.
    * 1. 지역변수 : 초기화 후 값 변경 불가
    * 2. 매개변수 : 호출 시 전달한 인자 변경 불가
    * 3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
    * 4. 클래스(static) 변수 : 프로그램 start 이후 값 변경 불가
    * 5. non-static 메소드 : 메소드 재작성 불가
    * 6. static 메소드 :메소드 재작성 불가
    * 7. 클래스 : 상속 불가
    * */

    /* 1. non-static field에 final 사용 */
    /* final은 변경 불가의 의미
    * 따라서 초기 인스턴스가 생성되고 나면 기본값 0이 필드에 들어가게 되는데
    * 그 초기화 이후 값을 변경할 수 없기 때문에 선언을 하면서 바로 초기화를 해줘야 한다.
    * 그렇지 않으면 compile error가 발생.
    * */

    //private final int NON_STATIC_NUM;       //선언만 하면 에러 발생 -> 값을 할당(초기화)까지 해줘야 함
    private final int NON_STATIC_NUM = 1;

    /* 생성자를 이용해서 초기화 */
    private final String NON_STATIC_NAME;
    public FinalFieldTest(String NON_STATIC_NAME) {
        this.NON_STATIC_NAME = NON_STATIC_NAME;
    }

    /*2. static field에 final 사용*/
    /* static에서도 자바에서 지정한 기본값이 대입되기 때문에 final 키워드 사용시 초기화를 하지 않으면 에러 발생 */

    //private static final int STATIC_NUM;        //에러남 -> 0으로 초기화되기 때문에 이후 값 변경 불가
    private static final int STATIC_NUM = 1;


/*    public FinalFieldTest(int STATIC_NUM){
        this.STATIC_NUM = STATIC_NUM;
    } */


    /* 생성자를 이용한 초기화 불가능
    * 생성자는 인스턴스가 생성되는 시점에서 호출되기 때문에 그 전에는 초기화가 이루어지지 못한다.
    * 하지만 static은 프로그램이 start할 때 할당되기 때문에 초기화가 되지 않은 상태로 선언된 것과 동일하며
    * 기본값으로 초기화된 후에 값을 변경하지 못하지 때문에 에러가 발생. */

    /* 초기화블럭으로 사용은 가능하다 */

    private static final double STATIC_DOUBLE;

    static {
        STATIC_DOUBLE = 0.5;
    }


}
