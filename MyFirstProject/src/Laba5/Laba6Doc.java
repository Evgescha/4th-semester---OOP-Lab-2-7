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
public class Laba6Doc implements Serializable {

/**Поле для хранение числа строк с четной длиной */ 
public static int schetDlina = 0;

/**Поле для хранения числа строк со значением выше 0.5 */ 
	public static int vische05 = 0;
	
	/**
	 * Метод записи в файл
	 * Записывает в один файл все синусы от 1 до 360 и их значения
	 * Записывает в другой файл синус, выбранный пользователем
	 * @param in - консольное чтение
	 * @param pw - PrintWriter для записи в файл
	 * @exception IOException - исключение, которое может возникнуть при записи в файл 
	 */
	public static void Writer() {
		Scanner in = new Scanner(System.in);
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
	}
	/**
	 * Метод для чтения данных из файлов
	 * @param sinAndAngle - двумерный массив для хранения пар угол - синус угла
	 * @exception IOException - исключение, которое может возникнуть при чтении из файла
	 */
	public static void Reader(double [][] sinAndAngle) {
		System.out.println("Считываем");
		try {
			FileReader fr = new FileReader("D:\\Program Files\\eclipse-workspace\\MyFirstProject\\bin\\Laba5\\sin.txt");
			Scanner sc = new Scanner(fr);
			for(int i =0;i< 359; i++) {			
				sinAndAngle[i][0]=Double.parseDouble(sc.next());
				sinAndAngle[i][1]=Double.parseDouble(sc.next());
				System.out.println("Считываем угол  = "+sinAndAngle[i][0]);
				System.out.println("Считываем синус этого угла = "+ sinAndAngle[i][1]);	
				
			}	
			fr.close();
			fr = new FileReader("D:\\Program Files\\eclipse-workspace\\MyFirstProject\\bin\\Laba5\\input.txt");
			sc = new Scanner(fr);
			int angl = sc.nextInt();
			System.out.println("Уголу из файла " +angl+ ", соотетствует синус "+sinAndAngle[angl-1][1]);	
			fr.close();			
		} catch (IOException e) {		
			e.printStackTrace();
		}
	}
	/**
	 * Метод сериализации объекта
	 * 
	 * @param sin - двумерный сериализуеммый массив
	 * @exception FileNotFoundException - исключение, возникающее когда файл не найден
	 * @exception IOException - исключение, которое может возникнуть при сериализации массива
	 */
	public static void Serial(double [][] sin) {
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
	}
	
	/**
	 * Метод десеривлизации объектов
	 * @return массив, десериализованный из файла
	 * @exception ClassNotFoundException - исключение, возникающее при не нахождении необходимого класса в classpath
	 * @exception IOException - исключение, которое может возникнуть при десериализации массива
	 */
	public static double[][] DeSerial() {
		System.out.println("Десериализируем массив");
		double [][] sin2 = null;
		   try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Program Files\\eclipse-workspace\\MyFirstProject\\bin\\Laba5\\sin2.dat"));
			
			 sin2 = (double [][])ois.readObject();
				
				System.out.println("Успешно");	
				System.out.println("Угол из файла десериализованного 99, соотетствующий синус угла "+sin2[98][1]);	
				return sin2;
		   } catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		    catch (IOException e) {
			e.printStackTrace();
		}
		return sin2;
	}
	
	
	/**
	 * Метод подсчета количества строк со значениями больше 0.5 
	 * @param sin - массив проверяемых строк
	 * @exception IOException - исключение, которое может возникнуть при работе с массивами или файлами
	 */	
	public static void Strok(double[][] sin) {
		  FileReader fr;
		  try {
		  	fr = new FileReader("D:\\Program Files\\eclipse-workspace\\MyFirstProject\\bin\\Laba5\\sin.txt");
		  	Scanner sc = new Scanner(fr);
		  	for(int i =0;i< 359; i++) {			
		  		String str = sc.next();
		  		if(str.length()%2==0) schetDlina++;
		  		if(sin[i][1]>0.5) vische05++;
		  	}	
		  	System.out.println("Четных строк "+ schetDlina);
		  	System.out.println("Выше 0.5 у "+ vische05);	
		  	
		  		fr.close();
		  	
		  } catch (IOException e) {
		  	
		  	e.printStackTrace();
		  }
	}
	
public static void main(String [] args) {


	
	double [][] sinAngle = new double[360][2];
	double [][] sinAngle2;
	
	Writer();
	Reader(sinAngle);
	
	Serial(sinAngle);
	sinAngle2 = DeSerial();
	Strok(sinAngle);
 
	
}
}
