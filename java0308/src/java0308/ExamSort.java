package java0308;

import java.util.Arrays;
import java.util.List;

public class ExamSort {
	public static void main(String[] args) {
		int[] arr = new int[] {3,7,1,5};
		Arrays.sort(arr);	// 배열을 정렬할떄 사용
		System.out.println(arr);

		String s = Arrays.toString(arr);
		System.out.println(s);
	}
}
