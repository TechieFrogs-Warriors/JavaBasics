
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name;
        int id;
        float marks;
        double fee;
        String teacher;
        byte rank;
        Boolean age;
        Long contactnumber;

        System.out.println("Enter Yor Name: ");
        name = obj.nextLine();// taking string as input using nextLine()
        System.out.println("Enter Id: ");
        id = obj.nextInt();// taking integer as input
        System.out.println("Enter Your Total Marks:");
        marks = obj.nextFloat();// taking float as input
        System.out.println("Enter your Fee: ");
        fee = obj.nextDouble();// taking double as input
        System.out.println("Enter you Teacher Name: ");
        teacher = obj.next();// taking input as a sring using next()
        System.out.println("Enter your Rank: ");
        rank = obj.nextByte();// taking input as byte
        System.out.println("enter age to check he is 18 or not: ");
        age = obj.nextBoolean();
        System.out.println("Enter contact number: ");
        contactnumber = obj.nextLong();

        System.out.println("name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Marks: " + marks);
        System.out.println("Fee: " + fee);
        System.out.println("Teacher: " + teacher);
        System.out.println("Rank: " + rank);
        if (age == true) {
            System.out.println("age is above 18 ");
        } else if (age == false) {
            System.out.println("age under 18");

        }
        System.out.println("Contact Number: " + contactnumber);

        obj.close();
    }
}
