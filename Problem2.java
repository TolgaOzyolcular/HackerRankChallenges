import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum[][] = new int[4][4];
        int[] results = new int[16];
        
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        for(int i = 1; i < 5; i++){
          for(int j = 1; j < 5; j++){
            sum[i-1][j-1] = (arr[i][j])+(arr[i-1][j-1])+(arr[i-1][j])+(arr[i-1][j+1])+(arr[i+1][j-1])+(arr[i+1][j])+(arr[i+1][j+1]);
          }
        }
        
        for(int i = 0; i < 4; i++){
          for(int j = 0; j < 4; j++){
            results[i*j] = sum[i][j];
          }
        }
        
        Arrays.sort(results);
        
        System.out.println(results[15]);
    }
}
