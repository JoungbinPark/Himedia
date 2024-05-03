package com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {
    /* 접근제한자
    * 클래스 혹는 클래스 맴버에 참조연산자로 참조연산자로 접근할 수 있는 범위를 제한시키기 위한 키워드
    * 1. public : 모든 패키지에 접근 허용
    * 2. protected : 동일 패키지에 접근 허용. 단, 상속관계에 있는 경우 다른 패키지에서도 접근가능
    * 3. default : 동일 패키지에만 접근 허용 (작성하지 않은 default)
    * 4. private : 해당 클래스 내부에만 접근 가능
    * */

    /* 위 4가지 접근제한자는 클래스 맴버(필드, 메소드)에 모두 가능
    * 하지만 클래스는 public, default만 사용 가능*/

    private String kinds;
    private int hp;

    public void setKinds(String kinds){
        this.kinds = kinds;
    }

    public void setHp(int hp){
        if(hp>0){
            this.hp = hp;
        } else {
            this.hp = 1;
        }
    }

    public String getInfo(){

        return "몬스터의 종류는 " + this.kinds + "이고, 체력은 " + this.hp +"입니다.";
    }

}
