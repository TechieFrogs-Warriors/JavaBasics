package WiproPrograms.WiproAdvanced;

import java.util.*;

public class Program2 {
    public static int inputValidation(Scanner sc) {
        int number;
        do {
            System.out.println("enter  Postive Number: ");
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

        // intilizing size of array
        System.out.println("Enter size of array :: ");
        int size = inputValidation(sc);// validating the input

        // intikizing the array
        System.out.println("Enter elemnts in the array ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inputValidation(sc);// validating th einput
        }

        // sort the array
        Arrays.sort(arr);
        // code for printing aternative number min and max in array

        // creating a new array to hold the mofifed elents
        int temp[] = arr.clone();

        // assiging the samll and large vallues
        int small = 0, large = size - 1;

        // intilizing the flag to true
        boolean flag = true;

        for (int i = 0; i < size; i++) {
            if (flag)// if flag is true
            {
                arr[i] = temp[large];
                large--;
            } else// if flage is false
            {
                arr[i] = temp[small];
                small++;
            }
            flag = !flag;// every time number stored then the flag value is changed
        }

        //displaying the modifed array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
