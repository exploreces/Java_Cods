public class Peak_elements 
{


    public static int  peak(int[]arr){
         if (arr[0]>arr[1]){
                return arr[0];
            }

            if(arr[arr.length-1]>arr[arr.length-2]){
                return arr[arr.length-1];

            }
        for (int i =1;i<arr.length-1;i++){

            if(arr[i]>arr[i-1] && (arr[i]>arr[i+1])){
                return arr[i];
            }
            
        }

        return -1;
    }


    public static void main(String[]args){
        int arr[]= {1,2,4,3,78,65,7,-1};
     System.out.println("peak element is "+peak(arr));

}   
}



