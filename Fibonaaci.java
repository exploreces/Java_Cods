

/* find fibo using matrix calculation , as ans can be large find it in modula 10^9 +7 
 * 
*/
import java.util.*;
public class Fibonaaci {
   
    public static int fibonacciNumber(int n){
        // Write your code here.
         int mod = (int) 1e9 + 7; // for large inputs accn to Q
        if(n==0 || n==1){
            return n;
        }
        else{
            return  (fibonacciNumber(n-1) +fibonacciNumber(n-2)) %mod;        }
    }
}
    

