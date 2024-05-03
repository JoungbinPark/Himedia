package days01;

import java.util.ArrayList;

public class Collection02 {
	
	public static void main(String[] args) {
		// ArrayList는 Object 객체를 인자로 받기에 다양한 형태를 가질 수 있다. -> 제너릭으로 제한해서 받으면 해결!
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(1.1);
		a.add("Hello");
		
		Integer i0 = (Integer)a.get(0);
		Double i1 = (Double)a.get(1);
		String i2 = (String)a.get(2);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		//list.add("String");
		list.add(200);
		list.add(300);
		
		for(int i = 0; i <list.size(); i++) {
			int b = list.get(i);	//제네릭으로 생성된 ArrayList 자료를 꺼낼 때는 강제캐스팅이 필요하지 않습니다. 
			System.out.printf("list[%d] = %d\t\t", i, b);
		}
		
	}
}
