package java02;

import java.io.File;

public class ExamFile {
	public static void main(String[] args) {
		File f = new File("."); // .현재 디렉토리
		System.out.println(f.getAbsolutePath());
		String [] List = f.list();
		for (String string : List) {
			System.out.println(string);
		}
	}
}
