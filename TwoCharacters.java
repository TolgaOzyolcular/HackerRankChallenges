package Strings;

import java.util.*;
import java.util.regex.*;

public class TwoCharacters {
	public static void main(String[] args) {
		String input = "beabeefeabkgfvab";
		
		TwoCharacters t = new TwoCharacters();
		System.out.println(t.twoCharacters(input));
	}
	
	public int twoCharacters(String s) {
		String[] tempArray = s.split("");
		String tempString = "";
		HashSet<String> tempSet = new HashSet<String>(Arrays.asList(tempArray));
		ArrayList<String> letters = new ArrayList<String>(tempSet);
		int length = 0;
		Pattern p = Pattern.compile("^([a-z])(?!\\1)([a-z])(?:\\1\\2)*\\1?$");
		Matcher m;
		
		for(int i = 0; i<letters.size(); i++) {
			for(int j = i+1; j<letters.size(); j++) {
				tempString = s.replaceAll("([^"+letters.get(i)+" "+letters.get(j)+"])", "");
				m = p.matcher(tempString);
				if((m.find()) && (tempString.length() >= 4) && (tempString.length() > length)) {
					System.out.println(tempString);
					length = tempString.length();
					s = tempString;
				}
				
				tempString = "";
			}
		}
				
		return length;
	}
}
