package TcsCodingQuestions;

import java.util.*;

public class Program9 {
    // method for integer input validation
    public static int inputValidation(Scanner sc) {
        int number;
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number < 0);

        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Tyoe you wnat :: ");

        char product = (char) sc.next().charAt(0);// for selcting the desire product

        System.out.println("Eneter the product id you wnat :: ");
        int productid = inputValidation(sc);// for selecting the sub option of a product

        switch (product) {

            case 'c':// rlaetd to coffe iteams
                System.out.println("Welcome to CCD ");
                switch (productid) {
                    case 1:
                        System.out.println("Enjoy your Espresso Coffee");

                        break;
                    case 2:
                        System.out.println("Enjoy your Cappuccino Coffee");
                        break;
                    case 3:
                        System.out.println("Enjoy your Latte Coffee");
                        break;

                    default:
                        System.out.println("Invalid Input");
                        break;
                }

                break;

            case 't':// related to tea items
                System.out.println("Welcome to CCD");
                switch (productid) {
                    case 1:
                        System.out.println("Enjoy your Plain Tea");
                        break;
                    case 2:
                        System.out.println("Enjoy your Assam Tea");
                        break;
                    case 3:
                        System.out.println("Enjoy your Ginger Tea");
                        break;
                    case 4:
                        System.out.println("Enjoy your Cardamom Tea ");
                        break;
                    case 5:
                        System.out.println("Enjoy your Masala Tea");
                        break;
                    case 6:
                        System.out.println("Enjoy your Lemon Tea");
                        break;
                    case 7:
                        System.out.println("Enjoy your Green Tea");
                        break;
                    case 8:
                        System.out.println("Enjoy your Organic Darjeeling Tea");
                        break;

                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            case 's':// related to soupds iteams
                System.out.println("Welcome to CCD");
                switch (productid) {
                    case 1:
                        System.out.println("Enjoy your Hot and Sour Soup");

                        break;
                    case 2:
                        System.out.println("Enjoy your Veg Corn Soup");
                        break;
                    case 3:
                        System.out.println("Enjoy your Tamato Soup");
                        break;
                    case 4:
                        System.out.println("Enjoy your Spicy Tamamto Soup");
                        break;

                    default:
                        System.out.println("Invalid input");
                        break;
                }
                break;
            case 'b':// related to brevarage iteams
                System.out.println("Welcome to CCD");
                switch (productid) {
                    case 1:
                        System.out.println("Enjoy your Hot Choclate Drink");

                        break;
                    case 2:
                        System.out.println("Enjoy your Badham Milk");
                        break;
                    case 3:
                        System.out.println("Enjoy your Badham-Pistha milk");
                        break;

                    default:
                        System.out.println("Input Invalid");
                        break;
                }
                break;

            default:
                System.out.println("Input invalid");// if entered input is worng then this condition is excuted
                break;
        }
        sc.close();
    }

}
