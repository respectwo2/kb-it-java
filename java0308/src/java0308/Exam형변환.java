package java0308;

public class Exam형변환 {
	public static void main(String[] args) {
		byte b = (byte)200; // 127 ~ -128
		String s = Integer.toBinaryString(200);
		System.out.println(s);
		System.out.println(b);
		//
		short sh = b; // 작은거에서 큰거로는 묵시적 형변환
		b = (byte)sh;
		
		char c = '가';
		int i = c;
		System.out.println((int)c);
		System.out.println(i);
	
		System.out.println("*****");
		
		String s1 = "350";
		int diff = s1.charAt(0) - '0';
		System.out.println(diff);
		
		diff *= 10;
		diff += (s1.charAt(1) - '0');

		diff *= 10;
		diff += (s1.charAt(2) - '0');
		System.out.println(diff);
		
	}//main
}
