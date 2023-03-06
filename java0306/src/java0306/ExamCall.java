package java0306;

public class ExamCall {
	public static void main(String[] args) {
		int a = 100;
		change( a );
		System.out.println(a); // 195p 참조형 변수 일반형 변수 차이? 뭔말인지 모르겟음
		
		int []arr = new int[] {100,200,300};
		change2(arr);
		System.out.println("arr[1]="+arr[1]);
	}

	private static void change2(int[] arr) {
		arr[1] = 900;
	}

	private static void change(int a) {
		a = 200;
	}
}
