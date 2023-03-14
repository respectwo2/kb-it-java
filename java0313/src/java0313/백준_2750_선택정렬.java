package java0313;

import java.util.Scanner;

public class 백준_2750_선택정렬 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int[] arr = new int[N];
	    
	    //5개 입력받기
	    for(int i=0;i<N;i++) {
	        int x=sc.nextInt();
	        arr[i]=x;
	    }
	    int temp=0;
	    
	    for(int i=0;i<N;i++) {
	        for(int j=i+1;j<N;j++) {  
	            if(arr[i]>arr[j]) {  
	                temp=arr[j];  
	                arr[j]=arr[i]; 
	                arr[i]=temp;  
	            }
	        }
	    }
	    for(int i=0;i<N;i++) {
	        System.out.println(arr[i]);
	        
	    }
	}
	}


