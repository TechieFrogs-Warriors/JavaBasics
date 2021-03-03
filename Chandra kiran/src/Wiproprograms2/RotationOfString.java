package Wiproprograms2;

import java.util.Scanner;

public class RotationOfString 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String a=InputValidation(scanner);
        String b=InputValidation(scanner);
        int result =isRotated(a,b);//method calling
        System.out.println(result);
        
    }
    public static int isRotated(String a,String b)
    {
        char ch[]=a.toCharArray();
        char ch1[]=b.toCharArray();
        int places=2,count=0;
        for(int i=0;i<places;i++)
        {
            char firstelement=ch[0];
            int j;
            for( j=0;j<ch.length-1;j++)
            {
                ch[j]=ch[j+1];//assigns the next element to ch[j]
            }
            ch[j]=firstelement;//assigns the first element to last of array
            
        }
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==ch1[i])//checks the characters of ch and ch1
            {
                count++;//if equal count will be increamented
            }
            
        }
        if(count==ch.length)//checks if the count is equal to length
        {
            return 1;//if equal returns 1
        }
        else
        {
            return 0;//if not returns 0;
        }
        
        

    }
    public static String InputValidation(Scanner scan)
    {
        String Str;
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNext("[A-Za-z]*"))
            {
                System.out.println("Entered string is invalid.Please enter valid String");
                scan.next();
            }
            Str=scan.nextLine();
        
    
        }while(Str==" ");
        return Str;
    }
    
}
