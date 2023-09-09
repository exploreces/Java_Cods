/**
 * minmax_Array
 */
import java.util.*;
public class minmax_Array {

    public static int min(int[]arr){
        Arrays.sort(arr);
        return arr[0];

    }

    public static int max(int[]arr){
        Arrays.sort(arr);
        return arr[arr.length-1];

    }


    public static void main(String[]args){
        int arr[]= {1,2,4,3,78,65,7,-1};
        System.out.println(min(arr));
        System.out.println(max(arr));

    }
}