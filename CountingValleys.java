
public class CountingValleys {
	public static void main (String[] args) {
		int n = 8;
		String s = "DDUUUUDD";
		
		System.out.println(countingValleys(n,s));
	}
	
	public static int countingValleys (int n, String s) {
		int numValley = 0;
		boolean inValley = false;
		int tracker = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'U') 
				tracker++;
			
			else if(s.charAt(i) == 'D')
				tracker--;
			
			if(tracker < 0) {
				if(!inValley) 
					numValley++;
			
				inValley = true;
			}
			
			else if(tracker >= 0)
				inValley = false;
			
		}
		
		return numValley;
	}
}
