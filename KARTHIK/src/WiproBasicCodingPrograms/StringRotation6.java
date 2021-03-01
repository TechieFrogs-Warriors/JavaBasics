package WiproBasicCodingPrograms;

import java.util.Scanner;

public class StringRotation6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //string as input
        System.out.println("Enter String a: ");
        String a = vallidation(scan);
        System.out.println("Enter String b:");
        String b = vallidation(scan);
        System.out.println("Enter number of rotations: ");
        int numberOfRotations = vallidation1(scan);
        char a_Array[] = a.toCharArray();//String to array
        char b_Array[] = b.toCharArray();
        //rotation logic
        int i=0;
        while(numberOfRotations>0){
            char temp = a_Array[0];
            for( i=0;i<a_Array.length-1;i++){//anti clockwise rotation
                a_Array[i]=a_Array[i+1];
            }
            a_Array[i]=temp;
            numberOfRotations --;
        }
        //compare both the strings
        int count =0;
        for(int k=0;k<a_Array.length;k++){
            if(b_Array[i]==a_Array[i]){
                count++;
            }
        }
        if(count == a_Array.length){
            System.out.println("1");
        }
        else
        System.out.println("0");
    }
    //string vallidation
    public static String vallidation(Scanner scan){
        String str;
        do{
            while(!scan.hasNext("[a-zA-Z]*")){
                System.out.println("Enter string only: ");
                scan.next();
            }
            str = scan.nextLine();
        }
        while(str.equals(" "));
        return str;
    }
    //int vallidation
    public static int vallidation1(Scanner scan){
        int number;
        do{
            while(!scan.hasNextInt()){
                System.out.println("Enter positive Integer  value only: ");
                scan.next();
            }
            number = scan.nextInt();
        }
        while(number<0);
        return number;
    }
}
