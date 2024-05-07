package days0507;

/* 추상클래스
	상속을 통한 다형성(여러 형태의 자식클래스의 객체 생성 & 활용 & 메서드오버라이딩 & type casting)의 구현에 
	강제성(메서드 오버라이딩)을 부여하기 위한 클래스
 */

/* 일반 상속의 문제점 : 강제성의 부재
	상속을 통해 다형성(부모클래스를 상속받아 여러 형태의 자식클래스를 생성하고 활용함)을 구현하고자 하여도, 
	하위클래스에서 메서드 오버라이딩을 구현하지 않으면 다형성을 완벽하게 구현할 수 없습니다. 
class Animal{
	int age;
	public void crying() {
		System.out.println("울음소리~");
	}
}

class Dog extends Animal{
	public void crying() {
		System.out.println("멍멍~");
	}
}

class Cat extends Animal{
	
}
*/

/* 추상클래스 작성방법
	클래스 생성구문 앞에 abstract 키워드를 붙여서 생성
	추상메서드를 포함한 클래스 : 추상메서드를 하나이상 포함하면 추상클래스라고 한다. 
	추상메서드 : 메소드의 원형만 존재하고 실제 내용이 없는 메서드
 */

abstract class Animal{
	public abstract void crying();
}

class Dog extends Animal{
	@Override
	public void crying() {
		System.out.println("멍~멍~");
	}
}

class Cat extends Animal{
	public void crying() {
		System.out.println("냐옹~");
	}
}



public class Abstract01 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.crying();
		Cat c = new Cat();
		c.crying();
		
		//Animal a = new Animal();		//에러 발생 : 추상클래스는 자기자신만으론 객체생성불가
		
		// 1. 부모클래스 참조변수에 자식클래스의 인스턴스를 저장할 수 있으므로 아래와 같이 사용이 가능
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		// 2. 자식클래스의 인스턴스 주소를 저장하고 있는 부모클래스의 참조변수로는 자신이 물려준 멤버에만 접근 가능
		// 3. 자식클래스의 인스턴스 주소를 저장하고 있는 부모클래스의 참조변수로 물려준 멤버메서드를 호출하면 오버라이딩된 메서드가 우선호출된다. 
		a1.crying();
		a2.crying();
		
		method1(a1);
		method1(a2);
		
	}

	private static void method1(Animal a) {
		// 자식클래스가 많아도 메서드의 매개변수로 그 부모클래스가 위치해서 모두를 받아줄 수 있다. 
		a.crying();
		
	}

}
