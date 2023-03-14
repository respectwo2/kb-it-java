package java0313;
import java.util.Scanner;

public class 백준_2750_선택정렬1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
        }
        //선택정렬
        for (int i = 0; i < N-1; i++) {
            int  min = i;
            for (int j = i+1; j < N; j++) {
                if(arr[j]<arr[min]) {
                    min=j;
                }
                if(arr[i]>arr[min]) {
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

