package com.ohgiraffers.section05.parameter;

public class RectAngle {
    private double width;
    private double height;

    public RectAngle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void calcArea(){
        double area;
        area = width * height;
        System.out.println("사격형의 넒이 : "+ area);

    }

    public void calcRound(){
        double round;
        round = (width + height) * 2;
        System.out.println("사각형의 둘레 : "+ round);
    }


}
