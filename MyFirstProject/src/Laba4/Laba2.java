package Laba4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Laba2 {

	public static void main(String[] args) throws Laba4Exception{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//��������� ����� ������������ ������
		System.out.println("��������� ���� ������ �����");
		
		
		int a=in.nextInt();		
		A2(a);
		
		
		
		
		//��������� ���� ����������
		System.out.println("��������� ����������:������� �� ��������, ������������� ������ �������, ������� �� �������� ������");
		try{
			System.out.println("������� ������ �������");
			short[] array = new short[in.nextInt()]; 
			System.out.println("�� ������ �������� ��������� ������?");
			int n =in.nextInt();
			System.out.print("�������� ������: "); 
			for (int i=0;i<n;i++){ 
			array[i]=(short)Math.round(25*Math.random()); 
			System.out.print(array[i]+", "); 				
		}
			String str = "� ��� ���� ��� ������, ������� �������� �� ��� ������� �� �����?";
			System.out.print(str);	
			n = in.nextInt();
			for(int i=0; i<n;i++) {
				System.out.print(str.charAt(i));	
			}
			}
			
		
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(" \n ������� ���������� �������� �� ��������� �������");
		} 
		catch(NegativeArraySizeException ex) {
			System.out.println(" \n������� ������� ������ �������������� �������");
		} 
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println(" \n �������� �������, ������� �� �������� ������");
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
		case 0: str ="����"; break;
		case 1: str ="����";  break;
		case 2: str ="���";  break;
		case 3: str ="���";  break;
		case 4: str ="������";  break;
		case 5: str ="����";  break;
		case 6: str ="�����";  break;
		case 7: str ="����";  break;
		case 8: str ="������";  break;
		case 9: str ="������";  break;
		}
		System.out.println(str);
		System.out.println("������� ���������");
	
	}
	
	public static void A4() {
		short[] array = new short[10]; 
		System.out.print("�������� ������: "); 
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
		System.out.println("����� ������������� �������� � �������� �������: "); 
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
			System.out.print("\n�������� ������: "); 
			for (int i=0;i<10;i++){ 
			array[i]=(short)Math.round(25*Math.random()); 
			System.out.print(array[i]+", "); 
			} 
			System.out.print("\n������ ���������������: "); 
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
		System.out.print("�������� ������: "); 
		for (int i=0;i<10;i++){ 
		array[i]=(short)Math.round(20*Math.random()); 
		sum += array[i];
		System.out.print(array[i]+", "); 
		} 
		System.out.print("\n"+ (float)sum/10+ "\n����� = "+sum);
 
	}
	public static void A7() {
		short sumch = 0;
		short sumnch = 0;
		short[] array = new short[10]; 
		System.out.print("�������� ������: "); 
		for (int i=0;i<10;i++){ 
		array[i]=(short)Math.round(30*Math.random()); 
		if (i%2==0) {
		sumch += array[i]; }
		if (i%2!=0) {
		sumnch += array[i];}
		System.out.print(array[i]+", "); 
		} 
		System.out.println("\n"+ "����� ������ ��������� " + sumch);
		System.out.print("����� �������� ��������� " + sumnch);
	}
	public static void A8() {
		short[] array = new short[15]; 
		System.out.print("�������� ������: "); 
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
		System.out.print("���� "+str);
	}
}
