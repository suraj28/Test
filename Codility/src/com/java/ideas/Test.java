package com.java.ideas;
/* Save this in a file called Main.java to compile and test it */

/* 
   Example file showing how to write a program that reads
   input from `input.txt` in the current directory
   and writes output to `output.txt` in the current directory
*/

/* Do not add a package declaration */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */

public class Test {
    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        int numLines = 0;
        try {
           
            ArrayList<String> data= new ArrayList<>();
            
            data.add("Mail App, Authentication API, v6");
            data.add("Video Call App, Authentication API, v7");
            data.add("Mail App, Data Storage API, v10");
            data.add("Chat App, Data Storage API, v11");
            data.add("Mail App, Search API, v6");
            data.add("Chat App, Authentication API, v8");
            data.add("Chat App, Presence API, v2");
            data.add("Video Call App, Data Storage API, v11");
            data.add("Video Call App, Video Compression API, v3");
            
            Map<String,String> map=new HashMap<>();
            String s=null;
for(String str:data){
	String []a= str.split(",");
	if(map.containsKey(a[0])){
		if(Integer.valueOf(map.get(a[0]).substring(2))>Integer.valueOf(a[2].substring(2))){
			s=a[0];
		}else{
			map.remove(a[0]);
		}
	}
	else{
		map.put(a[0], a[2]);
	}
}
System.out.println(s);
/*
ArrayList<String> keys= new ArrayList<>(map.keySet());
for(String key: keys){
	System.out.println(key+" - "+map.get(key));
}*/

            
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
//java.io.FileNotFoundException