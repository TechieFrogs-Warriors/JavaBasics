package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class EvenAndOddNumber16 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int Number;
        do{
            System.out.println("Enter Integer: ");
            while(!scan.hasNextInt()){
                System.out.println("Enter Integer Value Only: ");
                scan.next();
            }
            Number=scan.nextInt();
        }
        while(Number<=0);
        int Even=0,Odd=0;
        for(int i=0;i<=Number;i++){
            if(i%2==0){
                Even=Even+i;
            }
            else{
                Odd=Odd+i;
            }
        }
        System.out.println("Sum of Even Numbers: "+Even);
        System.out.println("Sum of Odd Numbers: "+Odd);
        scan.close();
    }
    
}
