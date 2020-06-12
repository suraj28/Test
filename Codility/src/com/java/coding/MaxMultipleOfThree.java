package com.java.coding;
import java.util.Arrays;
public class MaxMultipleOfThree {

	    public int solution(int[] A) {

	        // main idea: 
	        // max_1 = positive * positive * positive
	        // max_2 = negative * negative * positive
	        // max = Math.max(max_1, max_1)
	        // just need to sort the integer array
	        
	        // sort the array
	        Arrays.sort(A);
	        int m=0;
	        for(int i=0; i<A.length; i++){
	        	if( A[i]%3 ==0){
	        		if(m<A[i]){
	        			m=A[i];
	        		}
	        	}
	        }
	        // max_1 = 1st biggest * 2nd biggest * 3rd biggest 
	       // int max_1 = A[A.length-1] * A[A.length-2] * A[A.length-3];
	        
	        // max_2 = 1st smallest * 2nd smallest * 1st biggest
	        //int max_2 = A[0] * A[1] * A[A.length-1];

	        // take the maximum        
	        //int max = Math.max(max_1, max_2);
	        
	        //return max;
	        return m;
	    }
	
	    public static void main(String args[]) {
	    	MaxMultipleOfThree obj= new MaxMultipleOfThree();
	    	int[] arr= new int[]{-6, -91, 1011, -100, 84, -22, 0, 1014, 473};
	    	int result= obj.solution(arr);
	    	System.out.println(result);
		}
}
