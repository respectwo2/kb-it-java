package java0307;

public class ExamInheritance {
	public static void main(String[] args) {
		S s1 = new S("홍",20,"컴공");
//		s1.name = "홍";
//		s1.age = 20;
//		s1.jeongong ="컴공";
		System.out.println(s1);
	}
}//end class

class P{
	private String name;
	private int age;
	
	public P(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+","+age; 
	}
}
class S extends P{ //S라는 클래스는 P를 상속받는다 (화살표로 가리킴)
	String jeongong; //S라는 클래스에는 전공밖에 없지만 상속받았기 떄문에 가능함

	public S(String name, int age, String jeongong) {
		super(name,age);
		this.jeongong = jeongong;
	}

	@Override
		public String toString() {
			return super.toString()+","+jeongong;
		}
}

