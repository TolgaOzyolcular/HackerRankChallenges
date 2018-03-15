import java.io.*;
import java.util.*;

public class Problem5 {
  
    static boolean isAnagram(String a, String b) {
        char[] firstArray = a.toCharArray();
        char[] secondArray = b.toCharArray();
        
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        
        if(Arrays.equals(firstArray, secondArray))
          return true;
        else
          return false;        
    }
 
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}