package java0307;

public class ExamStudent {
	public static void main(String[] args) {
		//학생
		Student st1 = new Student("김학생",20,"컴공");
		System.out.println(st1);
		//직원 (이름, 나이, 부서명-dept)
		
		Emp e1 = new Emp("김대리",32,"영업부");
		System.out.println(e1);
		
		//다형성 - 객체의 다형성, 메서드의 다형성
		Person p = st1; //p.변수타입내멤버들
//		p.getAge()	;
//		p.getName()	;
//		st1.getJeongong(); 
		
		Person[] pa = new Person[5];
//		pa[0] = st1;
//		pa[1] = e1; //각자 배열을 만들 필요없음 부모타입 배열에 다 넣으면 관리하기 용이함
		pa[0] = new Student("김",20,"컴공");
		pa[1] = new Student("박",20,"사회학");
		pa[2] = new Emp("김대리",20,"영업");
		pa[3] = new Emp("박과장",20,"개발");
		pa[4] = new Student("황",20,"SW공학");
		
		System.out.println(pa[4]);
	}
}