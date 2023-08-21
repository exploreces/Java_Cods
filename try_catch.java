class try_catch extends Exception {
    public try_catch(String s)
    {
        super(s);
    }
}
class ZeroException extends Exception {
    public ZeroException(String s)
    {
        super(s);
    }
}

public class try_catch {
    public static String calculatePower(String A, String B) {
        try{
            int a= Integer.parseInt(A);
            int b= Integer.parseInt(B); // for changing string to integer.

            if(a<0 || b<0){
                throw new solution("A or B can't be negative.");
            }
            else if(a==0 && b==0){
                throw new ZeroException("A and B both can't be zero.");
            }

            // Calculate Answer.
            int answer=(int)Math.pow(a,b);

            // Return 'answer' as string.
            return Integer.toString(answer);
        }
        
        // Catch all the exceptions.
        catch( solution  e){
            return "A or B can't be negative.";
        }
        catch( ZeroException  e){
            return "A and B both can't be zero.";
        }
        catch( ArithmeticException e){
            return "Arithmetic Exception occurred.";
        }
        catch(NumberFormatException e){
            return "Number Format Exception occurred.";
        }
        catch(Exception e){
            return "Some other error occurred.";
        }
    }
}