package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo4 {

	// 정적메소드 정의하기
	// ArrayList와 "성씨"를 전달받아서, 그 "성씨"에 해당하는 이름을 출력하는 메소드
	public static void displayNameByFamilyName(ArrayList<String> list, String familyName) {
		for (String name : list) {
			String temp = name.substring(0, familyName.length());
			if (familyName.equals(temp)) {
				System.out.println(name);
			}
		}
	}
	
	// 정적메소드 정의하기
	// ArrayList와 "성씨"를 전달받아서 그 "성씨"에 해당하는 이름을 ArrayList에 담아서 반환하는 메소드
	public static ArrayList<String> getNamesByFamilyName(ArrayList<String> list, String family) {
		ArrayList<String> result = new ArrayList<String>();
		for (String name : list) {
			String temp = name.substring(0, family.length());
			if (family.equals(temp)) {
				result.add(name);
			}
		}		
		return result;
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("김좌진");
		names.add("안중근");
		names.add("윤봉길");
		names.add("김구");
		names.add("유관순");
		names.add("이승만");
		names.add("독고탁");
		
		displayNameByFamilyName(names, "독고");
		ArrayList<String> arr1 = getNamesByFamilyName(names, "김");
		System.out.println(arr1);
	}
}
