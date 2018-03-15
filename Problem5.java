import java.util.Scanner;

public class Problem5

{

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            String s1=sc.next();
            int x=sc.nextInt();
            String s2=sc.next();
            int x2=sc.nextInt();
            String s3=sc.next();
            int x3=sc.nextInt();
            
            System.out.println("================================");
            System.out.printf("%-10s", s1);
            System.out.printf("%03d", x);
            
            System.out.printf("\n%-10s", s2);
            System.out.printf("%03d", x2);
            
            System.out.printf("\n%-10s", s3);
            System.out.printf("%03d\n", x3);
            System.out.println("================================");

    }
}