import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem9 {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        int count = 0;
        
        HashSet set1 = new HashSet();
        HashSet set2 = new HashSet();
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
            
            set1.add(pair_left[i]);
            set2.add(pair_right[i]);
            
            if(set1.size() >= set2.size())
              System.out.println(set1.size());
            
            else if(set1.size() < set2.size())
              System.out.println(set2.size());
            
            //System.out.println(set1 + ", " + set2);
        }
 }
}