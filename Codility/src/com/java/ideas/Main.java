package com.java.ideas;
/* Save this in a file called Main.java to compile and test it */

/* 
   Example file showing how to write a program that reads
   input from `input.txt` in the current directory
   and writes output to `output.txt` in the current directory
*/

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */

public class Main {
    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        //int numLines = 0;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));

            /* Here we can read in the input file */
            /* In this example, we're reading all the lines of file
               `input.txt` and then ignoring them. 
               You should modify this part of the
               program to read and process the input as desired */
            while(in.hasNextLine()) {
                String line = in.nextLine();
                inputData.add(line);
                /*if (!line.isEmpty())
                    numLines++;*/
            }
            

            /* In this example, we're writing `num_lines` to
               the file `output.txt`.
               You should modify this part of the
               program to write the desired output */
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            //output.println("" + numLines);
            Map<String,String> map=new HashMap<>();
            for(String str:inputData){
            	String []a= str.split(",");
            	if(map.containsKey(a[0])){
            		if(Integer.valueOf(map.get(a[0]).substring(2))>Integer.valueOf(a[2].substring(2))){
            			output.println(a[0]);
            		}else{
            			map.remove(a[0]);
            		}
            	}
            	else{
            		map.put(a[0], a[2]);
            	}
            }
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
