package java01;

public class Hello { 

	public static void main(String[] args) {
	char c1 = '가';
	System.out.println(c1);
	System.out.println( (int)c1 );
	System.out.println((char)(c1+1));
	System.out.println((char)(c1+2));
	System.out.println((char)(c1+3));
	
	System.out.println(99/10); //정수/정수 = 정수(정수부만 남음)
	System.out.println(99/10.0); //정수/실수 = 실수(소수이하 보여줌)
	
	//객체 = 어느정도 할당받은 메모리공간 ex)지어놓은 집
	//클래스 = 설계도 (집 구조) 메소드 보고싶을때
	
	
	
	}

}

//줄삭제 ^+d
//sysout ^+Space
//F11 = 디버깅 (왠만하면 안쓰는게 좋을듯)
//^+F11 = 실행
//커서를 두고 Ctrl + Alt 아래화살표
//Alt 위아래 화살표