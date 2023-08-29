/**
 * Subset_Array
 *  arr1 = {1,2,3,4,5}  , arr2 = {3,4,5}
    arr2 is a subset of arr1 (As, arr1 contains all the elements of arr2)
 */
public class Subset_Array {

    static boolean isSubset(int arr1[], int arr2[], int m, int n){
        int j =0;
        for (int i =0; i<n;i++){
            for( j =0;j<m;j++){
                if(arr2[i]==arr1[j]){
                    break;
                }
            }

            if ( j==m){
                return false; 
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        int arr1[] = { 11, 10, 13, 21, 30, 70 };
        int arr2[] = { 11, 30, 70, 10 };
    
        int m = arr1.length;
        int n = arr2.length;
 
        if (isSubset(arr1, arr2, m, n))
            System.out.print("arr2[] is subset of arr1[] ");
        else
            System.out.print("arr2[] is not subset of arr1[] ");
 
    }



    
}