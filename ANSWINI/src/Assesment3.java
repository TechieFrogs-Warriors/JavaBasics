import java.util.Arrays;
import java.util.Scanner;

public class Assesment3 
{
   void display()
   {
       //taking user input
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first string");
        String str1=scan.nextLine();
        System.out.println("enter second string");
        String str2=scan.nextLine();
        //converting to
        str1.toLowerCase();
        str2.toUpperCase();
        if(str1.length()!=str2.length())
        {
            System.out.println("since length of strings are not equal..not anagram");
        }
        else
        {
            //converted to char arrays
            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();

            //sorted arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            //checking whether characters are matching or not
            boolean result=Arrays.equals(arr1, arr2);
            if(result)
            {
                System.out.println("this anagram");
            }
            else
            {
                System.out.println("not anagram");
            }
        }

   }
    public static void main(String[] args) 

    {
        Assesment3 asmnt=new Assesment3();
        asmnt.display();//calling display method
    }
    
}
