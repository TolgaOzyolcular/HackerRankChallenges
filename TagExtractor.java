package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagExtractor{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      Pattern p = Pattern.compile("<(.+)>([^<>]+)</\\1>");
            
      while(testCases-->0){
         String line = in.nextLine();
         
         Matcher m = p.matcher(line);
         
         while(m.find()) {
        	 	System.out.println(m.group(2));
         }
       
      }
   }
}