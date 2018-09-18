package Laba7;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Введите подстроку для поиска ");
		String str = in.nextLine();
		System.out.println("введите список имен файлов в которых нужно искать через пробел");
		System.out.println("Пример f.txt name.txt");
		String arr[] = in.nextLine().split(" ");
		//поиск точки вхождения подстроки
		for(String name:arr) {
			new Thread(
			new SearchPotoc(str, name)).start();			
		}
		
		
		Thread.sleep(5000);
		
		//вывод всех четных слов файла
		for(String name:arr) {
			new Thread(
			new SearchSchetWord(name)).start();			
		}
	}
}
