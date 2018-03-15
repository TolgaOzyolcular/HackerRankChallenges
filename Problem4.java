import java.util.*;

class PalindrumAlgorithm{
 
  // This is an algorithm which checks to see if a sentence is a pallindrum
  
  public static void main (String[] args){
    System.out.println("Please enter a sentence: ");
    Scanner scanner = new Scanner(System.in);
    String sentence = scanner.nextLine();
    scanner.close();
    
    System.out.println(isPalindrum(sentence));
  }
  
  public static String isPalindrum (String s){
    char arraySentence[] = new char[s.length()];

    for(int i = 0; i < s.length(); i++){
      arraySentence[i] = s.charAt(i);
    }
          
    for(int i = 0; i < s.length(); i++){
      if(arraySentence[i] != arraySentence[(s.length()-1) - i])
        return "No";
    }     
    
    return "Yes";
  }
}