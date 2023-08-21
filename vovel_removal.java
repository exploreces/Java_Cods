public class vovel_removal {
    public static String vovel_R(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }
    
}

/*
 * String s="";

      for(int i=0;i<str.length();i++){

          char ch=str.charAt(i);

          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
              continue; 
          }


		  else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
             continue;
          }

          s+=ch;  

      }

      return s;

    }

}

 */