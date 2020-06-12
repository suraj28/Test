package com.java.adaFace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectReferance {

	public static void main(String[] args) {
		
		List<String> list1= new ArrayList<>();
		list1.add("Nagpur");
		List<String> list2= list1;
		List<String> list3= new ArrayList<>(list1);
		
		list1.clear();
		list2.add("Pune");
		list3.add("Mumbai");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		final List<String> list4= new ArrayList<>(list3);
		list4.add("Akola");
		System.out.println(list4);
		
		final List<String> list5= Collections.unmodifiableList(list3);
		//list5.add("Gadchiroli"); //java.lang.UnsupportedOperationException
		System.out.println(list5);
		

	}

}
