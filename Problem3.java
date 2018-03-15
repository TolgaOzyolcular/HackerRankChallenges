import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem3 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String input1 = in.nextLine();
       String input2 = in.nextLine();
       
       BigInteger firstNumber = new BigInteger(input1);
       BigInteger secondNumber = new BigInteger(input2);
       
       System.out.println(firstNumber.add(secondNumber));
       System.out.println(firstNumber.multiply(secondNumber));
    }
}