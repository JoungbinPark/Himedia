package days01;

/* this 키워드의 용도 #1
	this 변수는 레퍼런스(참조) 변수.
	멤버변수는 new 생성자()에 의해 새로운 공간 객체별로 각각 만들어짐
	반면 멤버메서드는 한 개만 만들어지며, 각 객체들이 공유&호출해서 사용
	이 때 메서드 내에는 "누가 자신을 호출했는지를 구분"하기 위해 this라는 참조변수를 준비
	호출객체의 주소(참조값)이 this에 저장	
 */

class Cclass{
	private int num;
	
	public void init(int num/*, Cclass this*/) {
		this.num = num;
		System.out.println(this.num);
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public void copy(Cclass b) {
		this.num = b.num;
	}
	
	
	
	
	
}

public class ClassThis01 {
	
	public static void main(String[] args) {
		Cclass c1 = new Cclass();
		Cclass c2 = new Cclass();
		Cclass c3 = new Cclass();
		c1.init(10);		//10 -> init 메서드의 매개변수 n	c1은 init 메서드의 this로 전달
		c2.init(20);		
		c3.init(30);	
		
		//Cclass c4 = c3;		//참조값의 복사
		//c3.setNum(100);
		//System.out.println(c3.getNum());	//100
		//System.out.println(c4.getNum());	//100
		
		Cclass c4 = new Cclass();
		c4.copy(c3);
		c3.setNum(100);
		System.out.println(c3.getNum());	//100
		System.out.println(c4.getNum());	//30
		
	}

}
