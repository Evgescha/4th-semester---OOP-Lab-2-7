package Laba4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Laba2 {

	public static void main(String[] args) throws Laba4Exception{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//обработка ввода некорректных данных
		System.out.println("ожидается ввод целого числа");
		
		
		int a=in.nextInt();		
		A2(a);
		
		
		
		
		//обработка трех исключений
		System.out.println("обработка исключений:элемент за пределом, отрицательный размер массива, позиция за границей строки");
		try{
			System.out.println("Введите размер массива");
			short[] array = new short[in.nextInt()]; 
			System.out.println("до какого элемента заполнять массив?");
			int n =in.nextInt();
			System.out.print("Исходный массив: "); 
			for (int i=0;i<n;i++){ 
			array[i]=(short)Math.round(25*Math.random()); 
			System.out.print(array[i]+", "); 				
		}
			String str = "У нас есть эта строка, сколько символов из нее вывести на экран?";
			System.out.print(str);	
			n = in.nextInt();
			for(int i=0; i<n;i++) {
				System.out.print(str.charAt(i));	
			}
			}
			
		
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(" \n попытка адресовать элементы за пределами массива");
		} 
		catch(NegativeArraySizeException ex) {
			System.out.println(" \nпопытке создать массив отрицательного размера");
		} 
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println(" \n указание позиции, лежащей за границей строки");
		}
	    //A3(in.next());
		
		//A4();
		//A5();
		//A6();
		//A7();
		//A8();
		//A9(in.next(),in.next(),in.next(),in.next(),in.next());
		
	}


	public static void A2(int a) {
		
		
		String str="";
		
		switch(a){
		case 0: str ="ноль"; break;
		case 1: str ="один";  break;
		case 2: str ="два";  break;
		case 3: str ="три";  break;
		case 4: str ="четыре";  break;
		case 5: str ="пять";  break;
		case 6: str ="шесть";  break;
		case 7: str ="семь";  break;
		case 8: str ="восемь";  break;
		case 9: str ="девять";  break;
		}
		System.out.println(str);
		System.out.println("успешно завершено");
	
	}
	
	public static void A4() {
		short[] array = new short[10]; 
		System.out.print("Исходный массив: "); 
		for (int i=0;i<10;i++){ 
		array[i]=(short)Math.round(25*Math.random()); 
		System.out.print(array[i]+", "); 
		
		}
		System.out.println("\n "); 
		short max=array[0], min=array[0];
		for (int i=0;i<10;i++){ 
			if(max< array[i]) max = array[i];
			if(min> array[i]) min = array[i];
		}
		System.out.println("после переставления большего и меньшего местами: "); 
		for(int i = 0; i<10; i++) {
			if(array[i]==min) {array[i]=max;}
			else if(array[i]==max) {array[i]=min;}	
			System.out.print(array[i]+", "); 
		}
		
		System.out.println("Max - "+maxX(array)); 
		
	}
	public static short maxX(short[]array){ 
		short x=0; 
		x=array[0]; 
		for(int i=1;i<10;i++){ 
		if(x<array[i]){ 
		x=array[i]; }} 
		return x; 
		}
	public static void A5() {
		 
			short temp; 
			short[] array = new short[10]; 
			System.out.print("\nИсходный массив: "); 
			for (int i=0;i<10;i++){ 
			array[i]=(short)Math.round(25*Math.random()); 
			System.out.print(array[i]+", "); 
			} 
			System.out.print("\nМассив отсортированный: "); 
			for(int i=0;i<9;i++){ 
			for(int j=9;j>i;j--){ 
			if(array[j-1]>array[j]){ 
			temp=array[j]; 
			array[j]=array[j-1]; 
			array[j-1]=temp; }}
			System.out.print(array[i]+", "); }
	}
	public static void A6() {
		short sum = 0;
		short[] array = new short[10]; 
		System.out.print("Исходный массив: "); 
		for (int i=0;i<10;i++){ 
		array[i]=(short)Math.round(20*Math.random()); 
		sum += array[i];
		System.out.print(array[i]+", "); 
		} 
		System.out.print("\n"+ (float)sum/10+ "\nСумма = "+sum);
 
	}
	public static void A7() {
		short sumch = 0;
		short sumnch = 0;
		short[] array = new short[10]; 
		System.out.print("Исходный массив: "); 
		for (int i=0;i<10;i++){ 
		array[i]=(short)Math.round(30*Math.random()); 
		if (i%2==0) {
		sumch += array[i]; }
		if (i%2!=0) {
		sumnch += array[i];}
		System.out.print(array[i]+", "); 
		} 
		System.out.println("\n"+ "Сумма четных элементов " + sumch);
		System.out.print("Сумма нечетных элементов " + sumnch);
	}
	public static void A8() {
		short[] array = new short[15]; 
		System.out.print("Исходный массив: "); 
		for (int i=0;i<15;i++){ 
		array[i]=(short)Math.round(9*Math.random()); 
		if(i%3==0) {
			System.out.print("\n"+array[i]+" ");
		} 
		else System.out.print(array[i]+" ");
		} 
	}
	public static void A9(String s1,String s2,String s3,String s4,String s5 ) {
		String str = "";
		if(s4==s5) {str = s1+s2;} else {str = s1+s3;}
		System.out.print("Итог "+str);
	}
}
