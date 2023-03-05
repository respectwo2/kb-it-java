package java01;

public class ExamString {
	public static void main(String[] args) {
		String s1 = new String("Hello"); //Heap에 생성
		String s4 = new String("Hello"); 
		String s2 = "Hello"; // String Literal //Class영역에 생성
		String s3 = "Hello"; 		
	}

}

//Class 영역, Heap, Stack 
//웹개발할때 메모리 관련해서 이해 필요 (스태틱, 리터럴은 사용 자제)
//s1, s4는 가운데 Heap에 들어가고
//s2, s3은 Class영역에 들어감