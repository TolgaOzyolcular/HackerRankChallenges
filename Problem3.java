import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem3 {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        for(int i = 0; i<(s.length()-k); i++){
          String compareString = s.substring(i+1, i+1+k);          

          if(smallest.compareTo(compareString) >= 0)
            smallest = compareString;
          
          if(largest.compareTo(compareString) < 0)
            largest = compareString;
        }                                    
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
