
import java.util.*;
public class Balanced_parenthesis {


    /*
            *      Declare a character stack.
        Now traverse the expression string exp.
        If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
        If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and if the popped character is the matching starting bracket then fine else brackets are not balanced.
        After complete traversal, if there is some starting bracket left in stack then “not balanced”
            */
    


            public static boolean parenthesis (String s){
                     Stack<Character> stack = new Stack<>();
                     //for (char c : s.toCharArray()) conversion of string to char array for ease in loops
                     // else we can also try 
                     //for (int i = 0; i < str.length(); i++) {
                    // char x = str.charAt(i);

                     for(char c : s.toCharArray()){
                        if (c =='('||c=='['|| c=='{'){
                                stack.push(c);
                        }
                        else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                            stack.pop();
                        } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                            stack.pop();
                        } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                            stack.pop();
                        } else {
                            return false; // Unbalanced case
                        }
                    }
                            return true;
                     }

                     public static void main(String[] args) {
                        String str = "()(())";
                        if (parenthesis(str))
                            System.out.println("True");
                        else
                            System.out.println("False");
    }
}
            

