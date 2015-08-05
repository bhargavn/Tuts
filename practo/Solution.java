package practo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=null;
        try{
           
        br = new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        Integer i;
        if(input.charAt(8)=='P'){
        	System.out.println(input.substring(,2));
            i = Integer.valueOf(input.substring(1,2));
            i=i+12;
        }else{
        	System.out.println(input.substring(0,2));
            i = Integer.valueOf(input.substring(0,2));
        }
        System.out.println(i);
       }catch(IOException io){
		//io.printStackTrace();
	}	finally{
           br.close();
       }
    }
}