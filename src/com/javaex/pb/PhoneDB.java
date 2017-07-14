package com.javaex.pb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.List;

/*
 * 텍스트 파일에 리스트를 저장하고 읽어오는 클래스
 * ReadList : list를 받아서 phoneDB.txt에서 불러온 내용을 저장
 * WriteList : list를 받아서 phoneDB.txt에 저장
 */
public class PhoneDB {
	public void ReadList(List<PhoneBook> list) throws IOException {
		Reader fr = new FileReader("phoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}

			String[] info = str.split(",");
			list.add(new PhoneBook(info[0], info[1], info[2]));
		}

		br.close();
	}

	public void WriteList(List<PhoneBook> list) throws IOException {
		Writer fw = new FileWriter("phoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		for (PhoneBook pb : list) {
			bw.write(pb.getName() + "," + pb.getHp() + "," + pb.getCompany());
			bw.newLine();
		}

		bw.close();
	}

}
