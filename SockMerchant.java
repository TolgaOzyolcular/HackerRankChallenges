import java.util.*;

public class SockMerchant {
	
	public static void main (String[] args) {
		int n = 7;
		int[] ar = {1,2,1,2,1,3,2,3,4,5,6,7,4,4,6};
		System.out.println(numOfPairs(n, ar));
	}
	
	public static int numOfPairs (int n, int[] ar) {
		int pairs = 0;
		int count = 0;
		int temp = 0;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < ar.length; i++) {
			if(!list.contains(ar[i]))
				list.add(ar[i]);
		}
		
		for(int i = 0; i < list.size(); i++) {
			for(int j = 0; j < ar.length; j++) {
				if(list.get(i) == ar[j])
					count++;
			}
			
			pairs += count/2;
			count = 0;
		}
		
		return pairs;
	}

}
