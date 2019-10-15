
public class jumpingOnTheClouds {
	public static void main (String[] args) {
		int[] c = {0,0,1,0,0,1,0,1,0};
		
		System.out.println(numSteps(c));
	}
	
	public static int numSteps(int[] c) {
		int steps = 0;
		int i = 0;
		
		while(i < c.length-1) {	
			
			if(i == c.length - 2) {
				if(c[i+1] == 1)
					return steps;				
				
				else {
					steps++;
					i++;
					return steps;
				}
			}
			
			
			if(c[i+1] == 1 && c[i+2] == 1)
				return steps;				
			
			else if (c[i+2] == 1) {	
				steps++;
				i++;
			}
			
			else {
				steps++;
				i+=2;
			}
		}
				
		return steps;
	}
}
