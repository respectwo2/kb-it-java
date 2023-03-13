package java0313;

import java.util.Arrays;

public class Exam연산자 {
	public static void main(String[] args) {
	int a = 1;
//	int b = a++ + 1; // 연산하고 ++ ex) a+1, a++ => a=2, b=2
//	int b = ++a + 1; //ex) a++, a+1 => a=2, b=3
//	System.out.println(a+","+b);
	int c = a++ + ++a + a++ + ++a;
	// 	     1  +  3  + 3   + 5 
	System.out.println(a+","+c);
	
	int[] arr = {100,200,300};
	System.out.println(Arrays.toString(arr));
}
}
