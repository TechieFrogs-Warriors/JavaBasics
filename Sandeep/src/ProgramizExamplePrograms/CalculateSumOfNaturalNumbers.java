package ProgramizExamplePrograms;

public class CalculateSumOfNaturalNumbers {
    public static void main(String[] args) {
        int num = 50, sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of Naturl numbers is :: " + sum);
    }

}
