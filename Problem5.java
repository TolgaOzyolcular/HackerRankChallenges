import java.util.*;

public class Problem5 {
   
	public static boolean canWin(int leap, int[] game){		
		
		Stack trackingStack = new Stack();
		
		if(game[0] != 0)
        {
			System.out.println("First number must be 0");
			return false;
        }
		
		if(leap > game.length) {
			return true;
		}
		int index = 0;
		
		System.out.println(index);
		
		while(index < game.length) {								
			
			if(game[index+leap] == 0) {
				index = index+leap;
				trackingStack.push("leap");				
			}
			else if(game[index+1] == 0) {
				index += 1;
			}
			else if(index > 0) {
				if(game[index-1] == 1 && (trackingStack.peek() == "leap"))
					index -= 1; 
			}
			else
				return false;
			
			System.out.println(index);
			
			if (index >= (game.length-1)) {
				index = game.length;
				return true;	
			}
		}
			
		return false;
    }
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

