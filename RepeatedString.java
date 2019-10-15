
public class RepeatedString {
	public static void main (String[] args) {
		long n = 1000000000000L;
		String s  = "a";
		System.out.println(repeatedString(n,s));
	}
	
	public static long repeatedString(long n, String s) {
		long remainder = n % s.length();
		long repeated = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a')
				repeated++;
		}
		
		repeated = repeated * (n/s.length());
		
		for(int i = 0; i < remainder; i++) {
			if(s.charAt(i) == 'a')
				repeated++;
		}
		
		System.out.println(remainder);
		
		return repeated;
	}
}
