package com.java.ideas;


public class TestMain {
	    public static void main(String[] args) {
	        /*List<Integer> li = new ArrayList<>();
	        int i = 10;
	        li.add(10);
	        int j = li.get(0);
	        System.out.println(j);*/
	    	
	    	/*ArrayList<ArrayList<Integer>> array =
	                new ArrayList<ArrayList<Integer>>();
	            for(int i=0; i<10000; i++) {
	                try {
	                    array.add(new ArrayList<Integer>(1000000));
	                } catch (OutOfMemoryError e) {
	                    System.out.println(i);
	                    break;
	                }
	            }*/
	    	 Shape s = new Circle();
	      //   Circle c = s.makeCopy();
	    }
}

class Shape {
   public Shape makeCopy() {
       // code to make a copy of this Shape
	   return new Shape();
   }
}

class Circle extends Shape {
   @Override
   public Circle makeCopy() {
       // code to make a copy of a Circle
	   return new Circle();
   }
}
