package TCS_Programs;

import java.util.Scanner;

//Program to encrypt a string as per key given
public class CaeserCypher_Encryption 
{
    //String validation
    public static String stringValidation(Scanner sc)
    {
       
        String s;
        do
        {
            System.out.println("Enter string with alphabets");
            while(!sc.hasNext("[a-zA-Z]*"))
            {
                System.out.println("Its not valid string.Enter again");
                sc.next();
            }
            s=sc.nextLine();

        }while(s.equals(""));
        return s;
    }
    //Integer validation
    public static int integerValidation(Scanner sc)
    {
        int number;
        do
        {
            System.out.println("Enter your number");
            while(!sc.hasNextInt())
            {
                System.out.println("please enter a positive or valid integer");
                sc.next();
            }
            number = sc.nextInt();

        }while(number<0);
        return number;
    }

    //Method that performs logic
    public static String CustomCaesarCipher(int key, String message)
    {
        //converting string into char array
        char[] charArray =message.toCharArray();
        
        //using the key encrypting each character 
        for(int i=0;i<charArray.length;i++)
        {
            charArray[i] = (char)(charArray[i] + key);
        }

        //converting char array to string again
        String encryptArray = new String(charArray);
        return encryptArray;
        
    }

    public static void main(String[] args) 
    {
        //Reading user input and validating it
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your string");
        String originalText = stringValidation(sc);
        originalText = originalText.replace(" ","");

        System.out.println("Enter the key to encrypt");
        int key = integerValidation(sc);

        //calling method that performs logic
        String encryptString = CustomCaesarCipher(key, originalText) ;
        System.out.println(encryptString);
        sc.close();
    }
}
