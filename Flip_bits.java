public class Flip_bits {

    /*
     * ou are given an array of integers ARR[] of size N consisting 
     * of zeros and ones. You have to select a subset and flip bits of that subset.
     *  You have to return the count of maximum one's that you can obtain by flipping chosen sub-array at most once.
        A flip operation is one in which you turn 1 into 0 and 0 into 1.
     */
    
    public class Solution {
        public static int flipBits(int[] arr,int n) {
            
            int max =0;
            int totalone=0;
    
            for(int i =0;i<n;i++){
                if(arr[i]==1){
                    totalone++;
                }
    
                int count1=0; int count0 =0;
                for(int j =i;j<n;j++){
                    if(arr[j]==1){
                        count1++;
                        
                    }
                    else{
                        count0++;
                    }
                    max = Math.max(max,count0-count1);
                }
                
            }
    
            return totalone+max;
        }
    }
    
    
}
