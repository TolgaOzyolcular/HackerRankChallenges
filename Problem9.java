import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem9 {

    public static void main(String[] args) throws FileNotFoundException {
      File file = new File("Text.txt");  
      Scanner scanner = new Scanner(file);
      int i = 1;
        while (scanner.hasNext()) {
          String j = scanner.nextLine();
          System.out.println(i+" "+j);
          i++;
        }
    }
}