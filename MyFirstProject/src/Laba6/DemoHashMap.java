package Laba6;

import java.util.HashMap;
import java.util.Scanner;
public class DemoHashMap {
public static void main(String[] args) 
{
		HashMap<Integer, Integer> d=new HashMap<Integer, Integer>(); 
		HashMap<Integer, Integer> e=new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
		HashMap<String, Integer> g = new HashMap<String, Integer>();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("������� ���������� � n= ");
		int n=sc.nextInt();
		System.out.print("�(x)= c0 ");
				for(int i=1; i<=n; i++)
				{
				System.out.print(" + c"+i+"*x^"+i);
				}
		System.out.println();
				for(int i=0; i<=n; i++)
				{
				System.out.print("c"+i+"=");
				d.put(i, sc.nextInt());
				}
		System.out.print("�(x)= "+d.get(0));
				for(int i=1; i<=n; i++){
				System.out.print(" + "+d.get(i)+"x^"+i);
				}
		System.out.println();
		
		
		
		System.out.print("������� ���������� B n= ");		
		int b=sc.nextInt();
		System.out.print("�(x)= a0 ");
				for(int i=1; i<=b; i++)
				{
				System.out.print(" + a"+i+"*x^"+i);
				}
		System.out.println();
				for(int i=0; i<=b; i++)
				{
				System.out.print("a"+i+"=");
				e.put(i, sc.nextInt());
				}
		System.out.print("�(x)= "+e.get(0));
		for(int i=1; i<=b; i++)
				{
				System.out.print(" + "+e.get(i)+"x^"+i);
				}
		System.out.println();
		
		
		
		int c= n > b ? n : b;
		int cmin= n < b ? n : b;
		h.put(0, d.get(0)+e.get(0));
		System.out.print("�(x)+�(x)= "+h.get(0));
					for(int i=1; i<=c; i++)
					{
						int aaa = d.containsKey(i) ? d.get(i) : 1;
						int bbb = e.containsKey(i) ? e.get(i) : 1;
					h.put(i, aaa+bbb);
					System.out.print(" + "+h.get(i)+"x^"+i);
					}
					
					System.out.println();
					
					/*
					h.put(0, d.get(0)*e.get(0));
					System.out.print("�(x)*�(x)=0 ");
					int count = 0;
					
					for(int i = 0; i < d.size()-1;i++) {
						for(int j =0; j<d.size()-1;j++) {
							h.put(i, d.get(i)*e.get(j));
							int s = i + j;
							System.out.print(" + "+h.get(i)+"x^"+s);
							count++;
						}
					} */
					
					h.put(0, d.get(0)*e.get(0));
					System.out.print("�(x)*�(x)=0 ");
					int count = 0;
					int array [] = new int [c + cmin+1];
					for(int i = 0; i < d.size();i++) {
						for(int j =0; j<e.size();j++) {
							int s = i + j;
							int ans = d.get(i)*e.get(j);
							
							array[s]+=ans;
							g.put(i+"*"+j, d.get(i)*e.get(j));
							
							System.out.print(" + "+g.get(i+"*"+j)+"x^"+s);
							count++;
							
						}
					}
					System.out.println();
					System.out.print("�(x)*�(x) = 0");
					for(int i=0;i<array.length;i++) {
						//int temp = i+1;
						System.out.print(" + " + array[i] + " x^" + i + " ");
					}
					//System.out.println(array);
					
				
		}
}