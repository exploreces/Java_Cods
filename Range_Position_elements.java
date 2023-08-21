public class Range_Position_elements {


    /*
     * Find the range of position of a specific given digit that is in which index it first 
     * occured and in which its last occured.
     */
    public static int[] searchRange(int []arr, int x) {
        int[] count = new int[arr.length];
         int countt = 0;
         
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == x) {
                 count[countt] = i;
                 countt++;
             }
         }
         
         if (countt == 0) {
             return new int[]{-1, -1};
         }
         
         // Extract the start and end indices from the count array.
         int[] range = {count[0], count[countt - 1]};
         return range;
     }
    
}
