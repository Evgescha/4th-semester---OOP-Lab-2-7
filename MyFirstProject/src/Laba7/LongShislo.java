package Laba7;

import java.util.Scanner;

public class LongShislo implements Runnable{
	long lg;
	LongShislo(long a){
		lg=a;
	}
	
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("������� ���������");	
	Scanner sc = new Scanner(System.in);
	
	int a,b;
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("�� ����� ����� �����������");
	 int c = sc.nextInt();
	long o=a;
	
	while(a<b+1) {
		System.out.println("�� ����� "+ o);
		new Thread(new LongShislo(o)).start();
		o+=c;
	}
	}
	
	public void run() {
	if(lg<2) System.out.println("����� ������� ���������");
	else if(lg%2==0)System.out.println("����� "+lg+" ���������");
	else {
		int pr = 0;
		for(int i =2; i<lg-1;i++) 
		{
			if(lg%i==0) {System.out.println("����� "+lg+" ���������"); return;}
			
		}
		System.out.println("����� "+lg+" �������");
	}
	}


}
