import java.util.Scanner;

public class SampleProgram11 {
    public static void main(String[] args) {
        //Java Program to Generate Multiplication Table using for or while loop
        Scanner scan=new Scanner(System.in);
        int a;//validation part
        do{
            System.out.println("Enter Integer Value:");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Value:");
                scan.next();

            }
            a=scan.nextInt();
        }
        while(a<=0);
        int b=20,c=0;
        int d;
        while(c<=b){
            d=c*a;
            System.out.println(c+"*"+a+"="+d);
            c++;
        }
        scan.close();
        


        
    }
    
}
