package com.javaex.pb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBookApp {
	public static void main(String[] args) throws IOException {
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		List<PhoneBook> pbList = new ArrayList<PhoneBook>();
		PhoneDB pDB = new PhoneDB();							//텍스트 파일에서 읽고 저장하는 클래스 생성
		Management management = new Management();				//리스트를 관리할 클래스 생성

		System.out.println("*************************************");
		System.out.println("*         전화번호 관리 프로그램                   *");
		System.out.println("*************************************");

		pDB.ReadList(pbList);									//텍스트 파일에서 리스트로 목록 읽어들이기
		management.setList(pbList);								//리스트를 관리할 수 있도록 클래스에게 리스트 넘기기
		
		while (flag) {
			System.out.println("1.리스트\t2.등록\t3.삭제\t4.검색\t5.종료");
			System.out.println("-------------------------------------");
			System.out.print(">메뉴번호: ");

			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
				case 1:
					System.out.println("<1.리스트>");
					management.showList();
					break;
				case 2:
					System.out.println("<2.등록>");
					management.register();
					break;
				case 3:
					System.out.println("<3.삭제>");
					management.delete();
					break;
				case 4:
					System.out.println("<4.검색>");
					management.search();
					break;
				case 5:
					flag = false;
					break;
				default :
					System.out.println("다시 입력해주세요.");	
			}
			
			System.out.println();

		}
		
		pDB.WriteList(pbList); // 텍스트 파일로 저장

		System.out.println("*************************************");
		System.out.println("*               감사합니다                       *");
		System.out.println("*************************************");
		sc.close();
	}

}
