package com.java.coding;

import java.util.HashSet;
import java.util.Set;
//Destinct count of int in Array
class AbsDistinct {
    public int solution(int[] A) {
        
        // using "Set"
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<A.length; i++){
            // note: using "Math.abs(int)"
            if( set.contains( Math.abs(A[i]) ) == false ){
                set.add( Math.abs(A[i]) );
            }
            else{
                // do nothing (already existed in the set)
            }
        }
        
        return set.size();
     }
    
    public static void main(String args[]) {
    	AbsDistinct obj= new AbsDistinct();
    	int[] arr= new int[]{1,2,4,3,4,5,7,6,9,2};
    	int result= obj.solution(arr);
    	System.out.println(result);
	}
}
