public class TryCatchBlock3 {
   public static void main(String[] args) {
       try{
           int i=10/0;
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("This not Related catch to try block.");
       }
       catch(Exception e){
           System.out.println("Related to Try block");
       }

   } 
}
