package java0313;

import java.util.Arrays;
import java.util.Scanner;

public class forstudy {
	static int max4(int a, int b, int c) {
		int min = a;
		if(b<min)
			min = b;
		if(c>min)
			min = c;
		
		return min;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
}
