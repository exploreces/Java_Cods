import java.util.ArrayList;
import java.util.Arrays;


/*
 * we need to find out 3 such array indices which can become sides of a non-degenerate triangle. 
 * For a non-degenerate triangle, its sides should follow these constraints, 
A + B > C    and     
B + C > A    and
C + A > B
where A, B and C are length of sides of the triangle.
The task is to find any triplet from array that satisfies above condition.
 */

 
public class non_dec_Triangle {
    public class Solution{
	public static boolean possibleToMakeTriangle(ArrayList<Integer> arr){

		Integer[] arrr = new Integer[arr.size()];
		
		for (int i = 0; i < arr.size(); i++){
            arrr[i] = arr.get(i);

		}
		Arrays.sort(arrr);
		for(int m =0;m<arrr.length-2;m++){
			if(arrr[m]+arrr[m+1]>arrr[m+2]){
				return true;
			}
		}
	
		

		return false;
	}
}
    
}
