import java.util.Scanner;

public class CharValidation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char ch;
        do{
            System.out.println("Enter Charecter: ");
            while (!scan.hasNext("[a-zA-Z]")) {
                System.out.println("Enter Charecter Only: ");
                scan.next();
                
            }
            ch=scan.next().charAt(0);
        }while(ch<='0');
    }
}
