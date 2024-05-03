package days01;
class Student{
	private int num;
	private String name;
	private int[] scores;
	private int sum;
	private double average;
	
	Student(){
		scores = new int[5];
		name = "홍길동";
		scores[0] = 90;
		scores[1] = 80;
		scores[2] = 70;
	}
	
	Student(String name) {
		//scores = new int[5];
		this();
		this.name = name;
	}
	
	Student(String name, int s1, int s2, int s3) {
		//scores = new int[5];
		this(name);
		scores[0] = s1;
		scores[1] = s2;
		scores[2] = s3;		
	}
}
/* this()
	생성자 안에서 호출되는 this()는 다른 명령보다 항상 위에 있어야 한다.
	순서가 맞지 않으면 에러발생
		에러메세지 : Constructor call must be the first statement in a constructor
 */




public class ClassThis03 {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student("홍길동");
		Student std3 = new Student("홍길남", 98, 87, 89);
	}


}
