import java.util.Scanner;
public class Laba2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Вычислить выражение... ответ 0,69");
		A1();
		System.out.println("Для произвольной цифры от 0 до 9 вывести на консоль ее значение прописью. \r\n" + 
				"Например, для цифры 9 на консоли должна быть напечатана строка «Девять»");
		System.out.println("Введите число");
		A2(in.nextInt());
		System.out.println("Задание  обратное  первому:  при  вводе  слов,  обозначающих  цифры  от  0  до \r\n" + 
				"9  -  отображать  их  числовое  значение.  Например,  при  вводе  слова \r\n" + 
				"\"девять\"  -  отображать  в  консоле  цифру  9. Введите день");
	    A3(in.next());
	    System.out.println("Дан массив из целых чисел A(n), где n=1,25. Необходимо поменять местами \r\n" + 
	    		"его  максимальный  и  минимальный  элемент  и  вывести  отдельно  максимальный \r\n" + 
	    		"элемент");
		A4();
		System.out.println("Дан массив из целых чисел B(n), где n=1,25. Необходимо упорядочить массив \r\n" + 
				"по возрастанию. \r\n" + 
				"");
		A5();
		System.out.println("Дан  массив  из  целых  чисел  С(n),  где  n=1,20.  Необходимо  найти  среднее \r\n" + 
				"значение и вывести его на консоль.");
		A6();
		System.out.println("Дан  массив  из  целых  чисел  D(n),  где  n=1,30.  Посчитайте  сумму  четных  и \r\n" + 
				"нечетных элементов массива. \r\n" + 
				"");
		A7();
		System.out.println("Напишите  программу,  выводящую  на  консоль  таблицу  3х5  случайных \r\n" + 
				"элементов (a(i,j)< 10). \r\n" + 
				"");
		A8();
		System.out.println("Даны 5 строк s1, s2, s3, s4 и s5, на основе условия: если строка s4 равна строке \r\n" + 
				"s5, нужно сложить строки s1 и s2, иначе нужно сложить строки s1 и s3");
		System.out.println("Введите 5 строк");
		A9(in.next(),in.next(),in.next(),in.next(),in.next());
		
	}

	public static void A1() {
		
		double sum = 0; 
		for(double i =1; i<=10000;i++) {
			if((i%2)==0) {sum=sum-1/i;}
			if(i%2!=0) {sum+=1/i;}			
		}
		System.out.println(sum);
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
	}
	public static void A3(String a) {
		int intt=0;
		switch(a){
		case "ноль":intt=0; break;
		case "один":intt=1;  break;
		case "два":intt=2;  break;
		case "три":intt=3;  break;
		case "четыре":intt=4;  break;
		case "пять":intt=5;  break;
		case "шесть":intt=6;  break;
		case "семь":intt=7;  break;
		case "восемь":intt=8;  break;
		case "девять":intt=9;  break;
		}
		System.out.println(intt);
	}
	public static void A4() {
		short[] array = new short[25]; 
		System.out.print("Исходный массив: "); 
		for (int i=0;i<25;i++){ 
		array[i]=(short)Math.round(99*Math.random()); 
		System.out.print(array[i]+", "); 
		
		}
		System.out.println("\n "); 
		short max=array[0], min=array[0];
		for (int i=0;i<25;i++){ 
			if(max< array[i]) max = array[i];
			if(min> array[i]) min = array[i];
		}
		System.out.println("после переставления большего и меньшего местами: "); 
		for(int i = 0; i<25; i++) {
			if(array[i]==min) {array[i]=max;}
			else if(array[i]==max) {array[i]=min;}	
			System.out.print(array[i]+", "); 
		}
		
		System.out.println("Max - "+maxX(array)); 
		
	}
	public static short maxX(short[]array){ 
		short x=0; 
		x=array[0]; 
		for(int i=1;i<25;i++){ 
		if(x<array[i]){ 
		x=array[i]; }} 
		return x; 
		}
	public static void A5() {
		 
			short temp; 
			short[] array = new short[25]; 
			System.out.print("\nИсходный массив: "); 
			for (int i=0;i<25;i++){ 
			array[i]=(short)Math.round(99*Math.random()); 
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
		short[] array = new short[20]; 
		System.out.print("Исходный массив: "); 
		for (int i=0;i<20;i++){ 
		array[i]=(short)Math.round(99*Math.random()); 
		sum += array[i];
		System.out.print(array[i]+", "); 
		} 
		System.out.print("\n"+ (float)sum/10+ "\nСумма = "+sum);
 
	}
	public static void A7() {
		short sumch = 0;
		short sumnch = 0;
		short[] array = new short[30]; 
		System.out.print("Исходный массив: "); 
		for (int i=0;i<30;i++){ 
		array[i]=(short)Math.round(99*Math.random()); 
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
