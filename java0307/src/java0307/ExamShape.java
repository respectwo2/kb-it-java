package java0307;

public class ExamShape {
	public static void main(String[] args) {
		//자바로 그림판 제작
		//관리대상은 도형정보, 선, 사각, 원
		Shape[] sarr = new Shape[3];
		sarr[0] = new Line(1,1,3,3);
		sarr[1] = new Circle(2,2,5);

		Shape l = new Line(1,1,3,3);
		
		l.draw(); //실제 객체의 오버라이드한 메서드가 실행된다.
		//추상메소드는 엄격하게 draw()를 반드시 사용해야 한다는 강조하는 의미도 있음
	}
}





/*
	도형기본정보 
	Shape 
		x1,y1
		draw() // 그리기 메서드
		 **근데 이 그리기 메서드로는 원인지 사각인지 뭘그려야할지 모르는 문제점**
		 ==> 메서드 오버라이드 (부모한테 있는걸 자식한테 어케 적용할지 재정의함)
		
	Line extends Shape
		x2,y2
	
	Rect extends Shape
		width,height
	
	Circle extends Shape
		radius


*/