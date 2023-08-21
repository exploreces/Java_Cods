
import java.util.* ;
import java.io.*; 

//complete this ABOVE CODE to get encoded
// code such that if input is aaaabbbccdaa then output is a4b3c2d1a2


public class encoding_String {
/*    public static String encode(String message) {
		String[] s = new String[message.length()];

		for(int i =0;i<message.length();i++){
			s[i]= String.valueOf(message.charAt(i));
		}

		String encodedMessage = "";
		int count=1;
		for(int j =0;j<s.length;j++){

				while (j < s.length - 1 && s[j].equals(s[j + 1])) {
            count++;
            j++;
        }

        encodedMessage += s[j] + count;
        count = 1;
    }

    return encodedMessage;
}
				
}				
*/
	
//perfect solution ..above only run 3 cases.
    


	public static String encode(String message) {
		StringBuilder ans = new StringBuilder();
		for(int i=0;i<message.length();i++){
			char ch = message.charAt(i);
			int count = 1;
			while(i+1<message.length() && ch==message.charAt(i+1)){
				i++;
				count++;
			}
			ans.append(ch);
			ans.append(count);
		}
		return ans.toString();
	}
}
