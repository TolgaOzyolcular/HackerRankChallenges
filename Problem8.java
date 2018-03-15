import java.util.*;

class Problem8{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      Stack stack = new Stack();
      HashMap map = new HashMap();      
      map.put('}','{');
      map.put(')', '(');
      map.put(']', '[');
      
      while (sc.hasNext()) {
         String input=sc.next();     
         char check = 'n';
         boolean isBalanced = false;
         
         for(int i = 0; i < input.length(); i++) {
        	 	if(input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[') 
        	 		stack.push(input.charAt(i));
        	 	
        	 	else if((input.charAt(i) == '}' || input.charAt(i) == ')' || input.charAt(i) == ']') && (!stack.isEmpty())) {      	 		
        	 		check = (char) stack.peek();
        	 		if(check == (char) map.get(input.charAt(i))){
        	 			isBalanced = true;
        	 			stack.pop();
        	 		}
        	 	}        	 	
         }
         
         if(!stack.isEmpty()) {
        	 	isBalanced = false;
        	 	while(!stack.isEmpty())
        	 		System.out.println(stack.pop());
         }
         
         System.out.println(isBalanced);
      }
      
   }
}
