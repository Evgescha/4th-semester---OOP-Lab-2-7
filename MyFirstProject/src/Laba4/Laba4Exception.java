package Laba4;

import java.util.Scanner;

public class Laba4Exception extends Exception{

	
	public void getProblem() {
		System.out.println("¬веденное число не лежит в диапазоне от 0 до 9");
	}
	
	public static void main(String args[]) {
		
		
	}
	public static void checkOn(int a) throws Laba4Exception {
		if(a<0 || a>9) throw new Laba4Exception();
	}
}
