package days0503;

class Line{
	int x; int y;
	Line(int x, int y){
		this.x = x; this.y = y;
	}
	
	public boolean equals(Object obj) {
		//obj와 this의 각각의 멤버변수 x와 y를 비교. 같으면 true, 다르면 false를 return
		//a1 -> this		a2 -> obj
		//부모참조변수가 자식인스턴스의 멤버변수에 접근이 불가능하므로 형변환이 필요
		
		if(obj instanceof Line) {
			return false;
		}
		Line target = (Line)obj;
		// x변수와 y변수를 비교
		
		boolean result = (this.x == target.x) && (this.y == target.y); 
			
		return result;
	}
}


public class Extends06_Object3 {

	public static void main(String[] args) {
		// 객체들간의 비교
		String s1 = "Hello";
		String s2 = "Hello";
		if(s1==s2) System.out.println("s1 변수와 s2 변수는 같습니다.");
		else System.out.println("s1 변수와 s2 변수는 다릅니다. ");
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		if(s3==s4) System.out.println("s3 변수와 s4 변수는 같습니다.");
		else System.out.println("s3 변수와 s4 변수는 다릅니다. ");
		
		if(s3.equals(s4))System.out.println("s3 변수와 s4 변수는 같습니다.");
		else System.out.println("s3 변수와 s4 변수는 다릅니다. ");
		
		Line a1 = new Line(20, 30);
		Line a2 = new Line(20, 30);
		if(a1==a2)System.out.println("a1 변수와 a2 변수는 같습니다.");
		else System.out.println("a1 변수와 a2 변수는 다릅니다. ");
		
		if(a1.equals(a2))System.out.println("a1 변수와 a2 변수는 같습니다.");
		else System.out.println("a1 변수와 a2 변수는 다릅니다. ");
		//a1과 a2가 같기 위해선 멤버변수 x와 y끼리 비교해서 같을 때 같다(true)를 리턴하도록
		//equals를 오버라이딩해야한다. 
	}
}
