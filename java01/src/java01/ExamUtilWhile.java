package java01;

import java.util.Random;
import java.util.Scanner;

public class ExamUtilWhile {

	public static void main(String[] args) {
		Random random = new Random();
		int r = random.nextInt(100); // 0에서 100사이 난수 생성
		System.out.println("난수="+r);
		
		Scanner sc = new Scanner(System.in); //for문 돌릴떄 스캐너는 여러개 해봣자 의미없음
		
		int ans = -1;
		while(r != ans) {
			
			System.out.println("0~99사이 숫자를 입력하세요>>");
			ans = sc.nextInt();
			
			if( r == ans) {
				System.out.println("정답입니다");
				
			}else if ( r < ans ) {
				System.out.println("숫자를 낮춰주세요");
			}else {
				System.out.println("숫자를 높여주세요");
				
			}
		}
		
	}

}
//컨트롤 + 1으로 변수이름 생성가능