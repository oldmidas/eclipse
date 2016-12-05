package kr.jhta.bookstore;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BookStore {
	ArrayList<Customer> customerList = new ArrayList<>();
	private Customer loginId = null;
	
	private boolean isExistId(String id) {
		boolean isExist = false;
		
		for (Customer customer : customerList) {
			if (customer.getId().equals(id)) {
				isExist = true;
				break;
			}
		}
		return isExist;
	}
	
	public void register() {
		Scanner sc = new Scanner(System.in);

		System.out.println("아이디를 입력하세요>");
		String id = sc.next();
		if (isExistId(id)) {
			System.out.println("이미 사용중인 아이디입니다.");
			return;
		}
				
		System.out.println("이름을 입력하세요>");
		String name = sc.next();
				
		System.out.println("비밀번호를 입력하세요>");
		String pw = sc.next();
		
		System.out.println("연락처를 입력하세요>");
		String tel = sc.next();
		
		System.out.println("이메일을 입력하세요>");
		String email = sc.next();
		
		Date now = new Date();
					
		int point = 0;
		
		Customer customer = new Customer(name, id, pw, tel, email, now , point);
		customerList.add(customer);
	}
	
	public void login() {
		if (loginId != null) {
			System.out.println("이미 로그인 중 입니다.");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요>");
		String id = sc.next();
		
		System.out.println("비밀번호를 입력하세요>");
		String pw = sc.next();
		
		for (Customer customer : customerList) {
			if (id.equals(customer.getId()) && pw.equals(customer.getPw())) {
				loginId = customer;
				System.out.println("로그인 되었습니다.");
			} 
//			else {
//				System.out.println("아이디 혹은 비밀번호가 잘못되었습니다.");				
//			}
		}
		if (loginId == null) {
			System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다.");
		}
	}
}
