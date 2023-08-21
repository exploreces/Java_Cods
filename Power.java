import java.util.*;

/*
 * finding x^n ? print the output.
 */
public class Power {
   
	public static int Product(int x,int p){
		int ans=1;
		
			while(p>0){
				ans=ans*x;
				p--;

				
		}
		return ans;

	}


	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int p = sc.nextInt();

		System.out.print(Product(x,p));
	
		}
	
}
    

