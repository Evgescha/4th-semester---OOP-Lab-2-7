package Laba6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.event.ListDataEvent;

public class Coll {
	//public static List<String> lst = new ArrayList<>();
	public static Stack<String> stack = new Stack<>();
	
	public static void main(String [] args) {
		reader();
		
		
		save();
		
	}
	public static void reader() {
		FileReader fr;
		try {
			fr = new FileReader("1.txt");
			BufferedReader reader = new BufferedReader(fr);
			String line = null;
			while ((line = reader.readLine()) != null) {
			   stack.push(line);
			   System.out.println(line);
			}
			reader.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void save() {
		try {
			PrintWriter pw = new PrintWriter("1.txt");
			String st = null;
			while(!stack.empty()) {
				st = stack.pop();
				pw.println(st);
				System.out.println(st);
			}
			pw.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
