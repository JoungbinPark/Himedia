package days0507;

/* 자바언어에서 제공하는 상속 기능은 단일 상속만을 지원
	하나의 클래스는 하나의 부모클래스를 가질 수 있다.(여러개의 클래스 상속 불가)
	class SubA extends SuperA, SuperB{} -> 에러
	위 내용을 상속의 상속을 거쳐서 구현은 가능
	class SuperA extends SuperB{}
	class SubA extends SuperA{}
 */

/* 다중 상속을 위해 만들어진 Interface
	1. 인터페이스도 클래스
	2. 인터페이스는 멤버필드로 public static final 멤버만 가질 수 있다. 
	3. 일반 멤버변수와 일반 멤버메서드를 가질 수 없다
	4. 자바의 버전이 올라가면서 일반 멤버를 가질 수 있게 되었다.(웹프로그래밍에서는 안쓸 예정)
	5. 하나 이상의 추상메서드를 포함
	6. 다중상속이 가능
 */

interface InterA{
	public static final int num = 10;
	int n1 = 100;	//public static final 이라는 키워드를 생략해도 있는걸로 인식
	
	public abstract void test(); 
	void test3();	//public abstract를 안써도 생략된 상태로 인식되서 있는걸로 적용됨
}

//인터페이스를 상속(구현)하는 클래스는 상속(구현)할 클래스 앞에 extends 대신 implements를 쓴다
class SubA implements InterA{
	@Override
	public void test() {
	}

	@Override
	public void test3() {
	}
	
}


public class Interface01 {

	public static void main(String[] args) {
		// InterA a = new InterA(); //에러 : 추상클래스가 자신의 객체를 만들지 못하는 이유와 같으며 인터페이스는 생성자도 없다
		
		// 부모 인터페이스의 레퍼런스를 사용하여 자식클래스의 객체를 참조 가능
		InterA a1 = new SubA();
		a1.test();
		
		SubA a2 = new SubA();
		method1(a2);
	}

	private static void method1(InterA a) {
		a.test();
	}

}
