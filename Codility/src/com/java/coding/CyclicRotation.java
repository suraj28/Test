package com.java.coding;
//package CyclicRotation;

class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        
        // Using the concept of "mod" (to make it cyclic)
        
        int[] new_array = new int[A.length]; // a new array
        
        for(int i=0; i< A.length; i++){
            int new_position = (i + K) % A.length; // using "mod" to do Cyclic Rotation           
            new_array[new_position] = A[i]; // put A[i] to the new position
        }
        
        return new_array; // return new array
    }
    
    public static void main(String args[]) {
    	CyclicRotation obj= new CyclicRotation();
    	int[] arr= new int[]{4,5,7,6,9,2,11};
    	int []result= obj.solution(arr, 2);
    	for(int i=0;i<result.length;i++)
    		System.out.print(result[i]+" ");
	}
}
