public class Str_1stalpha_caps {

    // have to make the first alphabet capital of each word in the line.

    public static String convertString(String str) {
         

        String s[]=str.split("\\ ");

        String msg="";

        for(int i=0;i<s.length;i++)

        {

            String s1=s[i].substring(0,1).toUpperCase()+s[i].substring(1);

            msg=msg+s1+" ";

        }

        return msg;
        }

}

    

