package java0306;

public class ExamPerson {
	
	public static void main(String[] args) {

		Person p = new Person(); // 이퀄은 항상 오른쪽 먼저, 뉴 펄슨 먼저 실행하고 p에 저장함
//		p.name = "홍길동";
//		p.age = 30;
		p.setName("홍길동");
		p.setAge(30);
		
		System.out.println(p);
		System.out.println(p.toString());
		
//		p.printInfo(); // Person 클래스안에서 printInfo() 함수를 정의해줬음
//		System.out.println(p.getName()+"의 나이는 "+p.getAge()+"세");
		
//		System.out.println(p.name+"의 나이는 "+p.age);
		
		Person p2 = new Person(); // <- 처럼 초기화 안하고 person p; 하고 네임 하면 오류남

//		p2.name = "김길동";
//		p2.age = 32;
////		System.out.println(p2.name+"의 나이는 "+p2.age);
//		p2.printInfo();
		
		p2.setName("김길동");
		p2.setAge(30);
		System.out.println(p2.getAge()+"세 "+p2.getName());

		
		
	}
}
