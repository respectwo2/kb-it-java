package java01;

import java.util.Iterator;

public class ExamArr {

	public static void main(String[] args) {
		int[] points ; //선언
//		points = null;
		points = new int[3]; //생성 및 할당 
		System.out.println(points); //위치정보
		points[0] = 100;
		points[1] = 200;
		points[2] = 300;
//		points[3] = 400;
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		System.out.println();
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}
	}

}

