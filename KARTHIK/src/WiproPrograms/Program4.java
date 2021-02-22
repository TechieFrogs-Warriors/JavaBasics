package WiproPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int id=vallidation(scan);
        //convert int to string
        String str=Integer.toString(id);
        //convert char array
        char ch[]=str.toCharArray();
        //sort the char arry
        Arrays.sort(ch);
        //print the element
        System.out.println(ch[0]);
    }
    //vallidation part
    public static int vallidation(Scanner scan){
        int id;
        do{
            System.out.println("Enter Integer Id: ");
            while(!scan.hasNextInt()){
                System.out.println("Enter integer value Only: ");
                scan.next();
            }
        id=scan.nextInt();
        }
        while(id<=0);
        return id;
    }
}
