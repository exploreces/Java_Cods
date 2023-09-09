public class Sum_Subarray {

    public static void findSubarrayWithSum(int[] arr, int target) {
        int sum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                System.out.println( + start + " to " + end);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5 };
        int target = 12;
        findSubarrayWithSum(arr, target);
    }
}
