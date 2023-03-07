package java0307;

public class ExamPerson {
	public static void main(String[] args) {
//		Person p1 = new Person("홍길동", 30);
//		Person p2 = new Person("김길동", 32);
//		System.out.println(p2);
		
		Person[] pa = new Person[5]; // person을 저장할 배열 객체를 만든 것
		System.out.println(pa[0]);
		
		pa[0] = new Person("홍",30);
		pa[1] = new Person("김", 32);
		System.out.println(pa[0]);
		
	}

}
