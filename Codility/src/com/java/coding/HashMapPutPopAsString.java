package com.java.coding;

import java.util.HashMap;

public class HashMapPutPopAsString {
	public String solution(String[] A){
	HashMap<String,String> map= new HashMap<>();
		String result="";
		for(int i=0; i<A.length; i++){
			String[] split= A[i].split(":");
			if(split.length==1 && A[i].equals("k")){
				result+= String.valueOf(map.size())+ " ";
			}else if(split.length==2){
				
				if(split[0].equals("j")){
					if(map.containsKey(split[1]))
						result+= map.get(split[1])+ " ";
					else
						result+= "-1 ";
				}else if(split[0].equals("l")){
					map.remove(split[1]);
				}
			}else if(split.length==3){
				
				if(split[0].equals("i")){
					
					map.put(split[1],split[2]);
				}
			}
			System.out.println(i+" "+A[i].length());
			
		}
		
		return result;
	}
	
	public static void main(String a[]){
		String[] s= new String[]{ "i:1:2", "i:66:3", "j:66", "l:1", "k"};
		HashMapPutPopAsString m = new HashMapPutPopAsString();
		System.out.println(m.solution(s));
	}
}
