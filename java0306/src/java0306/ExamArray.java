package java0306;

public class ExamArray {

	public static void main(String[] args) {
		int [] arr1 = new int [3];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		System.out.println("arr1의 길이 = "+arr1.length);
		
		int [] arr2 = new int[] {100, 200, 300};
		
		
		int [][] arr3 = new int [][] {{1,2,3},{4,5,6}};
		int [][] arr4 = new int [][] {{1,2},{4,5,6}}; // 가변배열 자바의 장점중 하나
		
		System.out.println("arr3의 길이 = "+arr3.length);
		System.out.println(arr3[0].length);
		///
		for (int is : arr2) {
			System.out.println(is);
		}
	
	}

}
 // 길이 length 찾기 퀴즈문제엿음