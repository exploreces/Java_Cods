/**
 * pos_neg_alt_elem
 */
public class pos_neg_alt_elem {

   
        public static int[] alternatePosition(int[] arr) {
            int n = arr.length;
            int[] result = new int[n];
            int evenIndex = 0;
            int oddIndex = 1;
    
            for (int i = 0; i < n; i++) {
                if (arr[i] >= 0) {
                    result[evenIndex] = arr[i];
                    evenIndex += 2;
                } else {
                    result[oddIndex] = arr[i];
                    oddIndex += 2;
                }
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            int[] inputArray = {9,4,-2,-1,5,0,-5,-3,2};
            int[] resultArray = alternatePosition(inputArray);
    
            System.out.print("Resulting Array: ");
            for (int num : resultArray) {
                System.out.print(num + " ");
            }
        }
    }
    
