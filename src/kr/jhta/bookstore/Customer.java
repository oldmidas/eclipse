package kr.jhta.bookstore;

import java.util.Date;

public class Customer {
	private String name;
	private String id;
	private String pw;
	private String tel;
	private String email;
	private Date regdate;
	private int point;
	
	public Customer() {}
	
	public Customer(String name, String id, String pw, String tel, String email, Date regdate, int point) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.tel = tel;
		this.email = email;
		this.regdate = regdate;
		this.point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", pw=" + pw + ", tel=" + tel + ", email=" + email
				+ ", regdate=" + regdate + ", point=" + point + "]";
	}


	

}
