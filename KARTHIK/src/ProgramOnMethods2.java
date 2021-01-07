import java.util.Scanner;

public class ProgramOnMethods2 {
    public static void main(String[] args) {
        Operation testObj=new Operation();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Value: ");
        int a=scan.nextInt();
        System.out.println("Enter b Value: ");
        int b=scan.nextInt();
        System.out.println("Enter String: ");
        String str=scan.next();
        String c=testObj.add(a,b,str);
        System.out.println("The Addition Value is"+a+"+"+b+"="+c);
        scan.close();
    }
    
}
