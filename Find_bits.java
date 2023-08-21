public class Find_bits {
    /*
     * wap to count the number of 1's in the
     *  binary representation of an integer.
     */

     public static int countSetBits(int n) {
		int count =0;

		int i =n;
		while(i !=0){
			if(i%2==1){
				count++;
			}
			i=i/2;
		}
		return count;
	}
}
