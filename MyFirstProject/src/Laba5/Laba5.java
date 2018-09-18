package Laba5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;
/** 
* Пятая лабораторная, документация
* @author Маслов Е.С. */ 
public class Laba5 implements Serializable {
public static void main(String [] args) {
Scanner in = new Scanner(System.in);

/**Поле для хранение числа строк с четной длиной */ 
int schetDlina = 0;

/**Поле для хранения числа строк выше 0.5 */ 
int vische05 = 0;
	try {		
		PrintWriter pw = new PrintWriter("D:\\Program Files\\eclipse-workspace\\MyFirstProject\\bin\\Laba5\\sin.txt");
		for(int i =1; i <=360; i++) {
			pw.println(i+" "+ Math.sin(i));
		}
		pw.close();
		
		pw = new PrintWriter("D:\\Program Files\\eclipse-workspace\\MyFirstProject\\bin\\Laba5\\input.txt");
		System.out.println("Введите число от 0 до 360");
		int ran= in.nextInt();
		pw.println(ran);
		pw.close();
		
		System.out.println("Запись в файл произошла успешно");
	} catch (IOException e) {
		e.printStackTrace();		
	}
	double [] angle = new double[360], sin = new double[360];
	double [][] angle2 = new double[360][2];
	System.out.println("Считываем");
	try {
		FileReader fr = new FileReader("D:\\Program Files\\eclipse-workspace\\MyFirstProject\\bin\\Laba5\\sin.txt");
		
		Scanner sc = new Scanner(fr);
		for(int i =0;i< 359; i++) {			
			angle[i]=Double.parseDouble(sc.next());
			sin[i]=Double.parseDouble(sc.next());
			System.out.println("Считываем angle  = "+angle[i]);
			System.out.println("Считываем sin = "+ sin[i]);	
			
		}	
		fr.close();
		fr = new FileReader("D:\\Program Files\\eclipse-workspace\\MyFirstProject\\bin\\Laba5\\input.txt");
		sc = new Scanner(fr);
		int angl = sc.nextInt();
		System.out.println("Угол из файла " +angl+ ", соотетствующий синус угла "+sin[angl-1]);	
		fr.close();			
	} catch (IOException e) {		
		e.printStackTrace();
	}
	System.out.println("Сериализируем массив");	
	try {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Program Files\\eclipse-workspace\\MyFirstProject\\bin\\Laba5\\sin2.dat")) ;
		oos.writeObject(sin);
		System.out.println("Успешно");	
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	System.out.println("Десериализируем массив");	
   try {
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Program Files\\eclipse-workspace\\MyFirstProject\\bin\\Laba5\\sin2.dat"));
	try {
		double [] sin2 = (double [])ois.readObject();

		System.out.println("Успешно");	
		System.out.println("Угол из файла десериализованного 99, соотетствующий синус угла "+sin2[98]);	
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
   } catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
   FileReader fr;
try {
	fr = new FileReader("D:\\Program Files\\eclipse-workspace\\MyFirstProject\\bin\\Laba5\\sin.txt");
	Scanner sc = new Scanner(fr);
	for(int i =0;i< 359; i++) {			
		String str = sc.next();
		if(str.length()%2==0) schetDlina++;
		if(sin[i]>0.5) vische05++;
	}	
	System.out.println("Четных строк "+ schetDlina);
	System.out.println("Выше 0.5 у "+ vische05);	
	try {
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} catch (FileNotFoundException e) {
	
	e.printStackTrace();
}
	
}
}
