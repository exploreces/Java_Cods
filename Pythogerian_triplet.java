
import java.util.*;
public class Pythogerian_triplet {

    //Return true if there exists a,b,c such that a^2 +b^2 = c^2


    public static boolean triplet(int arr[]) {

        int n = arr.length;
        for (int i =0;i<n;i++){
            arr[i]= arr[i]*arr[i];      //squaring all the numbers.
        }

        Arrays.sort(arr);           //sorted!

       for(int j =n-1; j>2;j--)
       {                                // pointer to the last highest one
            int l =0;                       // locating l at 0 index
            int r = j-1;                    // locating r at  last index -1

            while(l<r)                      // to avoid overlap and cross each other([pointers -- l,r])
            {                                 
                if(arr[l] + arr[r]==arr[j]){
                    return true;
                }
                if (arr[l]+arr[r] < arr[j]){
                    l++;
                }
                else{
                    r--;
                }
            }

       }

        return false;

    }

    public static void main(String args[])
  {

     int arr[] = {3,21,4,6,5};
     System.out.print(triplet(arr));

    
}
}
