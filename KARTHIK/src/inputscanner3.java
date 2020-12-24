import java.util.Scanner;

public class inputscanner3 {
    public static void main(String[] args) {
        //String a;
        Scanner scan=new Scanner(System.in);
       // a=scan.nextLine();
       System.out.println("Enter your value:  ");
        if(scan.hasNextShort()){
        while(scan.hasNext()){
            
                System.out.println("VALID: " +scan.nextShort());
            break;

            }
        }
            else
            System.out.println("NOT VALID: "+scan.next()); 
            

        
        
        scan.close();
    }
}
    

