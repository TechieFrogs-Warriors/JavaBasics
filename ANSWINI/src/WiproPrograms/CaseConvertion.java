package WiproPrograms;
//import WiproPrograms.StringValidation;

import java.util.Scanner;

//program to convert uppercase to lowercase and viceversa of a password
public class CaseConvertion 
{
    //Method implementing the logic
    static void convertOpposite(StringBuffer str) 
    { 
        for (int i=0; i<str.length(); i++) 
        { 
            //taking every character of the string individually into 'c'
            Character c = str.charAt(i); 
            if (Character.isLowerCase(c))
            {
                str.replace(i, i+1, Character.toUpperCase(c)+"");//start,end,withwhat
            } 
            else
            {
                str.replace(i, i+1, Character.toLowerCase(c)+"");
            }
        } 
        System.out.println(str); 
    } 
    public static void main(String[] args) 
    {
        //Reading input from user
        Scanner sc=new Scanner(System.in);
        //creating String validation class(which is within the package) object 
        StringValidation obj= new StringValidation();

        
        System.out.println("ENTER YOUR PASSWORD");
        //input validation from string validation class
        StringBuffer str = new StringBuffer(obj.validation(sc)); 
        
        //calling the method that performs logic
        convertOpposite(str);
        sc.close();
        
    }
}
