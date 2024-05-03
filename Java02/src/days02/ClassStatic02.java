package days02;

class Student{
	int bunho;
	String name;
	int[] scores;
	
	// Static을 쓰는 방법
	// 생성되는 객체마다 1씩 증가하는 값을 가지고 싶을 때 
	static int cnt = 1;
	
	// 항상 클래스 관련 불변의 값을 갖고 필요할 때 불러쓸 값이 저장되기도 합니다. 
	static final String academyname = "Himedia academy";
	
	Student(){
		bunho = cnt;
		name = "아무개"+cnt;
		cnt++;
		scores = new int[3];
	}
}
	


public class ClassStatic02 {

	public static void main(String[] args) {
	
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		
		System.out.println("훈련기관명 : " + Student.academyname);
		System.out.println("현재학생수 : " + (Student.cnt-1));
		
		System.out.println("int형 자료의 가장 큰 값 : " + Integer.MAX_VALUE);
		System.out.println("int형 자료의 가장 작은 값 : " + Integer.MIN_VALUE);

		
	}

}
