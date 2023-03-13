package java0313;

public class Exam재귀 {
	public static void main(String[] args) {
	// 팩토리얼
	// 5 * 4 * 3 * 2 * 1
	int ans = factorial( 3 );
	}

	private static int factorial(int i) {
		//종료조건 검사
		if ( i == 0 ) return 1;
		//종료 아니면 로직처리, 재귀함수 실행 & 조건없이 리턴하면 else 생략
		return i * factorial( i- 1); 
		
	}
}
