package StringAssignmentPrograms2;

import java.util.Scanner;

public class IndividualCharecters23 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        
        String str=scan.nextLine();
        char[] ch=str.toCharArray();
        
        for(int i=0;i<=ch.length;i++){
            System.out.println(str.charAt(i));
        }
        
        scan.close();
    }
    
}
