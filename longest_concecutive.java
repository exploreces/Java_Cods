
    import java.util.Arrays;

public class longest_concecutive {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Sort the given array in ascending order.
        Arrays.sort(arr);

        // To store length of longest consecutive sequence.
        int mx = 0;

        // To store the length of current consecutive Sequence.
        int count = 0;

        for (int i = 0; i < N; i++) {

            // Check if previous value is consecutive to the current value.
            if (i > 0 && (arr[i] == arr[i - 1] + 1)) {
                count++;

            }
            // Skip if the current value is equals to the previous value.
            else if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            // Reseting count for next upcoming consecutive sequence.
            else {
                count = 1;
            }

            mx = Math.max(mx, count);
            
        }

        return mx;
    }
}
    
// python method--
/*
 * from math import *
from collections import *
from sys import *
from os import *
def lengthOfLongestConsecutiveSequence(arr, n):
    arr.sort()  # Use arr.sort() instead of str=arr.sort()
    longest_count = 0  # Initialize the longest_count to keep track of the longest sequence
    current_count = 1  # Initialize current_count to keep track of the current sequence
    
    for i in range(1, n):
        if arr[i] == arr[i - 1] + 1:
            current_count += 1
        elif arr[i] == arr[i - 1]:
            continue
        else:
            longest_count = max(longest_count, current_count)  # Update longest_count
            current_count = 1  # Reset current_count
        
    return max(longest_count, current_count) 
*/
 