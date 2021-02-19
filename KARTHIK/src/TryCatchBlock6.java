public class TryCatchBlock6 {
    public static void main(String[] args) {
        try{
            String s=null;
            int l= s.length();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arithmetic Exception.");
        }
        catch(Exception e){
            System.out.println("String Null Exception.");
        }
        System.out.println(2+5+6+7);
        
    }
}
