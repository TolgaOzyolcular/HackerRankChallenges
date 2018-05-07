package Strings;

import java.io.*;
import java.util.*;

// Modified to removes symbols AND double words

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        String[] tokens = input.split("\\W+");
        
        LinkedHashSet mySet = new LinkedHashSet(Arrays.asList(tokens));
        
        String[] output = (String[]) mySet.toArray(new String[mySet.size()]);
        
        System.out.println(output.length);
        
        for(int i = 0; i<output.length; i++) 
        		System.out.println(output[i]);
        
        scan.close();
    }
}