package java02;

public class ExamArray {
	public static void main(String[] args) {
		int [] arr;
//		System.out.println(arr); // 선언만하고 초기화를 안함
		arr = new int[3];
//		System.out.println(arr.length);
		
		int [] arr2 = new int[3]; // 초기화
		System.out.println(arr2);
		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		System.out.println("arr2의 길이="+arr2.length);
	}

}
