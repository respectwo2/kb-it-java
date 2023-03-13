package java0313;

public class ExamQuick {
/*
 * 9 
 * nx = 9 : 갯수
 * nx-1 : 끝요소의 인덱스번호 8
 * x : 입력숫자 배열
 * 
 * 0 1 2 3 4 5 6 7 8 
 * 5 8 4 2 6 1 3 9 7 -> [x]
 * 
 * quicksort(정렬할 대상배열변수, 정렬시작번호, 정렬끝번호)
 * quicksort(x, 0, nx-1) :
 *  pl=left(0)
 *  lr=right(nx-1:8)
 *  int x= 0+8 / 2 -> x[4] -> pivot: 기준값 [6이 정렬 기준값!!]
 *  
 *  while (a[pl]<x) pl++; // x좌측에서 x보다 큰값 위치찾기
 *  pl -> 1
 *  while (a[pr]>x) pr--;
 *  pr -> 6
 *  
 *  if(pl<= pr) 
 *  	swap(a,pl++, pr--);
 *  	swap(a, pl , pr); pl++; pr++;
 */
}
