package com.emerio.complex;

/**
 * Java Program To Find Missing Number In An Array : If ‘n’ is the positive
 * number and ‘a’ is an array of integers of length n-1 containing elements from
 * 1 to n. Then find the missing number in ‘a’ in the range from 1 to n.
 * Occurrence of each element is only once. i.e ‘a’ does not contain duplicates.
 * 
 * Example: If n = 8, then array ‘a’ will have 7 elements in the range from 1 to
 * 8. For example {1, 4, 5, 3, 7, 8, 6}. One number will be missing in ‘a’ (2 in
 * this case). You have to find out that missing number.
 * 
 Note : This program should accept all the input values at runtime.
 *
 */
public class MissingNumberInArray {

	public void displayMissingNumber(int[] a, int n){
		int total= (n+1)*(n+2)/2;
		for(int i=0; i<n;i++){
			total-=a[i];
		}
		System.out.println(total);
	}
	public static void main(String[] args) {
		MissingNumberInArray mn= new MissingNumberInArray();
		//int a[]= {1, 4, 5, 3, 7, 8, 6};
		int a[]= {1, 2, 5, 3, 7, 8, 6};
		mn.displayMissingNumber(a,7);
	}
}
