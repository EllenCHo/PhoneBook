package com.javaex.pb;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.List;

public class PhoneDB {
	public void ReadList(List<PhoneBook> list) throws IOException {
		Reader fr = new FileReader("phoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		List<PhoneBook> pbList = list;

		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}

			String[] info = str.split(",");
			pbList.add(new PhoneBook(info[0], info[1], info[2]));
		}

		br.close();
	}
	
	
	public void WriteList(List<PhoneBook> list) throws IOException {
		Writer fw = new FileWriter("phoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		List<PhoneBook> pbList = list;
		
		for(PhoneBook pb : pbList) {
			bw.write(pb.getName()+","+pb.getHp()+","+pb.getCompany());
			bw.newLine();
		}
		
		bw.close();
	}

}
