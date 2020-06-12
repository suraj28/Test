package com.java.coding;
//package CountTriangles;

import java.util.*;

class CountTriangles {
    public int solution(int[] A) {
        
        int  numTriangle = 0;
        
        // important: sort the edges 
        // so that we just need to check if
        // "1st edge + 2nd edge > 3rd edge"
        Arrays.sort(A);
        
        // Using "Caterpillar method"
        // so we can have O(n^2), not O(n^3)  
        for(int i=0; i < A.length-2; i++){
            
            // the leftEnd and rightEnd of the "Caterpillar"
            int leftEnd = i+1;
            int rightEnd = i+2;
            
            while(leftEnd < A.length-1){
                
                // key point of "Caterpillar method"
                if(rightEnd < A.length && A[i] + A[leftEnd] > A[rightEnd]){
                    rightEnd++; // increase the Caterpillar
                }
                else{
                    // note: need to minus "1" 
                    // because the rightEnd is not included
                    numTriangle = numTriangle + (rightEnd - leftEnd - 1);
                    leftEnd++; // decrease the Caterpillar
                }
            }
        }
        
        return numTriangle;
    }
    
    public static void main(String args[]) {
    	CountTriangles obj= new CountTriangles();
    	int[] arr= new int[]{0,1,2,4,3,4,5,7,6,9,2};
    	int result= obj.solution(arr);
    	System.out.print(result);
	}
}
