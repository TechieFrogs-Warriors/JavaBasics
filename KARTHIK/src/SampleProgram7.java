import java.util.Scanner;

public class SampleProgram7 {
    public static void main(String[] args) {
        //Java Program to Check Whether a Character is Alphabet or Not
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Character");
        char ch=scan.next().charAt(0);
        if(ch>='a'&&ch<='z'||(ch>='A'&&ch<='Z'))
        System.out.println("Enter Character Is An Alphabet");
        else 
        System.out.println("Enter Character Is Not An Alphabet");
        scan.close();

    }
    
}
