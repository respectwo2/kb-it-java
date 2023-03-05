package java02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExamBuffering {
	public static void main(String[] args) throws Throwable {
//		Scanner sc = new Scanner(System.in);
		// InputStream(1Byte 전송) ->
		// InputStreamReader(1Byte-> 2Byte 전송 변환) ->
		// BufferedReader(2Byte씩 8K 버퍼링) -> br.readLine()
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String line = br.readLine();
		System.out.println("line = "+line);
		//공백기준 글자 분할(토크닝, 파싱(Parsing))
		StringTokenizer st = new StringTokenizer(line);
		String s1 = st.nextToken(); // 공백으로 나누어진 글자 추출
		System.out.println("s1 = "+s1);
		String s2 = st.nextToken(); // 공백으로 나누어진 글자 추출
		System.out.println("s1 = "+s2);
		
		
	}
}
