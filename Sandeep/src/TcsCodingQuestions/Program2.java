package TcsCodingQuestions;

import java.util.*;

public class Program2 {
    // method for integer input validation
    public static int inputValidation(Scanner sc) {
        int number;
        do {
            // System.out.println("enter Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);

        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :: ");
        int rows = inputValidation(sc);

        System.out.println("Enetr the number of colums ::");
        int colums = inputValidation(sc);

        int trainee[][] = new int[rows][colums];// for storring the oxygen leves lap wise of trainees
        int averageOxygenValue[] = new int[rows];// for storing the average oxygen level of trinees
        int maximumOxygenLevel = 0;

        // for inilizing the input values
        System.out.println("Enetr the oxygen levels of trainess lap wise");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                trainee[i][j] = inputValidation(sc);
                if (trainee[i][j] < 1 || trainee[i][i] > 100) {// if vales are not between 1 and 100
                    System.out.println("Oxygen level values should not be less than 0 and greater than 100");
                }
            }
        }

        // for calculating the average and checking the values are in between 01 and 100
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {

                averageOxygenValue[i] += trainee[i][j];// adds the oxygen levels

            }
            averageOxygenValue[i] /= 3;// finds the average value of added oxygen level
        }
        for (int i = 0; i < rows; i++) {// finds the maximum vlue of the oxygen level
            if (averageOxygenValue[i] > maximumOxygenLevel) {
                maximumOxygenLevel = averageOxygenValue[i];
            }
        }
        for (int i = 0; i < rows; i++) {// comapre the oxygen maximum oxygen level value and finds the trinees
            if (averageOxygenValue[i] == maximumOxygenLevel) {
                System.out.println("Trainee Number" + (i + 1));
            }
            if (averageOxygenValue[i] < 70) {// if the oxygen level is less than 70 ten prints message unfit
                System.out.println("Trainee is unfit");
            }
        }

    }

}
