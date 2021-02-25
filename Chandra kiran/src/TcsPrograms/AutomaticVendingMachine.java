package TcsPrograms;

import java.util.Scanner;


public class AutomaticVendingMachine 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        char Alphabet=InputValidation(scanner);
        int Itemnumber=IntegerInputValidation(scanner);
        switch(Alphabet)
        {
            case 'c' :
            if(Itemnumber==1)
            {
                System.out.println("Expresso Coffe");
                System.out.println("Enjoy your Expresso Coffee!");
            }
            else if(Itemnumber==2)
            {
                System.out.println("Cappuccino Coffe");
                System.out.println("Enjoy your Cappuccino Coffee!");
            }
            else
            {
                System.out.println("Latte Coffe");
                System.out.println("Enjoy your Latte Coffee!");
            }
            break;
            case 't' :
            if(Itemnumber==1)
            {
                System.out.println("Plain Tea");
                System.out.println("Enjoy your Plain Tea!");
            }
            else if(Itemnumber==2)
            {
                System.out.println("Assam Tea");
                System.out.println("Enjoy your Assam Tea!");
            }
            else if(Itemnumber==3)
            {
                System.out.println("Ginger Tea");
                System.out.println("Enjoy your Ginger Tea!");
            }
            if(Itemnumber==4)
            {
                System.out.println("Cardamom Tea");
                System.out.println("Enjoy your Cardamom Tea");
            }
            else if(Itemnumber==5)
            {
                System.out.println("Masala Tea");
                System.out.println("Enjoy your Masala Tea!");
            }
            else if(Itemnumber==6)
            {
                System.out.println("Lemon Tea");
                System.out.println("Enjoy your Lemon Tea!");
            }
            else if(Itemnumber==7)
            {
                System.out.println("Green Tea");
                System.out.println("Enjoy your Green Tea!");
            }
            else 
            {
                System.out.println("Organic Darjeeling Tea");
                System.out.println("Enjoy your Organic Darjeeling Tea!");
            }
            break;
            case 's':
            if(Itemnumber==1)
            {
                System.out.println("Hot and Sour Soup");
                System.out.println("Enjoy your Hot and Sour Soup!");
            }
            else if(Itemnumber==2)
            {
                System.out.println("Veg Corn Soup");
                System.out.println("Enjoy your Veg Corn Soup!");
            }
            else if(Itemnumber==3)
            {
                System.out.println("Tomato Soup");
                System.out.println("Enjoy your Totmato Soup!");
            }
            else
            {
                System.out.println("Spicy Tomato Soup");
                System.out.println("Enjoy your Spicy Tomato Soup!");
            }
            break;
            case 'b':
            if(Itemnumber==1)
            {
                System.out.println("Hot Chocolate Drink");
                System.out.println("Enjoy your Hot Chocolate Drink!");
            }
            else if(Itemnumber==2)
            {
                System.out.println("Badam Drink");
                System.out.println("Enjoy your Badam Drink!");
            }
            else
            {
                System.out.println("Badam-Pista Drink");
                System.out.println("Enjoy your Badam-Pista Drink!");
            }
            break;
            default:System.out.println("Wrong Inuput");
        }
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
    public static int IntegerInputValidation(Scanner scanner)
    {
        int num;
        do
        {
            System.out.println("Enter the valid number");
            while(!scanner.hasNext())
            {
                System.out.println("Entered number  is not valid .Please enter valid number");
                scanner.next();
            }
            num=scanner.nextInt();
        }while(num<=0);
        return num;
    }
    
}
