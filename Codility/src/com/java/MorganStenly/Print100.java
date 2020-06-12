package com.java.MorganStenly;

public class Print100 {

	public static void print(){
		for (int i=1; i<=100; i++) {
			if (i%5==0 && i%7==0) System.out.print("FooBar, ");
			else if (i%7==0) System.out.print("Bar, ");		
			else if (i%5==0) System.out.print("Foo, ");
			else  System.out.print(i +", ");
		}
	}
	public static void main(String args[]) {
		Print100.print();
}
}