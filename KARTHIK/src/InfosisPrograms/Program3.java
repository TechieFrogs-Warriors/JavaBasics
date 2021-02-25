package InfosisPrograms;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter digits of the number");
        int a = vallidation(scan);
        String b = vallidation1(scan);
        
        System.out.println(tor(a,b));

    }
    //tor method
    public static String tor(int a,String b){
        int number =Integer.parseInt(b);// integer to string
        int temp=number;
        int remainder = 0 ; 
        String s =""; 
            
        //Logic
        while(temp != 0)
        {
            remainder = temp % 3 ; //getting remainder
            s = s.concat(Integer.toString(remainder)); //converting from integer and placing remainder in string
            temp = temp/3 ; //getting quotient

        }
        String str1="",str2="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch = s.charAt(i);
            str1 = str1 + ch;
        }

        //Extracting the required digits based on length given in input
        for(int i=str1.length()-a;i<=str1.length()-1;i++)
        {
            char ch = str1.charAt(i);
            str2 = str2 + ch;
        }
        
        return str2; //returning output
    }
    //int vallidation
    public static int vallidation(Scanner scan){
        int number;
        do{
            System.out.println("Enter positive integer: ");
            while(!scan.hasNextInt()){
                System.out.println("Enter Integer  value only: ");
                scan.next();
            }
            number = scan.nextInt();
        }
        while(number<0);
        return number;
    }
    // string vallidation
    public static String vallidation1(Scanner scan){
        String s;
        do{
            System.out.println("Enter string ");
            while(!scan.hasNext("[0-9]*")){
                System.out.println("Its not valid string.Enter again");
                scan.next();
            }
            s=scan.nextLine();
        }while(s.equals(""));
        return s;
    }
}
