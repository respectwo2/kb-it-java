package java0306;

public class Calc { 
	
	public Calc() { // 컴파일러가 기본 생성자 메서드 넣어줌 
		System.out.println("~생성~~"); // 호출과 동시에 출력?
	}	//			기본 생성자를 생성해줌 

	public int plus(int i, int j) {
		return i+j; // 
	}
	public int plus(double x, double y) { //메서드 이름은 같아도 파라미터가 다르면 ㄱㅊ을듯?
		return (int) (x+y); // 
	}
	public int plus(int x, double y) { 
		return (int) (x+y);
	}

	public int minus(int i, int j) {
		return i-j;
	}

	public double divide(int i, double j) {
		
		return i/j;
//		return (double)i/j; 더블타입 붙여주기
//		return 1.0*i/j 인트형 타입에 1.0을 곱해주기
		
	}

}
