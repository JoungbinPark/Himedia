package days0503;
/* Object 클래스
	개발자가 클래스 하나를 새롭게 만들면 자동으로 상속(extends)되는 클래스
	자바 내부에 존재하는, 그리고 새롭게 만들어지는 모든 클래스는 보이지 않는 곳에 extends Object가 존재
	자바 내부에 존재하는 그리고 새롭게 만들어지는 모든 클래스의 부모클래스
	자바의 클래스는 한클래스당 하나의 부모클래스만 갖을 수 있습니다. 
	Object가 아닌 다른 클래스를 상속하면 그 클래스에서 extends Object가 지워집니다. 
	이렇게 extends Object가 지워지는 경우는 상속받은 부모클래스가 이미 Object를 상속하고 있기 때문에
	결국 또 Object의 손자클래스가 됩니다. 
 */


class UserClass{}


public class Extends06_Object01 {
	
	public static void main(String[] args) {
		
		UserClass obj = new UserClass();
		System.out.println(obj);
		System.out.println(obj.toString());
		
		String str = new String("가나다라마바사");
		System.out.println(str);
		System.out.println(str.toString());
		
		//String클래스 안에는 자기 나름의 toString()메서드가 overriding되어 있습니다. 
		//그래서 "패키지이름.클래스이름@해시코드"가 아닌 저장된 문자열이 출력됩니다.
		
		
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		
		//사용자가 새롭게 정의한 클래스도 toString을 오버라이딩해서 클래스에 맞게 설정할 수 있습니다. 		
	}
}
