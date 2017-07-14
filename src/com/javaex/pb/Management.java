package com.javaex.pb;

import java.util.List;

/*
 * setList : 관리할 리스트를 전달받아 저장
 * PhoneBookApp의 기능을 담고 있는 클래스
 * showList : 전화번호를 담고있는 리스트를 받아 화면에 띄워줌
 * register : 이름, 전화번호, 회사 번호를 받아서 리스트에 저장
 * search : 검색할 이름을 받아서 리스트에서 검색
 */

public class Management {
	List<PhoneBook> list;
	
	public void setList(List<PhoneBook> list) {
		this.list = list; 
	}
	public void showList() {
		for(PhoneBook temp : list) {
			System.out.println((list.indexOf(temp)+1)+"."+temp.getName()+"\t"+temp.getHp()+"\t"+temp.getCompany());
		}
		
		System.out.println();
		
	}
	
	public void register(String name, String hp, String company) {
		list.add(new PhoneBook(name, hp, company));
		System.out.println("[등록되었습니다.]");
		System.out.println();
	}
	
	public void delete(int index) {
		if(list.size() < index) {					//size는 리스트의 갯수를 반환한다.
			System.out.println("리스트에 있는 번호가 아닙니다.");
			System.out.println();
		} else {
			list.remove(index-1);
			System.out.println("[삭제되었습니다.]");
			System.out.println();
		}
		
	}
	
	public void search(String name) {
		for(PhoneBook search : list) {
			if(search.getName().contains(name)) {
				System.out.println((list.indexOf(search)+1)+"."+search.getName()+"\t"+search.getHp()+"\t"+search.getCompany());
			}
		}
		System.out.println();
	}

}
