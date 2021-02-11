package ExceptionPrograms;

public class Program3 {
    // try catch blocks should written in methods not out side the method

    /*
     * try { int[] a={1,2,3,4,5}; System.out.println(a[10]);// throw exception }
     * //catch block catch(Exception e)//generated type exception {
     * System.out.println("catch block"); }
     */
    public static void main(String[] args) {

        // try block should have catch or finally block to execute
        /*
         * int a=10,b=0,c; try { c=a/b; } System.out.println("code");
         */

        int a = 10, b = 0;
        // try block
        try {
            int c = a / b;
            System.out.println(c);
        }
        // catch block
        catch (Exception e)// exception
        {
            System.out.println(e);
        }
        System.out.println("code");

        int a1 = 10, b1 = 0;
        // try block
        try {
            int c = a / b;
            System.out.println(c);
        }
        // catch block
        catch (Exception e)// exception
        {
            // System.out.println(e);
            int c = a1 / (b1 + 2);// we can corect the exception in catch block
            System.out.println(c);

        }
        System.out.println("code");

        int a2 = 10, b2 = 0;
        // try block
        try {
            int c = a2 / b2;
            System.out.println(c);
        }
        // if there is no catch block after the try block we cannot catch the exception
        // and the program terminates

        finally {
            System.out.println("code");
        }
    }

}
