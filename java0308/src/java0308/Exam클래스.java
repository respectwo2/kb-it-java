package java0308;

public class Exam클래스 {
	public static void main(String[] args) {
		AA.j = 300; // 추천
		AA a1 = new AA(); 
		a1.i = 100;
		AA a2 = new AA();
		a2.i = 200;
		a1.j = 400; // 비추
		
		System.out.println(AA.j);
	}
}

class AA{
	int i; // 인스턴스 변수 -> 인스턴스 만든 후 사용가능
	static int j; // 클래스 멤버 변수
	
	void prn() {
		System.out.println(i+", "+j);
	}
	static void prn2(){
//		AA a1 = new AA();
//		System.out.println(a1.i+", "+j); //static메서드는 클래스 내에서만 접근가능
		System.out.println(("prn2()..."));
	}
	} //스태틱 개념 이해 필요 ( 객체없이 혼자서 쓸수잇는 메서드나 객체)
