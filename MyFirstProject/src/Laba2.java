import java.util.Scanner;
public class Laba2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("��������� ���������... ����� 0,69");
		A1();
		System.out.println("��� ������������ ����� �� 0 �� 9 ������� �� ������� �� �������� ��������. \r\n" + 
				"��������, ��� ����� 9 �� ������� ������ ���� ���������� ������ ��������");
		System.out.println("������� �����");
		A2(in.nextInt());
		System.out.println("�������  ��������  �������:  ���  �����  ����,  ������������  �����  ��  0  �� \r\n" + 
				"9  -  ����������  ��  ��������  ��������.  ��������,  ���  �����  ����� \r\n" + 
				"\"������\"  -  ����������  �  �������  �����  9. ������� ����");
	    A3(in.next());
	    System.out.println("��� ������ �� ����� ����� A(n), ��� n=1,25. ���������� �������� ������� \r\n" + 
	    		"���  ������������  �  �����������  �������  �  �������  ��������  ������������ \r\n" + 
	    		"�������");
		A4();
		System.out.println("��� ������ �� ����� ����� B(n), ��� n=1,25. ���������� ����������� ������ \r\n" + 
				"�� �����������. \r\n" + 
				"");
		A5();
		System.out.println("���  ������  ��  �����  �����  �(n),  ���  n=1,20.  ����������  �����  ������� \r\n" + 
				"�������� � ������� ��� �� �������.");
		A6();
		System.out.println("���  ������  ��  �����  �����  D(n),  ���  n=1,30.  ����������  �����  ������  � \r\n" + 
				"�������� ��������� �������. \r\n" + 
				"");
		A7();
		System.out.println("��������  ���������,  ���������  ��  �������  �������  3�5  ��������� \r\n" + 
				"��������� (a(i,j)< 10). \r\n" + 
				"");
		A8();
		System.out.println("���� 5 ����� s1, s2, s3, s4 � s5, �� ������ �������: ���� ������ s4 ����� ������ \r\n" + 
				"s5, ����� ������� ������ s1 � s2, ����� ����� ������� ������ s1 � s3");
		System.out.println("������� 5 �����");
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
	}
	public static void A3(String a) {
		int intt=0;
		switch(a){
		case "����":intt=0; break;
		case "����":intt=1;  break;
		case "���":intt=2;  break;
		case "���":intt=3;  break;
		case "������":intt=4;  break;
		case "����":intt=5;  break;
		case "�����":intt=6;  break;
		case "����":intt=7;  break;
		case "������":intt=8;  break;
		case "������":intt=9;  break;
		}
		System.out.println(intt);
	}
	public static void A4() {
		short[] array = new short[25]; 
		System.out.print("�������� ������: "); 
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
		System.out.println("����� ������������� �������� � �������� �������: "); 
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
			System.out.print("\n�������� ������: "); 
			for (int i=0;i<25;i++){ 
			array[i]=(short)Math.round(99*Math.random()); 
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
		short[] array = new short[20]; 
		System.out.print("�������� ������: "); 
		for (int i=0;i<20;i++){ 
		array[i]=(short)Math.round(99*Math.random()); 
		sum += array[i];
		System.out.print(array[i]+", "); 
		} 
		System.out.print("\n"+ (float)sum/10+ "\n����� = "+sum);
 
	}
	public static void A7() {
		short sumch = 0;
		short sumnch = 0;
		short[] array = new short[30]; 
		System.out.print("�������� ������: "); 
		for (int i=0;i<30;i++){ 
		array[i]=(short)Math.round(99*Math.random()); 
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
