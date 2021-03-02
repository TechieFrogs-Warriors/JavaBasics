package TcsCodingQuestions;

import java.util.*;

public class Program6 {
    // validation method for the string input
    public static String inputValidationS(Scanner sc) {
        String name;
        do {
            // System.out.println("Enetr String: ");
            while (!sc.hasNext("[A-Za-z,]*")) {
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            name = sc.nextLine();
        } while (name.equals(""));
        return name;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Source Station :: ");
        String source = inputValidationS(sc);

        System.out.println("Enter Destination station :: ");
        String destination = inputValidationS(sc);

        int startpoint = 0, endPoint = 0;

        float fare = 0f;

        int[] path = new int[] { 800, 600, 750, 900, 1400, 1200, 1100, 1500 };

        String busStop[] = new String[] { "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" };

        for (int i = 0; i < busStop.length; i++) {
            if (busStop[i].equals(source))
                startpoint = i;// asigining index value to start point

            if (busStop[i].equals(destination))
                endPoint = i;// assigning index value to end point

        }

        if (startpoint == endPoint) {// if startpoint and end pint are then then input is in valid
            System.out.println("Invalid Input");
        } else {// if the startpoint and end point are noy equal
            for (int j = startpoint + 1; j <= busStop.length; j++) {

                j = j % busStop.length;// to start the index value from the first after ending the array point

                fare += (path[j] * 0.005);// 1000m=5 so 1m=0.005

                if (busStop[j].equals(destination)) {// if its travalled till the destination then it breaks

                    System.out.println(Math.ceil(fare) + "INR");
                    break;
                }

            }
        }
        sc.close();

    }

}
