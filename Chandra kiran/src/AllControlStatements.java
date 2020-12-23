public class AllControlStatements 
{
     static int m=4;
    public static void main(String[] args) 
   {   int n=1;
    if(n%2==0){
        
        System.out.println("n is even");
     }
    else if(n%2==1&&m>0) {
     switch (m) {
         
         case 1 : System.out.println("1");
         break;
         case 2: System.out.println("3");
         break;
         case 3:  System.out.println("5");
         break;
         case 4:  System.out.println("7");
         break;
         
         
             
            
     
         default:System.out.println("odd number");
             break;
     }
     
     }


}
} 


    

