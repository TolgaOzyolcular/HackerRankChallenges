import java.util.Arrays;

public class LeftRotation {
	public static void main (String[] args) {
		int[] a = {1,2,3,4,5};
		int d = 2;
		
		System.out.println(Arrays.toString(rotLeft(a,d)));
	}
	
	public static int[] rotLeft(int[] a, int d) {
		int[] finalArray = new int[a.length];
		
		for(int i = 0; i < a.length; ++i) {
	        finalArray[i] = a[(i + (d % a.length)) % a.length];
		}

		return finalArray;
	}
}
