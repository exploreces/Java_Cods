import java.util.*;
public class AS_Reverse_array {

    public static int[] reverse(int []arr){

        int[]arr1 = new int[arr.length];
        int j =0;
        for(int i = arr.length-1;i>=0;i--){
            arr1[j]=arr[i];
            j++;
        }
        return arr1;

    }

    public static void main(String args[])
   {

     int arrr[] = {10, 20, 30, 40, 50};
     System.out.print(arrr.length);
     arrr=reverse(arrr);
     System.out.println((Arrays.toString(arrr)));
     
    
}

    
}