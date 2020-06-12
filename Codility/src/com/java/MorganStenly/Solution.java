package com.java.MorganStenly;


//you can also use imports, for example:

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
	public static void main(String ar[]){
		Solution s= new Solution();
		int[][] a = new int[][]{{1,2},{2,3}};
		System.out.println(s.solution(a));
	}
 int cnt = 0;
 int r = 0;
 int c = 0;
 int[][] v;
 public int solution(int[][] A) {
     // write your code in Java SE 8
     r = A.length;
     c = A[0].length;
     v = new int[r][c];
    
     for(int i = 0 ; i < r ; i ++){
         for(int j = 0 ; j < c ; j++){
             int q = A[i][j];
             if(!visited(q,i,j)){
                 v[i][j] = q;
                 parse(q,i,j,A);
                 cnt++;
             }
         }
     }
     return cnt;
 }

 private boolean parse( int q, int i, int j, int[][] A){
     checkN(q,i,j,A);
     checkS(q,i,j,A);
     checkW(q,i,j,A);
     checkE(q,i,j,A);
     return true;
 }

 private boolean checkN(int q, int i, int j, int[][] A){
     int t = i;
     t--;
     if(t>=0){
         if(v[t][j]==0 && A[t][j]==q){
             v[t][j] = q;
             return parse(q,t,j,A);
         }/*else if(v[t][j]==q && A[t][j]==q){
             t--;
             return checkN(q,t,j,A);
         }*/else{
             return true;
         }
     }else{
         return false;
     }
 }

 private boolean checkS(int q, int i, int j, int[][] A){
     int t = i;
     t++;
     if(t<=r-1){
         if(v[t][j]==0 && A[t][j]==q){
             v[t][j] = q;
             return parse(q,t,j,A);
         }/*else if(v[t][j]==q && A[t][j]==q){
             t++;
             return checkS(q,t,j,A);
         }*/else{
             return true;
         }
     }else{
         return false;
     }
 }

 private boolean checkE(int q, int i, int j, int[][] A){
     int t = j;
     t++;
     if(t<=c-1){
         if(v[i][t]==0 && A[i][t]==q){
             v[i][t] = q;
             return parse(q,i,t,A);
         }
         /*else if(v[i][t]==q && A[i][t]==q){
             t++;
             return checkE(q,i,t,A);
         }*/else{
             return true;
         }
     }else{
         return false;
     }
 }

 private boolean checkW(int q, int i, int j, int[][] A){
     int t = j;
     t--;
     if(t>=0){
         if(v[i][t]==0 && A[i][t]==q){
             v[i][t] = q;
             return parse(q,i,t,A);
         }
         /*else if(v[i][t]==q && A[i][t]==q)){
             t--;
             return checkW(q,i,t,A);
         }*/
         else{
             return true;
         }
     }else{
         return false;
     }
 }
 private boolean visited( int q, int i, int j){
    
     if(v[i][j] == 0){
         return false;
     }else{
         return true;
     }
 }
}

