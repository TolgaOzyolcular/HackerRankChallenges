import java.util.*;
import java.io.*;
import java.lang.Math;

class Problem7{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        if(0<=t && t<=500){
          for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int total = a;
            int total2 = 0;
            
            if ((0<=a && a<=50) && (0<=b && b<=50) && (1<=n && n<=15)){
              for(int j = 0; j<n; j++){              
                int sum = (square(2,j))*b;
                total = total + sum;
                
                System.out.printf("%d  ", total);
              }
            }
            
            else
              System.out.println("a, b, or n is not within range");
            
            System.out.printf("\n");
          }
          in.close();
        }
        else
          System.out.println("q is not within range");
    }
    
    public static int square (int n, int k) {
        return (int) java.lang.Math.pow(n,k);
    }
}