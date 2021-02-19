public class AlphabetOrNot {
    public static void main(String[] args) {

        System.out.println("------ Given input is alphabet or not ------");

        char c = '1';

        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " is an alphabet.");
        } else {
            System.out.println(c + " is not an alphabet.");
        }

    }
}
