package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		// 방문자 이름을 저장하는 ArrayList를 생성하고
		// 방문자 이름을 여러개 입력하기
		// 출력은 "김"씨 성을 가진 사람만 화면에 출력하기
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("곽재우");
		names.add("권율");
		names.add("원균");
		names.add("이순신");
		names.add("김시민");
		names.add("유성룡");
		names.add("김덕령");

		
		
		for (String fullName : names) {
			String lastName = fullName.substring(0, 1);
			if ("김".equals(lastName)) {
				System.out.println(fullName);
			}			
		}
		
	}

}
