import java.io.*;
import java.util.*;

public class Problem1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());
        
        if(A.compareTo(B)>0){
          System.out.println("Yes");
          System.out.println(B+" "+A);
        }
        else{
          System.out.println("No");
          System.out.println(A+" "+B);
        }
    }
}