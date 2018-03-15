import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem6 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList(); 
        
        Scanner in = new Scanner(System.in); 
        int listLength = in.nextInt();  
        in.nextLine();
        
        for(int i = 0; i < listLength; i++) {
        		list.add(i, in.nextInt());
        }
        in.nextLine();
        boolean isTrue = true;       
        while(isTrue) {	        
	        String action = in.nextLine();
	        
	        if(action.equals("Insert")) {        	
	        		int indexInsert = in.nextInt();
	        		int numberInsert = in.nextInt();
	        		list.add(indexInsert, numberInsert);
	        		//System.out.println("Flag1");
	        }
	        
	        else if(action.equals("Delete")){
	        		int indexDelete = in.nextInt();
	        		list.remove(indexDelete);
	        }
	
	        //System.out.println(action);
	        in.nextLine();
	        for(int i = 0; i < list.size(); i++) {
	        		System.out.println(list.get(i));
	        }
        }
    }
}
