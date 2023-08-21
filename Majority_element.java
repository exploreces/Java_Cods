import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Majority_element {
    
    public static List<Integer> majorityElementII(int[] arr) {
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        int meter = n / 3;
        
        Arrays.sort(arr);
        
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            
            if (count > meter && !res.contains(arr[i])) {
                res.add(arr[i]);
            }
        }
        
        return res;
    }
 

public static void main(String[] args) {
        int[] arr = {3, 2, 3, 4, 4, 5, 5, 5};
        List<Integer> result = majorityElementII(arr);

        System.out.println("Elements appearing more than n/3 times: " + result);
    }
}

    



       //USING LIST AND MAP METHODS
    /*
     * public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {   
       ArrayList<Integer>res = new ArrayList<>();
        int meter = arr.size()/3;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
         for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > meter) {
                res.add(entry.getKey());
            }
        }
        
        return res;
    }
}
     */