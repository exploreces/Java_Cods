
import java.util.*;
public class one_half_sec_half_array {

    public static int[] order(int[]arr){
        int temp=0;
         for(int i =0;i<arr.length-1;i++){ 


            for(int j =i+1;j<arr.length/2;j++){
            if (arr[i]>arr[j]){
                temp=arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
         }

         for(int j=arr.length/2; j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
         }
        }
      
        return arr;      
    }

    public static void main(String[] args)
   {
       int[] arrr = {3, 2, 4, 1, 10, 30, 40, 20};
       arrr=order(arrr);
       System.out.print(Arrays.toString(arrr));

    }
    

}