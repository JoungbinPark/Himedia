package days02;

import java.util.ArrayList;

class Point{
	private int x;
	private int y;
}

public class Collection03 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		//각종 자료를 object 객체 형태로 받는다
		list.add(10);
		list.add("String");
		Point p = new Point();
		list.add(p);
		
		
		// 그렇기에 따로 변수로 받기 위해선 강제형변환(down casting)이 필요하다.
		int i = (Integer) list.get(0);
		String s = (String) list.get(1);
		Point p1 = (Point) list.get(2);
		
		//제너릭을 선언해줘 리스트에 넣을 자료의 타입을 명시해준다.
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<Point> list3 = new ArrayList<>();

		// 해당하는 타입값만 들어갈 수 있다.
		list1.add(20);
		list2.add("Text");
		list3.add(p);

		//강제형변환이 필요 없다
		i = list1.get(0);
		s = list2.get(0);
		p1 = list3.get(0);

		
		
	}

}
