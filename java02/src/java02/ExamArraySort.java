package java02;

import java.util.Arrays;
import java.util.Random;

public class ExamArraySort {
	public static void main(String[] args) {
		//10개의 난수 저장 정렬
		Random r = new Random(100);
		int[] arr= new int[10];
		//10개 난수저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
			
		}
//		//오름차순 정렬
//		for (int i = 0; i < arr.length-1; i++) { // i 는 시행횟수
//			for (int j = 0; j < arr.length-1-i; j++) { //j는 비교 순서
//				if (arr[j] > arr[j+1]) { //이전 순번값이 다음 순번값보다 크다면
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
				
//			}
//		}
		Arrays.sort(arr);
			//오름차순 정렬, 작은수에서 큰수 순으로 정렬
		System.out.println("정렬후");
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
