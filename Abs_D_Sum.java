public class Abs_D_Sum {

    /*
            * Take a variable say result = Integer.MAX_VALUE, to hold the required minimum sum.
        Run an outer loop from index 0 to n,
        Create a variable say sum = 0,
        Run an inner loop from index 0 to n,
        Set, sum += Math.abs(arr[i]-arr[j])
        After complete iteration of inner loop set,
        result = Math.min(result, sum).
        Print result.
     */

    public static int abs_Difference_sum(int[]arr, int n){

        int result = Integer.MAX_VALUE;

        for (int i =0;i<n;i++){
            int sum =0;
               for (int j =0;j<n;j++){
                sum += Math.abs(arr[i]-arr[j]);
               }

            result = Math.min(result,sum);
        }
        return result;
    }
    
    // Driver code
    public static void main(String args[])
    {
        int arr[] = {2, 4, 5, 3};
        int n = arr.length;
         
        System.out.println( "Required Minimum Sum is " + abs_Difference_sum(arr, n));
    }
}

