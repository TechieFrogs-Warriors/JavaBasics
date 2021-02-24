package WiproPrograms;

import java.util.*;

public class Program2 {
    public static int numberOfProducts;

    // public static int price;
    public static int inputValidation(Scanner sc) {
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            numberOfProducts = sc.nextInt();
        } while (numberOfProducts <= 0);

        return numberOfProducts;
    }

    // method for the cubeic numbers
    public static int perfectCube(int tp) {
        int perfectCube = (int) Math.floor(Math.cbrt(tp)) + 1;// to find the next cube root
        int pc = perfectCube * perfectCube * perfectCube;
        if (tp == pc) {
            System.out.println("yes");// if cube root it prints yes
            return pc;
        } else {
            perfectCube = (int) Math.floor(Math.cbrt(tp)) + 1;// to find the next cube root
            pc = perfectCube * perfectCube * perfectCube;

        }

        // System.out.println(pc);
        return pc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr number of products puechased :: ");
        numberOfProducts = inputValidation(sc);
        System.out.println("Enetr the Price of iteams ::");
        int[] price = new int[numberOfProducts];
        for (int i = 0; i < numberOfProducts; i++) {
            price[i] = sc.nextInt();
        }

        int totalPrice1 = 0;
        System.out.println("Total price of products :: ");
        for (int i = 0; i < price.length; i++) {
            totalPrice1 += price[i];
        }

        System.out.print(totalPrice1);

        int totalPrice = totalPrice1;

        int pc = perfectCube(totalPrice);// goes to perfectCube method
        if (totalPrice == pc) {// if the total is eqaul to perfect cube then prints yes
            System.out.println("Yes");
        } else {// if not equal then gives the how much numner to rech the perfect cube
            int requiredAmount = pc - totalPrice;
            System.out.println("\n required money to add to get Gift hamper is :: " + requiredAmount);
        }

    }

}
