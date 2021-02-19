package ExceptionPrograms;

public class Program5 {
    public static void main(String[] args) {

        int a3 = 10, b3 = 0;
        String s = null;
        // try block
        try {
            int c = a3 / b3;
            int len = s.length();
            System.out.println("length of string : " + len);

        }
        // parent class exception should be last
        /*
         * catch(Exception e) {
         * 
         * }
         */
        // catch block 1
        catch (ArithmeticException x) {
            System.out.println(x);
            int c = a3 / (b3 + 2);
            // int c1 = a3 / b3;
            // catch block will not hold exception and program terminates
        }
        // catch block 2
        catch (Exception e)// parent class exception
        {
            s = "hello";// we can correct if any exception in catch block occur from try block
            System.out.println(e);
        }
        // two parent class exception should not be there
        /*
         * catch(Exception e)//error occurs catch block cannot be reached {
         * 
         * }
         */
        finally {
            System.out.println("code");
        }
        // there should be only one fillay block
        /*
         * finally {
         * 
         * }
         */
    }

}
