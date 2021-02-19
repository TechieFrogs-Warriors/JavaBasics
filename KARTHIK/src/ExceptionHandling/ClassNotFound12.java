package ExceptionHandling;

public class ClassNotFound12 {
    public static void main(String[] args) {
        try{
            Class.forName("karthik");
        }

        catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("**CLASS NOT FOUND**");
        }
        finally{
            System.out.println("D.O.B :**-**-****");
            System.out.println("Number:**********");
            System.out.println("Standerd:*****");
        }
    }
}
