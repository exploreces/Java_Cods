
   import java.util.*;
public class remove_val {
 
/* Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.*/

    public static int removeElement(int[] nums, int val) {
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                r.add(nums[i]);
            }
        }

        for (int i = 0; i < r.size(); i++) {
            nums[i] = r.get(i);
        }
        return r.size();
    }



    public static void main(String[] args) {
        remove_val solution = new remove_val();
        
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        
        int newSize = removeElement(nums, val);
        
        System.out.println("New length: " + newSize);
        System.out.print("Modified array: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

    

