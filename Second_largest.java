
import java.util.* ;
import java.io.*; 
public class Second_largest {
	public static int findSecondLargest(int n, int[] arr) {
		 Arrays.sort(arr);
        int res =-1; // Initialize with a very small value
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                res = arr[i];
                break;
            } else if (arr[i] >= arr[i + 1]) {
                continue;
            }
        }
        
        return res;
    }
}
    
