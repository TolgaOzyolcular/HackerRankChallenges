package Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Pangram {

    // Complete the pangrams function below.
    static String pangrams(String s) {
    		String match = "abcdefghijklmnopqrstuvwxyz";
    		s = s.toLowerCase();
    		
    		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(s.split("")));
    		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(match.split("")));
    		
    		Collections.sort(list1);
    		
    		HashSet compare1 = new HashSet(list1);
    		HashSet compare2 = new HashSet(list2);
    		
    		compare1.remove(" ");

    		if(list1.containsAll(list2))
    			return "Pangram";
    		else
    			return "Not Pangram";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    		String input = "We promptly judged antique ivory buckles for the next prize";
		
    		Pangram t = new Pangram();
		System.out.println(t.pangrams(input));
    }
}
