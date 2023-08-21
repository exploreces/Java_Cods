
import java.util.*;
/**
 * Sum_even_odd : wap to find sum of even and odd digits of a number separately.
 */
public class Sum_even_odd {

public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

 

        int num = sc.nextInt();

        int sumOfEven = 0;

        int sumOfOdd = 0;

 

        while(num>0){

            int digit = num%10;

            if(digit%2 == 0){

                sumOfEven += digit;

            } else {

                sumOfOdd += digit;

            }

            num = num/10;

        }

        System.out.println(sumOfEven + " " + sumOfOdd);

        

    }

}