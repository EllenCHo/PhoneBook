package com.javaex.pb;

/*
 * 전화번호부 틀을 담당하는 클래스
 */
public class PhoneBook {
	private String name;
	private String hp;
	private String company;

	public PhoneBook() {
	}

	public PhoneBook(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
