import java.util.*;
import java.util.stream.Stream;

public class Problem13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addFirst(num);
        }

        long[] count = new long[n];
        
        for(int i = 0; i<m+1; i++) {
        		count[i] = deque.stream().skip(i).limit(m).distinct().count();        		
        }
        
        long largestCount = count[0];
        for(int i = 0; i < count.length; i++) {
        		if(largestCount < count[i])
        			largestCount = count[i];
        }
        
        System.out.println(largestCount);
    }
}
