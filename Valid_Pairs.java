import java.util.*;
public class Valid_Pairs {
    public static boolean isValidPair(int[] arr, int n, int k, int m) {
        if (n % 2 != 0) {
		return false;
}                                               // m = remainder ;  k = by which we divide.

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
        int remainder = arr[i] % k;
        map.put(remainder, map.getOrDefault(remainder, 0) + 1);

    }

        for (int i = 0; i < n; i++) {                   // (remainder - arr[i]%k +k)%k --> we get the number by which it should be divided to get desirable.
                int value = (m - arr[i] % k + k) % k;
                if (map.containsKey(value)) {
                    int frequency = map.get(value);
                        if (frequency > 0) {
                            map.put(value, frequency - 1);
                            /*
                             * map.put(value, frequency - 1);: If both the key exists in the
                             *  frequency map and there are available elements with that modulo
                             *  result, this line reduces the frequency count by one.
                             *  This indicates that one element with the calculated value has 
                             * been used to form a pair, so its availability decreases.
                             */
        

                            } 
                        else {
                             return false;
                         }

                 }    
                else {
                    return false;

                }

        }
    return true;

    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 8, 3, 0};
        int n = arr.length;
        int k = 3;
        int m = 2;

        boolean result = isValidPair(arr, n, k, m);
        System.out.println(result);
       // int calc = (3-2%9+9)%9;
       // System.out.println(calc);


}

}

