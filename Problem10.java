import java.io.IOException;
import java.lang.reflect.Method;

class Problem10
{
    public static void main( String args[] ) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        Character[] charArray = {'N', '0'};
        printArray(intArray);
        printArray(stringArray);
        printArray(charArray);
    }
    
    public static <E> void printArray(E[] inputArray){
    for(int i = 0; i < inputArray.length; i++){
      System.out.println(inputArray[i]);
    }
  }
}