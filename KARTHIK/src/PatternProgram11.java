import java.util.Scanner;

public class PatternProgram11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int Number;
        do{
            System.out.println("Enter Number: ");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Value: ");
                scan.next();
            }
            Number=scan.nextInt();
        }
        while(Number<=0);
        char ch='a';
        int i,j;
        for(i=Number;i>=1;i--) {
             for(j=0;j<=i;j++){
                 System.out.print((char)(ch+j));
             }
             System.out.print(" ");
             for(int k=i;k>=0;k--){
                 if(k!=Number){
                     System.out.print((char)(ch+k));
                 }
                 else{
                  System.out.print("");
                 }
             }
             System.out.println();
             
        }
             for(i=0;i<=Number;i++){
                 for(j=0;j<=i;j++){
                     System.out.print((char)(ch+j));
                 }
                System.out.print(" ");
                 for(int k=i;k>=0;k--){
                    if(k==Number){
                        System.out.print("");
                    }
                    if(k!=Number){
                        System.out.print((char)(ch+k));
                    }
                }
                System.out.println();
            }
        
    }
    
}
