package java0307;

public class ExamInterface {
	public static void main(String[] args) {

		SwimStudent s1 = new SwimStudent("김평형",21,"체육과");
		s1.swim();
		
		
		SwimCar c1 = new SwimCar("소나타 2022","승용");
		c1.swim();
		//
		
		System.out.println("****");
		Swimmable sw = s1;
		s1.swim();
		
		sw = c1;
		sw.swim();
		System.out.println("****");
		
		Swimmable[] sarr = new Swimmable[2];
		sarr[0] = s1;
		sarr[1] = c1;

		
//		Car cc = (Car)sarr[1]; // cc. 메서드 호출할떄 swim은 불가능
		
		SwimCar cc = (SwimCar)sarr[1];
//		Swimcar로 형변환해서 사용할 시 cc. swim 포함 모두 호출 가능
		
		
		for (int i = 0; i < sarr.length; i++) {
			sarr[i].swim();
		}
	}
}

interface Swimmable{ //수영 할수있는 객체가 가져야 하는 타입
	void swim();
}

class SwimCar extends Car implements Swimmable{

	public SwimCar(String model, String type) {
		super(model,type);
	}

	@Override
	public void swim() {
		System.out.println("수중프로펠러 가동");
	}

}

class Car{
	
	String model, type; // type=승용,화물,버스 model=소나타,제너시스...
	
	public Car(String model, String type) {
		this.model = model;
		this.type = type;
	}
}


//수영가능한 학생 + 없어도 swim() 메서드 호출되는데 왜만듬?? ==> 수영할줄 아는놈들만 불러낼수가잇음
class SwimStudent extends Student implements Swimmable{

	public SwimStudent(String name, int age, String jeongong) {
		super(name, age, jeongong);
		
	}

	@Override
	public void swim() {
		System.out.println("평형으로 수영하기");
	}
	
}