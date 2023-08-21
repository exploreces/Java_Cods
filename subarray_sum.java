
    import java.util.* ;
import java.io.*; 

/*
 * You are given an array (ARR) of length N, consisting of integers.
 *  You have to find the
 *  sum of the subarray (including empty subarray) having maximum sum among all subarrays.
  A subarray is a contiguous segment of an array. In other words, a subarray can be formed by 
  removing 0 or more integers from the beginning, and 0 or more integers from the end of an array.
 * 
 */
public class subarray_sum {
public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {

        // write your code here

        long current_max= arr[0]; 

        long global_max = arr[0];

        // int sum =0, max= Integer.MIN_VALUE;

        for ( int  i=1 ; i< n; i++){

            current_max = Math.max(arr[i], current_max + arr[i]);

            if (current_max > global_max){

                global_max = current_max;

            }

        }

        return global_max<0? 0: global_max ;

    }
}
    
}
