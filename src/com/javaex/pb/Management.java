package com.javaex.pb;

import java.util.List;
import java.util.Scanner;

/*
 * PhoneBookApp의 기능을 담고 있는 클래스
 * setList : 관리할 리스트를 전달받아 저장
 * showList : 전화번호를 담고있는 리스트를  화면에 띄워줌
 * register : 이름, 전화번호, 회사 번호를 키보드로 받아서 리스트에 저장
 * delete : 삭제할 번호를 키보드로 받아서 리스트에서 삭제
 * search : 검색할 이름을 키보드로 받아서 리스트에서 검색
 */

public class Management {
	List<PhoneBook> list;
	Scanner sc = new Scanner(System.in);
	
	public void setList(List<PhoneBook> list) {
		this.list = list; 
	}
	public void showList() {
		for(PhoneBook temp : list) {
			System.out.println((list.indexOf(temp)+1)+"."+temp.getName()+"\t"+temp.getHp()+"\t"+temp.getCompany());
		}
		
		System.out.println();
		
	}
	
	public void register() {
		System.out.print(">이름: ");
		String name = sc.nextLine();
	
		System.out.print(">휴대전화: ");
		String hp = sc.nextLine();
		
		System.out.print(">집전화: ");
		String company = sc.nextLine();
		
		list.add(new PhoneBook(name, hp, company));
		System.out.println("[등록되었습니다.]");
		System.out.println();
	}
	
	public void delete() {
		System.out.print(">번호: ");
		
		int index = sc.nextInt();
		
		if(list.size() < index) {					//size는 리스트의 갯수를 반환한다.
			System.out.println("리스트에 있는 번호가 아닙니다.");
			System.out.println();
		} else {
			list.remove(index-1);
			System.out.println("[삭제되었습니다.]");
			System.out.println();
		}
		
	}
	
	public void search() {
		boolean flag = false;
		System.out.print(">이름: ");
		
		String name = sc.nextLine();
		
		for(PhoneBook search : list) {
			if(search.getName().contains(name)) {
				System.out.println((list.indexOf(search)+1)+"."+search.getName()+"\t"+search.getHp()+"\t"+search.getCompany());
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("이름을 찾지 못했습니다. [검색 단어:"+name+"]");
		}
		System.out.println();
	}

}
