public class same_array {
    public static boolean same(int[]arr1, int[]arr2){
        if (arr1.length != arr2.length){ 
            return false;
        }

       for(int i =0;i<arr1.length;i++){
        if(arr1[i]!= arr2[i]){
            return false;
                      
        }

       }

       return true;
}

public static void main(String[]args){
    int[]arr1 ={1,2,3,4,0,7,8,91};
    int[]arr2 ={1,2,3,4,5,7,8,91};
    System.out.print(same(arr1,arr2));
}
}

