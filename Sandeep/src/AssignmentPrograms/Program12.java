package AssignmentPrograms;

import java.util.*;

public class Program12 {
    public static void Spiralmatrix(int size) {
        int arr[][] = new int[size][size];
        int boundary = size - 1;
        int sizeleft = size - 1;
        int flag = 1, i;
        // char r, l, u, d;
        int row = 0, col = 0;
        // default first it movies to right
        char move = 'r';

        for (i = 1; i <= (size * size); i++) {
            arr[row][col] = i;// asigning the value in the matrix colum
            // switch case to detrmine the next index
            switch (move) {
                // if right goest right with incrementing th coul
                case 'r':
                    col = col + 1;
                    break;
                // if down goes to down side with increment in the rowm in the specified colum
                case 'd':
                    row = row + 1;
                    break;
                case 'l':
                    // if left moves left with decremnt of each col in a row
                    col = col - 1;
                    break;
                // if up moues up with the decrement of each row in a specifed col
                case 'u':
                    row = row - 1;
                    break;
                // other than this aboues simpley it prints the default
                default:
                    System.out.println("default");
            }
            // check if array elemnt reached the boundry array
            if (i == boundary) {
                System.out.println(boundary);
                // add tge size left to the boundry
                boundary = boundary + sizeleft;
                // if the two iterations are done decrease the size left by 1
                if (flag != 2) {
                    flag = 2;
                } else {
                    flag = 1;
                    sizeleft = sizeleft - 1;
                }
                // switch case to rotate the directions after reaching boundary value
                switch (move) {
                    // if right it rotates down side
                    case 'r':
                        move = 'd';
                        break;
                    // if down it rotates left side
                    case 'd':
                        move = 'l';
                        break;
                    // if left side it rotates up side
                    case 'l':
                        move = 'u';
                        break;
                    // if up side it rotates right side
                    case 'u':
                        move = 'r';
                        break;
                    // if the above cases fails default thing excutes
                    default:
                        System.out.println("default");
                }
            }
        }
        // for printing the matrix
        for (i = 0; i < size; i++) {// for rows
            for (int j = 0; j < size; j++) {// for colums
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        // input validation for the size
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            size = sc.nextInt();
        } while (size <= 0);
        System.out.println("its a Number: " + size);

        // calling the static method
        Spiralmatrix(size);
        sc.close();

    }

}
