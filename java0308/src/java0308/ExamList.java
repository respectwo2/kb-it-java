package java0308;

import java.util.ArrayList;

public class ExamList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>(); 
		// <>사이에 타입을 기술해야함 => 제네릭방법
		al.add("abc");
		al.add("cde");
		al.add("xyz");
//		al.add(100); 
		
		System.out.println(al.size());

		String e = al.get(2);
		System.out.println(e);
		
		System.out.println("======");
		
		String r = al.remove(1);
		System.out.println("지워진 값은 = "+r);
		System.out.println(al.size());
		System.out.println(al); // [123 , 456, 789]
		
		
		
		al.add(0, r);
		System.out.println(al);
	}
}
