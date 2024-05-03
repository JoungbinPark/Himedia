package days01;

class Bclass{
	private int age;
	
	Bclass(){
		age = 10;
	}
	
	Bclass(int age){
		this.age = age;
	}
	
	
	
	
	
}

public class ClassConstructor02 {

	public static void main(String[] args) {
		Bclass b = new Bclass();		// 숨어있는 디폴트생성자를 호출합니다.
			//매개변수 있는 생성자를 새로 정의하면 숨어있던 디폴트생성자는 대체된다 -> 둘다 사용하려면 디폴트생성자를 명시해야한다. 
		Bclass c = new Bclass(20);
		Bclass d = new Bclass(30);

	}

}
