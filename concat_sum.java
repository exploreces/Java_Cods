/*
 * You have been given a vector/list 'ARR' consisting of 'N' integers. You are also given a positive integer 'K'.
Let's define a vector/list 'CONCAT' of size 'N K' formed by concatenating 
'ARR' 'K' times. For example, if 'ARR' = [0, -1, 2] and 'K' = 3, then 'CONCAT' is given by [0, -1,
2, 0, -1, 2, 0, -1, 2].
Your task is to find the maximum possible sum of any non-empty subarray (contagious) of 'CONCAT'.

 */

import java.util.* ;
import java.io.*; 
public class concat_sum {
public class Solution {

	public static Long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		long max = Long.MIN_VALUE;
		long curr =0;
		

		for(int i =0;i<n*k;i++){
			curr += arr.get(i%n);
			max = Math.max(curr, max);

			if(curr<0){
				curr=0;
			}

		}
		return max;
		}
			
		

		}

    
}
