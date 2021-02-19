package Accenturepgms;

import java.util.Scanner;

public class Ass23 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int level;
        //validation part
        do{
            System.out.println("enter number of levels :");
            while(!scan.hasNextInt()){
                System.out.println("please enter integer value only :");
                scan.next();
            }
            level=scan.nextInt();
        }
        while(level<=0);
        System.out.println("number of levels : " +level);

        //required cards
        int cards=level*(3*level+1)/2;
        System.out.println("number of cards required to form pyramid is :" +cards);
        scan.close();

    }
    
}
