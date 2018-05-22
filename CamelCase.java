package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CamelCase {

    static int camelcase(String s) {
    		int count = 1;
    		
    		for(int i = 0; i<s.length(); i++) {
    			if(Character.isUpperCase(s.charAt(i))) {
    				count++;
    			}
    		}
    		
    		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}