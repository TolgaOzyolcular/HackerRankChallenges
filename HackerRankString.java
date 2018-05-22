package Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankString {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {   		
    		String match = "";
    		String original = "hackerrank";
    		
    		int index = 0;
    		
    		for(int i = index; i<s.length(); i++) {
    			if(s.charAt(i) == original.charAt(index)) {
    				match += s.charAt(i);
    				index++;
    			}  			
    		}
    		
    		if(match.equals(original)) 
    			return "YES";
    		
    		else
    			return "NO";
    		
    }

    public static void main(String[] args) throws IOException {
    		String input = "hereiamstackerrank";
		
    		HackerRankString t = new HackerRankString();
		System.out.println(t.hackerrankInString(input));
    }
}
