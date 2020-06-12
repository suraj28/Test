package com.emerio.complex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Java Program To Find All Pairs Of Elements In An Array Whose Sum Is Equal To A Given Number :
 * Ex1:
 * {4, 6, 5, -10, 8, 5, 20}
 * Pairs of elements whose sum is 10
 * 4 + 6 = 10
   5 + 5 = 10
  -10 + 20 = 10
  
  Ex2:
  {4, -5, 9, 11, 25, 13, 12, 8}
  Pairs of elements whose sum is 20
  -5 + 25 = 20
  9 + 11 = 20
  12 + 8 = 20
 *
 Note : This program should accept all the input values at runtime.
 */
public class PairsOfElementsInArray {
		
	public static void display(int a[], int sum){
		System.out.println(Arrays.toString(a));
		System.out.println("Pairs of elements whose sum is "+sum);
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<a.length;i++){
			int e= sum-a[i];
			
			if(map.containsValue(e)){
				System.out.println(e +"  +"+a[i]+" = "+sum);
			}else{
				map.put(i, a[i]);
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter array size");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("Enter number for compare sum");
		int sum=s.nextInt();
		display(a, sum);
	}

}
