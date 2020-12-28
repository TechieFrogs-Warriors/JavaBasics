import java.util.*;

public class Switch {
    public static void main(String[] args) {
        System.out.println("----------Switch case condition-----------");
        Scanner obj = new Scanner(System.in);
        String ch;
        System.out.println("Enter Yor party name to vote: ");
        ch = obj.nextLine();

        switch (ch) {
            case "abc party":
                System.out.println("you voted abc party");

                break;
            case "xyz party":
                System.out.println(" you voted xyz party");
                break;

            case "ijk party":
                System.out.println(" you voted ijk party");
                break;
            case "other partys":
                System.out.println("you voted other partys");
                break;

            default:
                System.out.println("your vote is in valid");
                break;
        }
        obj.close();
    }

}
