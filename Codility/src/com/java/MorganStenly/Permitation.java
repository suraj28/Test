package com.java.MorganStenly;

public class Permitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permitation obj= new Permitation();
		int a[]={1,2,3};
		obj.heapPermutation(a, 3, 2);
	}

	public int solve(int[] A, int B){
		
		heapPermutation(A, A.length,B);
		return 0;
	}
	void printArray(int a[], int n){
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
	}
	
	void heapPermutation(int a[], int size, int n){
		int d=0;
		
		for(int i=0; i<size;i++){
			System.out.println(size);
			heapPermutation(a, size-1, n);
			
			if(size %2 == 1 /*&& size!=a.length*/){
				int temp=a[0];
				a[0]=a[size-1];
				a[size-1]=temp;
			}else if(d++ <n && size==n){
				int temp= a[i];
				a[i]=a[size-1];
				a[size-1]=temp;
				d++;
				System.out.print(size+" BBB"+d+ " ");
			}
			
				
		}
		if(size==1){
			System.out.print(size+" AAA"+d+ " ");
			printArray(a, a.length);
			//System.out.println(d+ " "+size);
		}
	}
}
