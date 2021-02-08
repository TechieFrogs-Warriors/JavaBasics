package ExceptionHandling;

public class PassAurgument5 {
    public static void main(String[] args) {
        try{
            System.out.println("***Hello World***");
            //int i=10/0;
            throw new Exception("Arithmetic Exception.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
