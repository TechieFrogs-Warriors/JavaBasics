package ProgramizExamplePrograms;

public class CountNumberOfDigitsInAInteger {
    public static void main(String[] args) {
        int count = 0, number = 2445;

        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("The number of digu=its in a integer is :: " + count);
    }

}
