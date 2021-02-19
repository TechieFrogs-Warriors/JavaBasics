package StringAssignmentPrograms2;

import java.util.Scanner;

public class SubsetOfString7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter String: ");
        String str=scan.nextLine();

        int len=str.length();

        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                System.out.print("{ "+str.substring(i, j)+" "+"} ");
            }
        }
        scan.close();
    }
    
}
