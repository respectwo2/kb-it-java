package java0308;

public class ExamMath {
	public static void main(String[] args) {
		double r = Math.random();
		System.out.println(r);
		// 1~ 100 사이 난수 생성
		// 0.0 ~ 0.99999
		r *= 100; // 0.0 ~ 99.99999
		System.out.println(r);
		// +1 후 정수로 변환 0 ~ 99
		int i = (int)(r+1);
		System.out.println(i);
	}
}
