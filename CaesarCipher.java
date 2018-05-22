package Strings;

public class CaesarCipher {
	
	public static void main(String[] args) {
		String input = "asdfwz";
		int k = 4;

		CaesarCipher t = new CaesarCipher();
		System.out.println(t.caesarCipher(input, k));
	}
	
	public String caesarCipher(String s, int k) {
		// abcdefghijklmnopqrstuvwxyz
		String output = "";
		int temp = 0;
		
		for(int i = 0; i<s.length(); i++) {
			temp = (((int)s.charAt(i) + k - 97) % 26 + 97);			
			output += (char) temp;
		}
		
		return output;
	}

}
