package TcsPrograms;

import java.util.Scanner;

public class CeaserCipher 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String Text =Validation(scanner);
        int key=InputValidation(scanner);
        Text=Text.replace(" ", "");
        Text=CustomerCaeserCipher(key,Text);//Method calling
        System.out.println("The encrypted Text is "+Text);//prints the encrypted string
    }
    public static String CustomerCaeserCipher(int key,String Message)
    {
        char Text[]=Message.toCharArray();//coverts the string into char array
        for(int i=0;i<Text.length;i++)//for loop for char array
        {
            Text[i]=(char)(Text[i]+key);//shift the alphabet value by key value
        }
        String EncryptedMessage = new String(Text);//coverts again the char array into string
        return EncryptedMessage;
    }
    public static String Validation(Scanner scanner)
    {
        String Str;
        do
        {
            System.out.println("Enter valid number");
            while(!scanner.hasNext("[A-Za-z]*"))
            {
                System.out.println("Entered string is invalid.Please enter valid String");
                scanner.next();
            }
            Str=scanner.nextLine();
        
    
        }while(Str.equals(""));
        return Str;
    }
    public static int InputValidation(Scanner scanner)
    {
        int num;
        do
        {
            System.out.println("Enter the valid number");
            while(!scanner.hasNext())
            {
                System.out.println("Entered number  is not valid .Please enter valid number");
                scanner.next();
            }
            num=scanner.nextInt();
        }while(num<=0);
        return num;
    }
    
    
}
