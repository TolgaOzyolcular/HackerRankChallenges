package Strings;

import java.util.regex.*;

public class MarsExploration {
	public static void main(String[] args) {
		String input = "SOSSOT";
		
		MarsExploration t = new MarsExploration();
		System.out.println(t.marsExploration(input));
	}
	
	public int marsExploration(String input) {
		int sosNum = input.length()/3;
		int count = 0;
		int output = 0;
		
		Pattern p = Pattern.compile("([S][O][S])\\1*");
		Matcher m = p.matcher(input);
		
		while(m.find()) {		
			count++;
		}
		
		System.out.println("Messed: " + (sosNum - count));
		return count;
	}
}
