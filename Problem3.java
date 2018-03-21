import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;

public class Problem3 {

 public static void main(String[] args) throws Exception {
  DoNotTerminate.forbidExit(); 

  try{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int num = Integer.parseInt(br.readLine().trim());
   Object o = new Object();// Must be used to hold the reference of the instance of the class Solution.Inner.Private
   Problem3.Inner instance = new Problem3.Inner();
   Inner.Private instance2 = instance.new Private();
   //o = (Object) instance2;

   System.out.println(num + " is " + instance2.powerof2(num));
   System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
  
  }//end of try
  
  catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }//end of main
 
 static class Inner{
  private class Private{
   private String powerof2(int num){
    return ((num&num-1)==0)?"a power of 2":"not a power of 2";
   }
  }//end of Private
 }//end of Inner
 
}//end of Problem3

class DoNotTerminate { //This class prevents exit(0)
  
    public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1L;
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
} 
 