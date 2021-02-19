import java.util.Scanner;

import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class Assesmentpgm27 {
    public static void main(String[] args) {
        int k,i,j,s=1;
        System.out.println("enter numberof rows to print : ");
        Scanner sc= new Scanner(System.in);
        k=sc.nextInt();
        s=k-1;
        for(j=1;j<=k;j++){
            for (i=1;i<=s;i++){
                System.out.print(" ");
            }
            s--;
            for(i=1;i<=2*j-1;i++)
            {
                System.out.print("*");
             }
                System.out.print("");
        }
        s=1;
        for(j=1;j<=k-1;j++){
            for(i=1;i<=s;i++){
                System.out.print("");
            }
            s++;
            for(i=1;i<=2*(k-j)-1;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
