import java.util.*;

public class Switchprogram {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String ch;
        System.out.println("Enter Yor choice: ");
        ch = obj.nextLine();

        switch (ch) {
            case "body Fitness":

                Scanner obj1 = new Scanner(System.in);
                System.out.println("Enter Yor weight: ");
                int weight;
                weight = obj1.nextInt();

                if (weight <= 60) {

                    System.out.println("he is fit");
                } else if (weight > 60 && weight <= 70) {

                    System.out.println("he / she is ok but need sone trainging in the weight loss");

                } else if (weight > 70 && weight <= 80) {

                    System.out.println("he is not up to mark in fitness and need to traineed and motivated");

                } else {

                    System.out.println("he is having over weight");
                }
                break;
            case "yoga":

                System.out.println("yoga trainning");
                break;

            default:

                System.out.println("other reqirements");
                break;

        }
        obj.close();
    }

}
