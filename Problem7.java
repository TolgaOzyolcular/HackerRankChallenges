import java.util.*;
import java.io.*;

class Problem7{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      
      HashMap map = new HashMap();
      
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         map.put(name, phone);
         in.nextLine();
      }
      
      while(in.hasNext())
      {
         String s=in.nextLine();
         
         if(map.get(s) == null)
           System.out.println("Not Found");
         
         else
           System.out.println(s + " = " + map.get(s));
      }
      
   }
}
