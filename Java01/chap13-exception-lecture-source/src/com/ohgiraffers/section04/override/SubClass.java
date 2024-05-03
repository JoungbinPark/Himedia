package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{
/*    @Override
    public void method() {}*/       //예외 없이 오버라이딩 가능
/*    @Override
    public void method() throws IOException{}*/     //부모와 같은 예외처리방식은 사용할 수 있다.

/*    @Override
    public void method() throws Exception{}*/       //부모의 예외처리방식보다 상위의 예외처리방식으론 할 수 없다.(IOException -> Exception)

    /* 부모의 예외처리보다 하위예외인 경우 오버라이딩 할 수 있다. */
    @Override
    public void method() throws FileNotFoundException {}

}
