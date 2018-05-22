package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrongPassword {

    static int minimumNumber(int n, String password) {
        int result = 0;
        
        Pattern specialCharacter = Pattern.compile("[^A-Za-z0-9]");
        Pattern number = Pattern.compile("\\d");
        Pattern lowerCase = Pattern.compile("[a-z]");
        Pattern upperCase = Pattern.compile("[A-Z]");
        
        Matcher m = specialCharacter.matcher(password);
        Matcher o = number.matcher(password);
        Matcher p = lowerCase.matcher(password);
        Matcher q = upperCase.matcher(password);
        
        if(!m.find()) {
        		System.out.println("Add Special");
        		result++;
        }
        
        if(!o.find()) {
    			System.out.println("Add Number");
    			result++;
        }

        if(!p.find()) {
			System.out.println("Add Lower");
			result++;
        }
        
        if(!q.find()) {
			System.out.println("Add Upper");
			result++;
        }
        
        if((n+result) <= 6) {        	
    			result = 6-n;
        }
         
    		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}