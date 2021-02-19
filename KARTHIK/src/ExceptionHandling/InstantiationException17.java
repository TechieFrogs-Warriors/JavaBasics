package ExceptionHandling;

public class InstantiationException17 {
   public static void main(String[] args) {
       InstaExp();

   } 
   static void InstaExp(){
       boolean C=false;
       try{
        throw new InstantiationException("Instantiation Exception occurs");
    }
    catch(InstantiationException e){
        C=true;
        System.out.println(e);
    }  
    System.out.println(C);  
   }
}