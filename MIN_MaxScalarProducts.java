import java.util.*;

        //to find minimum scalar products
public class MIN_MaxScalarProducts {        
    public static int productsmin(Integer[] arr1, Integer[] arr2){

        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());      // to have it in reverse order.
        int productmin =0;
        for(int i =0;i<arr1.length;i++){
            productmin +=arr1[i]*arr2[i];
                
            }
         
            return productmin;
    }

            //to find maximum scalar products.
     public static int productsmax(Integer[] arr1, Integer[] arr2){

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int productmax =0;
        for(int i =0;i<arr1.length;i++){
            productmax +=arr1[i]*arr2[i];
                
            }
         
            return productmax;
    }


    public static void main (String[] args)
    {
        Integer arr1[] = {1, 2, 6, 3, 7};
          Integer arr2[] = {10, 7, 45, 3, 7};
           System.out.println(arr1.length);
           System.out.println("The minimum scalar products is " +productsmax(arr1 , arr2));
           System.out.println("The minimum scalar products is " +productsmin(arr1 , arr2));
    }
    
}
