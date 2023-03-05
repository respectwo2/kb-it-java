package java01;

public class ExamFor {

	public static void main(String[] args) {
		System.out.println("** 구구단 **");

		for (int dan = 2; dan < 10; dan++) {
			System.out.println("\n**"+dan+"단 **");
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
			
		} //end for dan 
		
		
	}

}
