package ExceptionHandling;

public class ChainedException7 {
    public static void main(String[] args) {
        try{
            NumberFormatException e=new NumberFormatException("Number Formate-1");
            e.initCause(new ArrayIndexOutOfBoundsException("Number Formate-2"));
            throw e;
        }
        catch(NumberFormatException e){
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}
