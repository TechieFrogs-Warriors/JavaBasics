package Array_Concept;

public class Program38 
{
    //program to convert character to string and string to character
    public static void main(String[] args) 
    {
        //Logic to convert character to string
        // Method 1: Using toString() method
        char ch = 'A';
        String str = Character.toString(ch);
        System.out.println("String is: "+str);
 
        // Method 2: Using valueOf() method
        String str2 = String.valueOf(ch);
        System.out.println("String is: "+str2);


        //Logic to convert String to character
        // Using charAt() method
        String str3 = "Hello";
        for(int i=0; i<str3.length();i++)
        {
            char ch2 = str3.charAt(i);
            System.out.println("Character at "+i+" Position: "+ch2);
        } 
        
    }
    
}
