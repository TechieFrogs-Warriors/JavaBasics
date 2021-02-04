package StringAssignmentPrograms2;

import java.util.Scanner;

public class ReplaceSpace12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=scan.nextLine();

        str=str.replace(' ', '*');
        System.out.println("Replace String :"+str);

        scan.close();
    }
}
