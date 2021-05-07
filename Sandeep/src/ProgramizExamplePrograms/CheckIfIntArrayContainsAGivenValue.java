package ProgramizExamplePrograms;

public class CheckIfIntArrayContainsAGivenValue {
    public static void main(String[] args) {
        int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int find = 5;
        boolean found = false;

        for (int n : number) {
            if (n == find) {
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println("Number was found");
        } else {
            System.out.println("Number was not found");
        }
    }
}
