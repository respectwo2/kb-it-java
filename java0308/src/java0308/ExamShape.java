package java0308;

public class ExamShape {
	public static void main(String[] args) {
		//자바로 그림판 작성
		//만든 도형 정보 저장하는 클래스
		//Line(x1,y1, x2,y2), Circle(x1,y1 radius)
		//공통정보 Shape(x1, y1)
		//Line은 extends Shape, Circle도
		Shape l1 = new Line(1,1,3,3); //부모타입 변수에 자식타입 객체 저장 => 다형성
									 //Shape에서 선언된 메서드만 사용가능함 ex)l1.getX2 이런거 사용못함!!
									//왜 Line Line 안함??? =>> shape 타입으로 다 묶으면 찾기 편함~
		l1 = new Circle(2,2,5);
		System.out.println(l1);
	}
}
