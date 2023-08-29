
import java.util.*;
public class Distict_elements {
    public static int count_distinct(int[]arr){
        Set<Integer> count = new HashSet<>();
        for(int i :arr){
            count.add(i);
        }
        return count.size();
    }
    

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        int Count = count_distinct(arr);

        System.out.println("Distinct Elements Count: " + Count);
    }
}
