import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();   
        int[] array = new int[length];
        int count = 0;
        
        for(int i = 0; i < array.length; i++){        
          array[i] = in.nextInt();
        }
        
        for(int i = 0; i < array.length; i++){
          int result = 0;
          for(int j = i; j < array.length; j++){
            result += array[j];
            if(result<0)
              count++;
          }
        }
        
        System.out.println(count);
    }

}
