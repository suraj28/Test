package com.java.coding;

public class CasinoBet {

	public int solution(int N, int M) {
		int result=2;
		System.out.println("Bet 1");
		for(int i=2;i<N;i++){
			if(M==0 || i<(N/(2*M))|| i<(N/(2*M))){
				System.out.println("Bet "+i);
				result++;
			}
			for(int j=1;j<M;j++){
				if(M>0 && (i==(N-M)/2)){
					System.out.println("all in "+i);
					result= result+j;
				}
			}
		}
		return result;
	}
	
	
	public static void main(String a[]){
		CasinoBet b = new CasinoBet();
		System.out.println(b.solution(8, 0));
		System.out.println(b.solution(18, 2));
	}
	
}