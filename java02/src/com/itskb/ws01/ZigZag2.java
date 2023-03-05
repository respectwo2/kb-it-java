package com.itskb.ws01;

public class ZigZag2 {
	public static void main(String[] args) {
		int [][] intArray = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		
		for (int i = 0; i < intArray[i].length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
			switch(j) {
				case 1: intArray[i][j] = (5*j)+1;
				System.out.println(intArray[i][j]);
				break;
				case 2: intArray[i][j] = 22-(5*j);
				System.out.println(intArray[i][j]);
				break;
				case 3: intArray[i][j] = (5*j)+2;
				System.out.println(intArray[i][j]);
				break;
				case 4: intArray[i][j] = 24-(5*j);
				System.out.println(intArray[i][j]);
				break;
				}
			}
			}
	}
}
	
//			if(i == 1) {
//				for (int j = 0; j < intArray[i].length; j++) {
//					intArray[i][j] = (5*j)+1;
//					System.out.print(intArray[i][j]+ " ");
//				}
//			if(i == 2) {
//				for (int j = 0; j < intArray[i].length; j++) {
//					intArray[i][j] = 20-(4*j); 
//					System.out.print(intArray[i][j]+ " ");
//				}
//			if(i == 3) {
//				for (int j = 0; j < intArray[i].length; j++) {
//					intArray[i][j] = (5*j)-2; 
//					System.out.print(intArray[i][j]+ " ");
//				}
//			if(i == 4) {
//				for (int j = 0; j < intArray[i].length; j++) {
//					intArray[i][j] = 18-4*j; 
//					System.out.print(intArray[i][j]+ " ");
//			}
//			}
//			}
//			}
//			}
//		}
//	}
//}
