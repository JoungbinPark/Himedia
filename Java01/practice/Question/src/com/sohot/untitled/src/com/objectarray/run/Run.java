package com.objectarray.run;

public class Run {
    public static void main(String[] args){
        /*
        * 3명의 사원 정보를 배열을 통해 생성한 뒤 출력해보고
        * 객체들 중 값이 없는 필드에는 setter를 통해 각각 값을 수정한 후 다시 출력
        * 직원 각각의 보너스가 적용된 연봉을 계산하여 출력하고
        * 총 직원 연봉의 평균을 구하여 출력
        * */

        //길이 3의 객체배열 생성
        Employee[] employees = new Employee[3];

        //0번 인덱스엔 기본생성자로 생성
        employees[0] = new Employee();

        //1번 인덱스에는 매개변수 6개짜리 생성자를 이용하여 객체 생성
        employees[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "잠실");

        //2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
        employees[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "마곡");

        // 출력(향상된 for문으로 검색하기 위해선 Employee i로 자료형을 선언해줘야 한다.
        for(Employee i : employees){
            System.out.println(i.information());
        }

        System.out.println("===============================");

        // 빈 부분을 setter로 채워주는 작업
        employees[0].setEmpNo(0);
        employees[0].setEmpName("김말똥");
        employees[0].setDept("영업부");
        employees[0].setJob("팀장");
        employees[0].setAge(30);
        employees[0].setGender('M');
        employees[0].setSalary(3000000);
        employees[0].setBonusPoint(0.2);
        employees[0].setPhone("01055559999");
        employees[0].setAddress("광주");

        employees[1].setDept("기획부");
        employees[1].setJob("부장");
        employees[1].setSalary(4000000);
        employees[1].setBonusPoint(0.3);

        for(int i =0; i< employees.length-1; i++){
            System.out.println(employees[i].information());
        }
        System.out.println("===============================");

        //연봉의 평균값 계산을 위한 배열 생성
        int[] moneys = new int[3];

        //전 직원의 연봉값 계산 및 배열에 저장
        for(int i = 0; i<employees.length; i++){
            int salary;     // * 12
            double bonusPoint;  // 보너스 만큼을 추가 -> 연봉
            int money;      //연봉

            salary = employees[i].getSalary();
            bonusPoint = employees[i].getBonusPoint();
            money = (salary+(int)(salary*bonusPoint)) * 12;
            moneys[i] = money;
            System.out.println(employees[i].getEmpName()+"의 연봉 : "+money +"원");
        }
        int sum = 0;
        int avg;

        //연봉 평균 계산
        for(int i = 0; i< moneys.length; i++){
            sum += moneys[i];
        }
        avg = sum/moneys.length;

        System.out.println("============================================");
        System.out.println("직원들의 연봉의 평균 : "+avg+"원");
    }
}
