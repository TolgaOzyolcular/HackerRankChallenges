package Strings;

import java.util.*;

public class WeightedUniformStrings {

    // Complete the weightedUniformStrings function below.
    static String weightedUniformStrings(String s, int query) {
    		HashMap<Character, Integer> values = new HashMap<Character, Integer>();
    		HashSet<Integer> weight = new HashSet<Integer>();
    		
    		//Will not put entire alphabet...
    		values.put('a', 1);
    		values.put('b', 2);
    		values.put('c', 3);
    		values.put('d', 4);
    		values.put('e', 5);
    		values.put('f', 6);
    		values.put('g', 7);
    		values.put('h', 8);
    		
    		for(int i = 0; i<s.length(); i++) {
    			int count = 0;
    			
    			while(((i-count) >= 0) && (s.charAt(i-count) == s.charAt(i))) {
    				count++;
    			}   			
    			
    			weight.add(values.get(s.charAt(i)) * count);
    		}
    		
    		
    		if(weight.contains(query))
    			return "YES";
    		else
    			return "NO";
    }


    public static void main(String[] args){
    		String input = "aaccddde";
    		int query = 2;
		
    		WeightedUniformStrings t = new WeightedUniformStrings();
		System.out.println(t.weightedUniformStrings(input, query));
    }
}
