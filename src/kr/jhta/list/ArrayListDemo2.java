package kr.jhta.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		// 방문자 이름을 저장하는 ArrayList를 생성하고
		// 방문자 이름을 여러개 입력하기
		// "김"씨 성을 가진 사람만 새로운 ArrayList에 저장하기
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> namesKim = new ArrayList<String>();
		
		names.add("김좌진");
		names.add("안중근");
		names.add("윤봉길");
		names.add("김구");
		names.add("유관순");
		
		for (String name : names) {
			String lastName = name.substring(0, 1);
			if ("김".equals(lastName)) {
				namesKim.add(name);
			}
		}
		Collections.sort(namesKim);
		System.out.println(namesKim);
		
	}
}
