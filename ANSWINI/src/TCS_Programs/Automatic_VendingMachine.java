package TCS_Programs;

import java.util.Scanner;

//Program for automatic vending machine
public class Automatic_VendingMachine 
{
    public static void main(String[] args) 
    {
        //Reading user input
        Scanner sc = new Scanner(System.in);
        char menu = sc.next().charAt(0);
        int subMenu = sc.nextInt();
        //Main switch case for menu
        switch(menu)
        {

            case 'c' : //Nested switch case for submenu
                        switch(subMenu)
                        {
                            case 1 : System.out.println("Welcome to CCD\nEnjoy your Expresso Coffee");break;
                            case 2 : System.out.println("Welcome to CCD\nEnjoy your Cappuccino Coffee");break;
                            case 3 : System.out.println("Welcome to CCD\nEnjoy your Latte Coffee");break;
                            default : System.out.println("Invalid Input");break;
                            
                        }

            case 't' : //Nested switch case for submenu
                        switch(subMenu)
                        {
                            case 1 : System.out.println("Welcome to CCD\nEnjoy your Plain Tea");break;
                            case 2 : System.out.println("Welcome to CCD\nEnjoy your Assam Tea");break;
                            case 3 : System.out.println("Welcome to CCD\nEnjoy your Ginger Tea");break;
                            case 4 : System.out.println("Welcome to CCD\nEnjoy your Cardomom Tea");break;
                            case 5 : System.out.println("Welcome to CCD\nEnjoy your Masala Tea");break;
                            case 6 : System.out.println("Welcome to CCD\nEnjoy your Lemon Tea");break;
                            case 7 : System.out.println("Welcome to CCD\nEnjoy your Green Tea");break;
                            case 8 : System.out.println("Welcome to CCD\nEnjoy your Organic Darjeeling Tea");break;
                            default : System.out.println("Invalid Input");break;
                            
                        }

            case 's' : //Nested switch case for submenu
                        switch(subMenu)
                        {
                            case 1 : System.out.println("Welcome to CCD\nEnjoy your Hot and Sour Soup");break;
                            case 2 : System.out.println("Welcome to CCD\nEnjoy your Veg Corn Soup");break;
                            case 3 : System.out.println("Welcome to CCD\nEnjoy your Tomato soup");break;
                            case 4 : System.out.println("Welcome to CCD\nEnjoy your Spicy Tomato soup");break;
                            default : System.out.println("Invalid Input");break;
                            
                        }

            case 'b' : //Nested switch case for submenu
                        switch(subMenu)
                        {
                            case 1 : System.out.println("Welcome to CCD\nEnjoy your Hot Choclate Drink");break;
                            case 2 : System.out.println("Welcome to CCD\nEnjoy your Badam Drink");break;
                            case 3 : System.out.println("Welcome to CCD\nEnjoy your Badam-Pista Drink");break;
                            default : System.out.println("Invalid Input");break;
                            
                        }
        }
        sc.close();
        
    }
    
}
