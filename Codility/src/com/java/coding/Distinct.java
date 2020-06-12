package com.java.coding;
//package Distinct;

// note: remember to import (for using "Arrays.sort(xxx[])")
import java.util.*;

// System.out.println("this is a debug message");

class Distinct {
    public int solution(int[] A) {

      // special case
        if(A.length ==0)
            return 0;
      
      // initial setting: one distinct number
        int result =1;
        
      // Using "Arrays.sort(A)" (important)
        Arrays.sort(A);
        
      // for counting the distinct numbers
        for(int i=1; i < A.length; i++){
            if(A[i] != A[i-1]){ // distinct
                result++; 
            }
        }
        
        return result; // return the number of distinct values
    }
    
    public static void main(String args[]) {
    	Distinct obj= new Distinct();
    	int[] arr= new int[]{0,1,2,4,3,4,5,7,5,9,2};
    	int result= obj.solution(arr);
    	System.out.print(result);
	}
}
