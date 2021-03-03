package JavaPrograms;

import java.util.Scanner;

public class StringwithGaps 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String valid=inputValidation(scanner);
        String result=valid.replaceAll(" ","");//replacing all gaps with no gaps
        int position=result.length()-1;//taking a position to last of the string
        for(int i=0;i<valid.length();i++)//for loop for string 
        {
            if(valid.charAt(i)==' ')//checks if the gaps 
            {
              System.out.print(" ");//prints the gaps
            }
            else
            {
                System.out.print(result.charAt(position));//else it prints the string from the last
                position--;//position value decreaments

            }
        }
        
        
    }
    public static String inputValidation(Scanner scanner)
    {
        String sentence;
        do
        {
            System.out.println("Enter valid String");
            while(!scanner.hasNext("[A-Za-z]*"))
            {
                System.out.println("Entered String is not valid .Please enter valid STring");
                scanner.hasNext();
            }
            sentence=scanner.nextLine();
        }while(sentence.equals(" "));
        return sentence;
    }
    
}


