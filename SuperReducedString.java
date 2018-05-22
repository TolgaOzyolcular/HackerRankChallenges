package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

    static String super_reduced_string(String s){
    		Boolean isDoubles = true;
    		char letter = ' ';
    		int i = -1;
    		
    		while(i < s.length()) {
    			i++;
			
			if(s.equals("")) 
    				return "Empty String";
			
			if((i+1)<s.length()) {						
				letter = s.charAt(i);
				if(letter == s.charAt(i+1)) {
					s = s.substring(0,i) + s.substring((i+1)+1);
					i = -1;  						
				}		    					
			}					
    		}    	
    		
    		return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}