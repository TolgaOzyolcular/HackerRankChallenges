import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem10 {
  
  static int B;
  static int H;
  static boolean flag = false;
  
  static{
    Scanner in = new Scanner(System.in);
    B = in.nextInt();
    H = in.nextInt();
    if((0<=B && B<=100) && (0<=H && H<=100)){
      flag = true;
    }
    else
      System.out.println("java.lang.Exception: Breadth and height must be positive");
  
  }
  public static void main(String[] args){
    if(flag){
      int area=B*H;
      System.out.printf("%d\n", area);
    }
  }

}