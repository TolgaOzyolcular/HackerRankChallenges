import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem14{

    public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int lengthOfBits = scan.nextInt();
    		int numberOfOpps = scan.nextInt();
    		int firstNumber;
    		int secondNumber;
    		String operation;
    		
    		BitSet bits1 = new BitSet(lengthOfBits);
    		BitSet bits2 = new BitSet(lengthOfBits);
    		
    		for(int i = 0; i<numberOfOpps; i++) {
    			scan.nextLine();
    			operation = scan.next();
    			firstNumber = scan.nextInt();
    			secondNumber = scan.nextInt();

    			if(operation.equals("AND")) {
    				if(firstNumber == 1 && secondNumber == 2)
    					bits1.and(bits2);
    				else if(firstNumber == 2 && secondNumber == 1)
    					bits2.and(bits1);
    				
    				System.out.println(bits1.cardinality() + ", " + bits2.cardinality());
    			}
    			
    			else if(operation.equals("OR")) {
    				if(firstNumber == 1 && secondNumber == 2)
    					bits1.or(bits2);
    				else if(firstNumber == 2 && secondNumber == 1)
    					bits2.or(bits1);
    				
    				System.out.println(bits1.cardinality() + ", " + bits2.cardinality());
    			}
    			
    			else if(operation.equals("XOR")) {
    				if(firstNumber == 1 && secondNumber == 2)
    					bits1.xor(bits2);
    				else if(firstNumber == 2 && secondNumber == 1)
    					bits2.xor(bits1);
    				
    				System.out.println(bits1.cardinality() + ", " + bits2.cardinality());
    			}
    			
    			else if(operation.equals("FLIP")) {
    				if(firstNumber == 1)
    					bits1.flip(secondNumber);
    				else if(firstNumber == 2)
    					bits2.flip(secondNumber);
    				
    				System.out.println(bits1.cardinality() + ", " + bits2.cardinality());
    			}
    			
    			else if(operation.equals("SET")) {	
    				if(firstNumber == 1)
    					bits1.set(secondNumber);
    				else if(firstNumber == 2)
    					bits2.set(secondNumber);
    				System.out.println(bits1.cardinality() + ", " + bits2.cardinality());
    			}

    		}
    		
    		
    }
}