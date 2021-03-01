package Wiproprograms2;

import java.util.Arrays;
import java.util.Scanner;

public class LexicologicalMaxOccuringCharacter 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String Str=InputValidation(scanner);
        char maxOccuring=getMaxOccuringChar(Str);
        System.out.println(maxOccuring);
    }
    public static char getMaxOccuringChar(String Str)
    {
        
        char characterArray[]=Str.toCharArray();
        int i,j,count=0,max=0,len=0;
        char maxCharacter[]= new char[Str.length()];
        for( i=0;i<characterArray.length;i++)//for loop for first element
        {
            
            for( j=i+1;j<characterArray.length;j++)//for loop for next element
            {
                if(characterArray[i]==characterArray[j])//checks if the repeating elements
                {
                    count++;//if any count will be increamented
                }
                if(count>max)//checks for max and  count value
                {
                    max=count;
                    maxCharacter[len]=characterArray[i];//place the array repeating elements into new array 
                    len++;
                    
                }
            }
        }
        
        char characterarray2[]=new char[len];
        for(i=0;i<characterarray2.length;i++)//for loop for placing repeated elements into another array
        {    
            characterarray2[i]=maxCharacter[i];//placing the reapeated elements into another array
            
        }
        Arrays.sort(characterarray2);//sorting the new array elements
        return characterarray2[0];//return the first element of array
    }
    public static String InputValidation(Scanner scanner)
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
        
    
        }while(Str.equals(" "));
        return Str;
    }
    
}
