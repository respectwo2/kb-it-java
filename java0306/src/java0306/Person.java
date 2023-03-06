package java0306;

/** 사람에 대한 기본 정보 정의용 <br>
 * 이름, 나이
 * @author student
 * 
 */ // java doc 코멘트

public class Person {
	String name;
	int age;

	public Person() {

	}
	
	public Person(String name, int age) { //생성자 메서드가 아니기떄문에 호출안됨 (void = 리턴타입 없애야함)
		System.out.println("this : "+this);
		this.name = name;
		this.age = age;
		
	}

	public Person(int age, String name) {
		this(name,age); //생성자 메서드 호출// age,name받는건데 디스로 인해 일부러 거꾸로 받아줌 자기 자신을 호출하지 않도록
	}

	//메서드 만들때 리턴타입을 적어줘야함
	void printInfo() {
		System.out.println(name+"의 나이는 "+age+"세"); //1. 메서드 내부변수를 먼저찾고 없으면 2. 멤버변수를 찾음 -> 없으면 오류남
	}
		
	

		
	
}
