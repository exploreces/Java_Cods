
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class unstop__SumInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];

        for(int i =0;i<n;i++){
          arr[i]=sc.nextInt();

        }

        int start=sc.nextInt();
        int end= sc.nextInt();

        int sum =0;
        for(int i =0;i<n;i++){
          if(arr[i]>=start && arr[i]<=end){
            sum +=arr[i];
          }

        }

        System.out.print(sum);
            }
}