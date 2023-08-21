

    import java.util.* ;
import java.io.*; 
import java.util.Scanner;
public class Total_prime_in_Interval {
    public int totalPrime(int s,int e){

        int count=0;

        for(int i=s;i<=e;i++){
            boolean flag=false;
          
            for(int j=2;j*j<=i;j++){

                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            
            if(flag==false){
                count++;
            }
        }
		 return count;
    }
}

class Solution {
	public static void main(String args[]) {
		
		Total_prime_in_Interval obj = new Total_prime_in_Interval();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}
		
			
    

