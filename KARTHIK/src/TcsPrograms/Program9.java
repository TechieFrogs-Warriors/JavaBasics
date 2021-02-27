package TcsPrograms;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice 't''c''b''s' only:");
        char choice=vallidation(scan);
        System.out.println("Enter sub choice:");
        char s_Choice =vallidation(scan);

        switch(choice){
            case 'c':{
                switch(s_Choice){
                    //System.out.println("Welcome to CCD!");
                    case '1':{
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Expresso Coffee!");
                        break;
                    }
                    case '2':{
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Cappuccino Coffee!");
                        break;
                    }
                    case '3':{
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Latte Coffee!");
                        break;
                    }
                }
                break;
            }
            case 't':{
                switch(s_Choice){

                    case '1':{
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your plain Tea!");
                        break;
                    }
                    case '2':{ 
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Assam Tea!");
                        break;
                    }
                    case '3':{
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Glinger Tea!");
                        break;
                    }
                    case '4':{
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Cardamom Tea!");
                        break;}
                    case '5':{ 
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Masala Tea!");
                        break;
                    }
                    case '6':{
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Leamon Tea!");
                        break;
                    }
                    case '7':{
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Green Tea!");
                        break;
                    }
                    case '8':{ 
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Organic Darjeeling Tea!");
                        break;
                    }  
                }
                break;
            }
            case 's': {
                switch(s_Choice){
                    case '1':{
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Hot and Sour Soup!");
                        break;
                    }
                    case '2':{ 
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Veg Corn Soup!");
                        break;
                    }
                    case '3':{
                        System.out.println("Welcome to CCD!");
                        System.out.print("Enjoy your Tomato Soup!");
                        break;
                    }
                }
                break;
            }
            case 'b': {
                switch(s_Choice){
                    case '1':{
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Hot Chocolate Drink!");
                        break;
                    }
                    case '2':{ 
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Badam Drink!");
                        break;
                    }
                    
                    case '3':{
                        System.out.println("Welcome to CCD!");
                        System.out.println("Enjoy your Badman-Pista Drink!");
                        break;
                    }
                }
                break;
            }
        default:
        System.out.println("Invalid choice.");
        }
    }
    public static char vallidation(Scanner scan){
        char ch;
        do{
            System.out.println("Enter your choice: ");
            while(!scan.hasNext("[a-zA-Z1-9]")){
                System.out.println("Enter charecter value only.");
                scan.next();
            }
            ch=scan.next().charAt(0);
        }
        while(ch<0);
        return ch;
    }
}
