package java01;

public class ExamArr2 {
	public static void main(String[] args) {
		//변수 선언할때만 사용 가능한 구문
		int[] points = {100, 200, 300}; // 초기화 1
		//선언과 재할당시 언제나 가능
		int[] points2 = new int[] {100, 200, 300}; // 초기화 2
		
		points = new int[] {300, 400, 500};
	}

}
