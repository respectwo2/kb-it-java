package java0307;

public class ExamStringBuilder {
	public static void main(String[] args) {
	String s = "0123456789";
	// 5000번 연결
	String s1 = s;
	long start = System.currentTimeMillis();
	for (int i = 0; i < 10000; i++) {
		s1 += s; // 문자열 연결
	}
	long start2 = System.currentTimeMillis();
	
	//StringBuffer , StringBuilder
	StringBuilder sb = new StringBuilder("0123456789");
	for (int i = 0; i < 10000; i++) {
		sb.append(s);
	}
	String s2 = sb.toString();
	long end2 = System.currentTimeMillis();
	System.out.println("걸린시간 : "+(end2-start2));
	
	}//end main
}
 // 시험에 나옴 스트링빌더 기억	