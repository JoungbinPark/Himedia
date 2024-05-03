package com.greedy.level01.basic.member.model.vo;

public class MemberVO {
    //필드값 선언
    private String id;
    private String pwd;
    private  String name;
    private int age;
    private char gender;
    private String phone;
    private String email;

    //기본 생성자
    public MemberVO() {}

    //매개변수 생성자
    public MemberVO(String id, String pwd, String name, int age, char gender, String phone, String email) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    //getter & setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
