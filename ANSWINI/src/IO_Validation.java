import java.util.Scanner;

public class IO_Validation 
{
    public static void main(String[] args)
     {
        System.out.println("------------ validation for Positive Integer ------------");
        Scanner obj = new Scanner(System.in);

        int number;
        do {
            System.out.println("enter  Postive Number: ");
            while (!obj.hasNextInt()) 
            {
                System.out.println("This is not a number.Please Enter Positive Number: ");
                obj.next();
            }
            number = obj.nextInt();
        } while (number <= 0);
        System.out.println("its a Number: " + number);

        System.out.println("------------ validation for float number ------------");

        float i;
        do {
            System.out.println("Enter Floting point Number: ");
            while (!obj.hasNextFloat()) 
            {
                System.out.println("This is not a floating point number.Please Enter floating point number:");
                obj.next();
            }
            i = obj.nextFloat();
        } while (i >= 2536.2558);
        System.out.println("The floating point number: " + i);

        System.out.println("------------ validation for STRING ------------");

        String s;
        do {
            System.out.println("Enter String: ");
            while (!obj.hasNext("[A-Za-z]*")) 
            {
                System.out.println("This is not a string please enter String: ");
                obj.next();
            }
            s = obj.nextLine();
        } while (s != "");
        System.out.println("Entered  String Is valid ");


        System.out.println("------------ validation for characters ------------");

        char ch;
        do {
            System.out.println("Enter character: ");
            while (!obj.hasNext("[A-Za-z]")) 
            {
                System.out.println("This is not a character please enter character: ");
                obj.next();
            }
            ch = obj.next().charAt(0);
        } while (ch <= 0);
        System.out.println("Entered  character Is valid ");
        obj.close();



        
    }
    
}
