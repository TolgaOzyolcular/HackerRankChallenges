import java.util.Arrays;

public class MinimumSwapsTwo {
	public static void main (String[] args) {
		int[] arr = {7, 1, 3, 2, 4, 5, 6};
		
		System.out.println(minimumSwaps(arr));
	}

	// basically a Selection Sort algorithm
	public static int minimumSwaps(int[] arr) { 
		int swapCount = 0;
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != i+1) {
				for(int j = i; j < arr.length; j++) {
					if(arr[j] == i+1) {
						//System.out.println(arr[i] + " " + arr[j]);
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						swapCount++;
					}
				}
			}
		}
		
		return swapCount;
	}
}
