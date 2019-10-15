
public class TwoDArrayDS {
	public static void main (String[] args) {
		int[][] arr = new int[][] {
					{-1, -1, 0, -9, -2,-2},
					{-2, -1, -6, -8, -2, -5},
				 	{-1, -1, -1, -2, -3, -4},
				    {-1, -9, -2, -4, -4, -5},
				    {-7, -3, -3, -2, -9, -9},
				    {-1, -3, -1, -2, -4, -5}
		};
		
		System.out.println(hourglassSum(arr));
	}
	
	public static int hourglassSum(int[][] arr) {
		int highestSum = -2147483648;
		int tempSum = 0;
		
		for(int i = 0; i < arr.length-2; i++) {
			for(int j = 0; j < arr.length-2; j++) {
				tempSum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				if(tempSum > highestSum)
					highestSum = tempSum;
			}
		}
		
		return highestSum;
	}
}
