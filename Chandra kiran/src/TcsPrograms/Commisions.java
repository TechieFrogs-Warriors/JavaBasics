package TcsPrograms;

import java.util.Scanner;

public class Commisions 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String ParentName=Validation(scanner);
        int SchemeAmount=5000;
        int ParentCommission=0,ChildCommission=0;
        System.out.println("Do you have children?");
        char Children=InputValidation(scanner);
        switch(Children)//checks whether Yes or No
        {
            case 'Y': System.out.println("Enter the children name");
                      String Childnames[] =Validation(scanner).split(",");//array of elements seperated by comma
                      System.out.println("Total members "+(Childnames.length+1));//total members
                      System.out.println("Commission Details");
                      ChildCommission=(SchemeAmount*5)/100;//5% value to child
                      ParentCommission= Childnames.length * (SchemeAmount*10)/100;//10% value to parent
                      System.out.println(ParentName+":"+ParentCommission);
                      for(int i=0;i<Childnames.length;i++)//for loop for printing childNames
                      {
                          System.out.println(Childnames[i]+": "+ChildCommission);
                      }
                      break;
            case 'N': System.out.println("Total members:"+"1");
                      System.out.println("Commission Details");
                      ParentCommission=(SchemeAmount*5)/100;
                      System.out.println(ParentName+": "+ParentCommission);
                      break;
        }
        scanner.close();
    }
    public static String Validation(Scanner scanner)
    {
        String Str;
        do
        {
            System.out.println("Enter valid String");
            while(!scanner.hasNext("[a-zA-Z,]*"))
            {
                System.out.println("Entered string is invalid.Please enter valid String");
                scanner.next();
            }
            Str=scanner.nextLine();
        
    
        }while(Str.equals(""));
        return Str;
    }
    public static char InputValidation(Scanner scanner)
    {
        char ch;
        do
        {
            System.out.println("Enter the valid character");
            while(!scanner.hasNext("[a-zA-Z]"))
            {
                System.out.println("Entered number  is not valid .Please enter valid number");
                scanner.next();
            }
            ch=scanner.next().charAt(0);
        }while(ch=='0');
        return ch;
    }
}
