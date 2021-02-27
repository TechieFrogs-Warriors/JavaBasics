package TCS_Programs;

import java.util.Scanner;

//how much commision each member of family gets for fixed amount of 5000rs
public class SchemeComission 
{
    //String validation
    public static String stringValidation(Scanner sc)
    {
       
        String s;
        do
        {
            System.out.println("Enter string with alphabets");
            while(!sc.hasNext("[a-zA-Z,]*"))
            {
                System.out.println("Its not valid string.Enter again");
                sc.next();
            }
            s=sc.nextLine();

        }while(s.equals(""));
        return s;
    }
    public static void main(String[] args) 
    {
        //Reading input from user and validating them
        Scanner sc = new Scanner(System.in);
        String parentName=stringValidation(sc);

        int amount = 5000;//fixed amount given in question
        int parentCommission=0 , childCommission=0 ;//variable to store parent commission
        System.out.println("Do you have child?");
        char haveChild =sc.next().charAt(0) ;//asking user has child or not..'Y' or 'N'

        //control enters switch case if parent has child
        switch(haveChild)
        {
            //if parent has children
            case 'Y'   :  
                            System.out.println("Enter child names");//Asking the names of children
                            //taking childnames into array by splitting names with ','
                            String[] childName = stringValidation(sc).split(",");
                            
                            //total members is one parent(fixed)+number of childnames(length)
                            System.out.println("Total members: "+(childName.length+1));

                            //calculating commission for parent and children
                            System.out.println("commission Details");
                            childCommission = (amount * 5)/100;
                            parentCommission = childName.length * (amount * 10)/100;
                            System.out.println(parentName+": "+parentCommission+" INR");
                            
                            //printing child names with their commission details
                            for(int i=0;i<childName.length;i++)
                            {
                                System.out.println(childName[i]+": "+childCommission+" INR");
                            }
                            break;

            //if parent has no children               
            case 'N'   :    
                            System.out.println("Total members: "+"1");
                            System.out.println("commission Details");
                            parentCommission = (amount*5)/100;
                            System.out.println(parentName+": "+parentCommission+" INR");
                            break;
        }

        sc.close();

    }  
}
