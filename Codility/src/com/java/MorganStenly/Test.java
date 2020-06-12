package com.java.MorganStenly;

import java.util.Arrays;

public class Test {

	
    public void permutation1(int[] a, int n) {
        if(n == 1) {
            System.out.println(Arrays.toString(a));
            return;
        }
        for(int i = 0;i < n;i++) {
            swap(a, i, n-1);  // (remove the ith element)
            permutation1(a, n-1);
            swap(a, i, n-1);  // (restore for the next round)
        }
    }
      
    void swap(int a[], int size, int n){
		int d=0;
		
		for(int i=0; i<size;i++){
			System.out.println(size);
			swap(a, size-1, n);
			
			if(size %2 == 1 /*&& size!=a.length*/){
				int temp=a[0];
				a[0]=a[size-1];
				a[size-1]=temp;
			}else {
				int temp= a[i];
				a[i]=a[size-1];
				a[size-1]=temp;
				d++;
				System.out.print(size+" BBB"+d+ " ");
			}
			
				
		}
	}
    // Driver code  
    public static void main(String args[])  
    {  
        int arr[] = { 1,2,3 };  
        int n = arr.length;  
      Test o= new Test();
        o.permutation1(arr, 2);  
    }  
}
