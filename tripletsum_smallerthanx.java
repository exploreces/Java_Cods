
// given a target sum , find count of triplets such that a<b<c and a+b+c <target sum in the array 
import java.util.*;
public class tripletsum_smallerthanx {

    public static int countTriplets(int arr[], int target){
        int n =arr.length;
        int count=0;
        Arrays.sort(arr);
        for (int i =n-1;i>=2;i--){
            int l =0;
            int r =i-1;

            while(l<r){
                if(arr[l]+arr[i]+arr[r]< target){
                    count ++;
                    l++;

                }    
                r--; 
                
               
             }
        }
        return count;
    }

    public static void main(String args[])
  {

     int arr[] = {-2,0,1,3};
     System.out.print(countTriplets(arr,2));

    
}
    
}
