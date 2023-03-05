package java01;

import java.util.Scanner;


public class ExamScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //system.in 키보드에 있는 데이터 읽어옴
//		int s1 = sc.nextInt(); //문자열 읽기
//		System.out.println("읽은 숫자:"+s1);
//		s1 = sc.nextInt(); //문자열 읽기
//		System.out.println("읽은 숫자:"+s1);
		String s1 = sc.nextLine();
		System.out.println("읽은 줄:"+s1);
		
	}

}
