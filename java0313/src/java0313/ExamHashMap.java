package java0313;

import java.util.HashMap;

public class ExamHashMap {
	public static void main(String[] args) {
	//Collection = 값만 저장(순서지원-List, 미지원-Set(쓸일없음))
	//Map = 키와 값을 저장
	HashMap<String, Integer> scores = new HashMap<>();
	scores.put("홍", 90);
	scores.put("김", 90);
	scores.put("박", 85);
	
	System.out.println(scores);
	//검색
	System.out.println(scores.get("강")); // 없으면 null
	System.out.println(scores.getOrDefault("강",0)); //없으면 뒤에거 반환
	//수정: put(K,V)
	//삭제 
	scores.remove("홍");
	System.out.println(scores);
	}
}
