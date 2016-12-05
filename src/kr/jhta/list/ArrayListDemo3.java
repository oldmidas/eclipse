package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		// 상품정보를 담는 ArrayList를 생성하고
		// 상품 정보 여러개를 담기
		// 저장된 상품 중에서 색상이 "검정"색인 상품만 화면에 출력하기
		ArrayList<Product> productList = new ArrayList<Product>();
		productList.add(new Product("청바지", "검정", 45000));
		productList.add(new Product("목도리", "빨강", 25000));
		productList.add(new Product("치마", "노랑", 35000));
		productList.add(new Product("스카프", "하양", 25000));
		productList.add(new Product("자켓", "검정", 115000));
		
		for (Product product : productList) {
			String color = product.getColor();
			String name = product.getName();
			if ("검정".equals(color)) {
				System.out.println(name+", "+color+", " + product.getPrice());			
			}			
		}
	}
		
	public static class Product {
		private String name;
		private String color;
		private int price;
		public Product(String name, String color, int price) {
			super();
			this.name = name;
			this.price = price;
			this.color = color;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
	}
}