package ExceptionHandling;

import java.util.Scanner;

public class MultipleException11 {
    public static void main(String[] args) {
        Scanner Scan= new Scanner(System.in);
        try{
            System.out.println("Enter Number: ");
            int i=Scan.nextInt();
            System.out.println("result: "+i/2);
            int a[]={1,2,3};
            System.out.println("Assiagn Value:"+a[12]);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Cannot Divided By 0.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Out Of Bounds.");
        }
        Scan.close();
    }
}
