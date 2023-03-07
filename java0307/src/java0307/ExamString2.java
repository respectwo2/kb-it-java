package java0307;


public class ExamString2 {

	public static void main(String[] args) {
		String s1 = new String("Hello Java");
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf("Java"));  //못찾으면 - 반한 
		System.out.println(s1.replace("a", "o"));
		System.out.println(s1.substring(6,8)); // 6 , 7만 반환함
		System.out.println(" abc 123 ".trim()+"*");
	}
}
