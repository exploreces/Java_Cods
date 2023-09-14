public class range_subarraysum {
    

    public static int subarraycount(int[]arr, int L, int R){
        int n = arr.length;
        int count=0;

        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]+arr[j]>=L || arr[i]+arr[j]<=R ){
                    count++;
                }
            }


        }
        return count;
    }

    /*      ## O(n) time complexity! -- sliding windows concept !

     * public static int subarrayCount(int[] arr, int L, int R) {
    int n = arr.length;
    int count = 0;
    int prefixSum = 0;
    int left = 0;
    int right = 0;

    while (right < n) {
        prefixSum += arr[right];

        while (prefixSum > R) {
            prefixSum -= arr[left];
            left++;
        }

        count += (right - left + 1);

        while (prefixSum < L) {
            prefixSum -= arr[left];
            left++;
        }

        right++;
    }

    return count;
}

     */

    public static void main(String[] args) {

        int arr[]={2,3,5,8};
        int L =4;
        int R = 13;
        System.out.print(subarraycount(arr,L,R));
        
    }
}
