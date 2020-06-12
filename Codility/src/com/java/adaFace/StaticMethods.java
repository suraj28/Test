package com.java.adaFace;

class Animal{
	public void display(){
		System.out.println("Non-static Animal");
	}
	public static void displayStatic(){
		System.out.println("Satic Animal");
	}
}
class Cow extends Animal{
	public void display(){
		System.out.println("Non-static Cow");
	}
	public static void displayStatic(){
		System.out.println("Satic Cow");
	}
}
public class StaticMethods {

	public static void main(String[] args) {
		Animal a=new Animal();
		Animal b= new Cow(); //Upcasting 
		//Cow c= (Cow) new Animal();//java.lang.ClassCastException
		Cow d= new Cow();
		a.display();
		b.display();
		//c.display();
		d.display();
		
		a.displayStatic();
		b.displayStatic();
		//c.displayStatic();
		d.displayStatic();
		
		

	}

}
