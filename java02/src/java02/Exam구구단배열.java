package java02;

public class Exam구구단배열 {
	public static void main(String[] args) {
		//2차원배열 arr에 구구단 결과값을 저장하는 코드를 작성하세요
		//단, 단번호와 인덱스를 동일하게 하세요
		//예 ) arr[2][1] -> 2
		
		int [][] arr = new int [10][10];
		for (int a=2; a<arr.length; a++) {			
			for (int b=2; b<arr.length; b++) {
			arr[a][b] = a*b;
			}
		}
	}
}
