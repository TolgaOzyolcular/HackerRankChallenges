package Sorting;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import Strings.WeightedUniformStrings;

public class BigSorting{

    // Complete the bigSorting function below.
    static String[] bigSorting(String[] unsorted) {
    				
    		Arrays.sort(unsorted, new Comparator<String>() {
    		    @Override
    		    public int compare(String a1, String a2) {
    		        if(Integer.parseInt(a1) > Integer.parseInt(a2))
    		        		return 1;
    		        else if(Integer.parseInt(a1) < Integer.parseInt(a2))
    		        		return -1;
    		        else
    		        		return 0;
    		    }
    		});
    		
    		for(int i = 0; i<unsorted.length; i++) {
    			System.out.println(unsorted[i]);
    		}
    		
    		return unsorted;
    }

    public static void main(String[] args){
    		String[] input = {"34214321", "5", "1", "3", "6", "3", "10"};
		int query = 2;
	
		BigSorting t = new BigSorting();
		System.out.println(t.bigSorting(input));
    }


}

