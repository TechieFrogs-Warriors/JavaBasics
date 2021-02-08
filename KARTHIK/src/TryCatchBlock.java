public class TryCatchBlock {
    public static void main(String[] args) {
        try{// this block contains exception throw code.
            int i=10/0;
        }
        catch(ArithmeticException e){//this block catch the exception 
            System.out.println(e);
        }
        System.out.println("Simple Try catch example program.");//it will be exicuted..
    }
}
