package Laba7;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("������� ��������� ��� ������ ");
		String str = in.nextLine();
		System.out.println("������� ������ ���� ������ � ������� ����� ������ ����� ������");
		System.out.println("������ f.txt name.txt");
		String arr[] = in.nextLine().split(" ");
		//����� ����� ��������� ���������
		for(String name:arr) {
			new Thread(
			new SearchPotoc(str, name)).start();			
		}
		
		
		Thread.sleep(5000);
		
		//����� ���� ������ ���� �����
		for(String name:arr) {
			new Thread(
			new SearchSchetWord(name)).start();			
		}
	}
}
