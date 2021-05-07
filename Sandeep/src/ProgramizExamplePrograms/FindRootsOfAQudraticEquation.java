package ProgramizExamplePrograms;

public class FindRootsOfAQudraticEquation {
    public static void main(String[] args) {

        double a = 2.3, b = 4, c = 5.6;// intilizingthe a , b, c variables
        double root1, root2;

        // calculating the determent(b*b-4ac)
        double determiant = b * b - 4 * a * c;

        // checking if determent is gretaer than 0
        if (determiant > 0) {
            // then these two are real and distent roots
            root1 = (-b + Math.sqrt(determiant)) / (2 * a);
            root2 = (-b - Math.sqrt(determiant)) / (2 * a);

            System.out.println("Root1 :: " + root1 + "\nRoot2 :: " + root2);
        }
        // checking id determent is eqal to 0
        else if (determiant == 0) {
            // two roots are equal to 0 then -b+0==-b
            root1 = root2 = -b / (2 * a);

            System.out.println("\nRoot1 = root2 = " + root1);

        }
        // if determent is less then zero
        else {
            // roots are complex numbers and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determiant) / (2 * a);

            System.out.println("\nRoot1 :: " + (real + imaginary));
            System.out.println("Root2 :: " + (real - imaginary));
        }
    }
}
