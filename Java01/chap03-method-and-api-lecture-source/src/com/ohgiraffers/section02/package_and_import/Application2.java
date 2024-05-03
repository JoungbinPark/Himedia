package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application2 {
    public static void main(String[] args){
        /* 수업목표 : 임포트에 대해 이해할 수 있다. */
        /* 임포트란?
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스이름을 사용해야 한다.
        * 이러한 번거로움을 해결하기 위해 패키지명을 생략하고 사용할 수 있도록 한 구문이 import문이다.
        * import는 package 선언문과 class선언문 사이에 작성하며 어떠한 패키지 내에 클래스를 사용할 것인지 선언하는 효과를 가진다.
        * */

        /* 1. non-static 메소드의 경우 */
        Calculator cal  = new Calculator();
        int min = cal.minNumberOf(50, 60);
        System.out.println("50과 60 중 최솟값 : " + min);

        /* 2. static 메소드의 경우 */
        int max = maxNumberOf(50,60);
        System.out.println("50과 60 중 최댓값 : " + max);

        /* 3. static 메소드를 호출할 때 클래스명을 생략하고 사용할 수 있다. */
        int max2 = maxNumberOf(100, 200); //static import
        System.out.println("100과 200중 큰 값은?" + max2);
    }
}
