package Advanced_Programs;

public class Program8 
{
    //program to remove duplicates ina string when compared to another string
    public static void main(String[] args) 
    {
        //Two strings are taken to compare for duplicates
        String str1 = "the quick brown fox";
        String str2 = "queen";
        System.out.println("The given string is: " + str1);
        System.out.println("The given mask string is: " + str2);
        
        //created an array to store result value
        char[] temp = new char[300];

        for (int i=0;i<str2.length();i++)
        {
            temp[str2.charAt(i)]++;//copying characters of second string to temp array
            
        }
        
        System.out.println("\nThe new string after duplicate removal is: ");
        for (int i=0;i<str1.length();i++) 
        {
            //comparing temp characters to first string characters
            if (temp[str1.charAt(i)] == 0)
            {
                System.out.print(str1.charAt(i));
            }
            
        }
        
    }
    
}
