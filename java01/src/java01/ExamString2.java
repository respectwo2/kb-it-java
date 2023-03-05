package java01;

public class ExamString2 {
	public static void main(String[] args) {
		String s1 = "1";
		String s2 = s1 + 100;
		System.out.println( s2 );
		System.out.println(s1);
		char c1 = 'A';
		int i = c1 + 100; //c1은 2b 100은 4b 자동으로 4b로 형변환
//		String s3 = (String) 100; int형에서 String으로 변환 불가/ 객체로 만들어야함
		System.out.print("100");
		System.out.println("100");
		System.out.println("100");
	}
}
