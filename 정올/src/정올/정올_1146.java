package 정올;

import java.util.Scanner;

public class 정올_1146 {
	static void swap(int []a,int idx1,int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < N-1; i++) {
			int min = i;
			for (int j = i+1; j < N; j++) {
				if(arr[j]<arr[min]) {
					min = j;
			}
		}
			swap(arr,i,min);
			
		for (int k = 0; k < N; k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		
		
	}
}
}
