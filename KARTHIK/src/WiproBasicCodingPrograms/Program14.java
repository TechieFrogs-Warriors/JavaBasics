package WiproBasicCodingPrograms;

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declarations
        System.out.println("Enter number String");
        String str = vallidation(scan);
        //length of the string 
        int len = str.length();

        // find sum of subsets of a string
        int sum = 0;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                sum = sum + Integer.parseInt(str.substring(i,j+1));
            }
        }
        System.out.println(sum);
    }
    //string vallidation
    public static String vallidation(Scanner scan){
        String str;
        do{
            while(!scan.hasNext("[0-9]*")){
                System.out.println("Enter string only: ");
                scan.next();
            }
            str = scan.nextLine();
        }
        while(str.equals(" "));
        return str;
    }
}
