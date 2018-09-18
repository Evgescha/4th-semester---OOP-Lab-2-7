package Laba7;

import java.util.Scanner;

public class LongShislo implements Runnable{
	long lg;
	LongShislo(long a){
		lg=a;
	}
	
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Вводите диапазона");	
	Scanner sc = new Scanner(System.in);
	
	int a,b;
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.println("на какое число увеличивать");
	 int c = sc.nextInt();
	long o=a;
	
	while(a<b+1) {
		System.out.println("Вы ввели "+ o);
		new Thread(new LongShislo(o)).start();
		o+=c;
	}
	}
	
	public void run() {
	if(lg<2) System.out.println("Число слишком маленькое");
	else if(lg%2==0)System.out.println("Число "+lg+" составное");
	else {
		int pr = 0;
		for(int i =2; i<lg-1;i++) 
		{
			if(lg%i==0) {System.out.println("Число "+lg+" составное"); return;}
			
		}
		System.out.println("Число "+lg+" простое");
	}
	}


}
