package com.objectarray.run;

public class Employee {
    //사원 정보 생성
    private int empNo;
    private String empName;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bonusPoint;
    private String phone;
    private String address;

    //기본생성자
    public Employee(){
        System.out.println("기본생성자 호출...");
    };

    //6개의 인자를 받는 생성자
    public Employee(int empNo, String empName, int age, char gender, String phone, String address){
        //this.empNo = empNo 붙여줘야한다.
        this.empNo = empNo;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        System.out.println("6개의 매개변수를 받는 생성자 호출...");
    }

    //모든 인자값을 받는 생성자
    public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address){
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
        this.job = job;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
        this.phone = phone;
        this.address = address;
        System.out.println("모든 매개변수를 받는 생성자 호출...");
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo){
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    public String getDept() {
        return dept;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public String getJob(){
        return job;
    }
    public void setJob(String job){
        this.job = job;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public double getBonusPoint(){
        return bonusPoint;
    }
    public void setBonusPoint(double bonusPoint){
        this.bonusPoint = bonusPoint;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }


    public String information() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", bonusPoint=" + bonusPoint +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
