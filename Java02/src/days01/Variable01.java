package days01;

class Scores {
	int kor;
	int mat;
	int eng;
	int sum;
	double avg;
}
/* 클래스(Class)
	프로그램으로 처리하고자 하는 대상의 요소들을 자료화하여 하나의 자료형으로 정의한 사용자 정의 자료형
	쉽게 말해 필요에 의해 기본자료형(int, double, char 등) 외에 그들을 그룹화하여 새롭게 정의한 자료형.
	한개 이상의 자료, 하나 이상의 자료형을 저장할 수 있는 복합자료형
	
	클래스는 프로그램 단위로도 사용합니다. 
	클래스 = 자바의 프로그램 단위
	하나의 파일 안에 여러 개의 클래스를 정의하여 사용이 가능합니다.
	다만 여러 개의 클래스 중 하나는
		파일이름과 반드시 같아야 하고
		public이어야 하며
		자체 실행여부에 따라 public static void main(){} 메서드를 포함하고 있어야 합니다. 
	
*/

public class Variable01 {

	public static void main(String[] args) {
		
		System.out.println("겁나 쉬운 자바 프로그램");
		
		int b = 10;
		b = b + 10;
		
		// 객체 생성
		Scores std1 = new Scores();			//std1 : 참조변수, new Scores() : 인스턴스
		// new Scores()에 의해 Heap 영역에 필요한 만큼의 메모리를 확보하고 그 주소를 참조변수 std1에 전달합니다. 
		
		
		//String str = "Korea";				//String은 클래스의 일종
		String str = new String("Korea");
		
		/*
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		*/
		
		std1.kor = 95;
		std1.eng = 85;
		std1.mat = 75;
		std1.sum = std1.kor + std1.eng  + std1.mat;
		std1.avg = std1.sum/3.0;
		
		System.out.println("\t\t ### 성적표 ###");
		System.out.println("---------------------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------");
		
		System.out.printf("%d\t%d\t", std1.kor, std1.eng);
		System.out.printf("%d\t%d\t", std1.mat, std1.sum);
		System.out.printf("%.1f\n", std1.avg);
		
		// 같은 자료형의 다른 객체 생성
		Scores std2 = new Scores();
		
		// 객체 배열 생성
		Scores[] std = new Scores[3];
			// 위 문장은 참조변수 배열을 생성한 거지, Scores 객체가 만들어진 게 아니다.
		
			// 각각의 참조변수에 새로운 인스턴스를 생성해서 넣어준다.
		std[0] = new Scores(); 
		std[1] = new Scores();
		std[2] = new Scores();
		
		
		std[0].kor = 100;
		

	}

}
