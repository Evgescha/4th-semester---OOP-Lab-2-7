package Laba6;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		Stack<Integer> st3 = new Stack<>();
		st1.push(10);
		st2.push(20);
		st1.push(30);
		st2.push(40);
		st1.push(50);
		st2.push(60);
		System.out.println("First Stack: " + st1);
		System.out.println("Second Stack: " + st2);
		st3 = st1;
		st1=st2;
		st2=st3;
		st3=null;
		System.out.println("First Stack: " + st1);
		System.out.println("Second Stack: " + st2);
	}

}
