package java0307;

public class ExamString {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String ("abc");
		String s4 = new String ("abc");
		//
		System.out.println( s1 == s2 ); // true 주소값 같음
		System.out.println( s1 == s3 ); // false 주소값 다름
		System.out.println( s3 == s4 ); // false 주소값 다름 ( new 해서 새 공간에 할당했기 떄문에 )
		// 만약 문자열 값(내용)을 비교하고 싶어
		System.out.println(s1.equals(s3)); // true 문자열 값이 같음
		System.out.println(s3.equals(s4)); // true
		
		s1 = s1 +  s1;
		
		System.out.println(s1);
	}
	
}
