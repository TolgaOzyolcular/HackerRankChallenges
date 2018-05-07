package Strings;

import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        StringBuffer buffer = new StringBuffer();
        buffer.append(input);
        
        buffer.reverse();
        
        if(input.equals(buffer.toString())) 
        		System.out.println("Yes");
        
        else
        		System.out.println("No");
        
    }
}