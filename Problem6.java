import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        if(2<=n && n<=20){
          for(int i = 1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+(n*i));
          }
        }
        
        else
          System.out.println("Number entered must be between 2 and 20!");
    }
}
