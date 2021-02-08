public class TrycatchBlock1 {
    public static void main(String[] args) {
        try{
            int a=10/0;
            System.out.println("It can not be exicuted");
        }
         catch(ArithmeticException e){
            System.out.println(e);
            // System.out.println(a);
         }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Exception handling by parent class exception");
        }
        catch(Exception e){
            System.out.println("Custom message in catch");
        }
    }
}
