package Laba6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wort {
public static List<String> lst = new ArrayList();
	public static void main(String[] args) {
		reader();
		
		boolean bol = false;
		String str = null;
		char str1 = 'a';
		Scanner sc = new Scanner(System.in);
		 System.out.println("������� ����� ��� �������� ��� � ������. ������� Q ��� ������");
		 do {
			str = sc.nextLine();
			str1=str.charAt(0);
			 System.out.println("�� ����� - " + str);
		bol = prow(str);
		if (bol) {System.out.println("���� ����� ����� ");}
		else System.out.println("����� ����� ��� ");
		 }
		 while(str1!='q');
		 System.out.println("����� �������� ");
	}
	public static void reader() {
		FileReader fr;
		try {
			fr = new FileReader("1.txt");
			BufferedReader reader = new BufferedReader(fr);
			String line = null;
			while ((line = reader.readLine()) != null) {
			   lst.add(line);
			   System.out.println(line);
			}
			reader.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public static boolean prow(String str) {
		for(String st:lst) {
		if(st.trim().toLowerCase().contains(str.toLowerCase())) {
			//if(st.equalsIgnoreCase(str)) {
				
				return true;}
		}
		
		return false;
	}
}
