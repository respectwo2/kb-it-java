package java0306;

/** 사람에 대한 기본 정보 정의용 <br>
 * 이름, 나이
 * @author student
 * 
 */ // java doc 코멘트

public class Person {
	String name;
	int age;
	
	//메서드 만들때 리턴타입을 적어줘야함
	void printInfo() {
		System.out.println(name+"의 나이는 "+age+"세"); //1. 메서드 내부변수를 먼저찾고 없으면 2. 멤버변수를 찾음 -> 없으면 오류남
	}
}
