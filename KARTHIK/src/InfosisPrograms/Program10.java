package InfosisPrograms;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = vallidation(scan);//base of x
        int k = vallidation(scan);//bob number
        String x = vallidation1(scan);//Alices String Number
        System.out.println(divisable_k(y, k, x));

    }
    //method to write divisable by k
    public static int divisable_k(int y, int k,String x){
        int number = Integer.parseInt(x);//converting string to int
        int len = x.length();

        int output = decimal_Converter(len, number, y);//calling method to convert decimal

        if(output%k == 0){//zero it will returns reminder
            return output/k;
        }
        else{//it reverse the number after again convert to decimal
            int rem = 0, rev =0; 
            while(number!=0){
                rem = number % 10;
                rev = (rev *10)+rem;
                number = number/10;
            }
            output = decimal_Converter(len, rev, y);
            if(output%k == 0){
                return output/k;
            }
            else{
                return 0;
            }
        }
    }
    //decimal converter
    public static int decimal_Converter(int len, int number,int y){
        int rem=0,result =0;
        for(int i=0;i<len;i++){
            rem = number%10;// give last digit 
            result = result +(int) (rem*Math.pow(y, i)) ;//multiply respective base^value
            number = number/10;//remove last digit
        }
        return result;
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
        }   
        while(s.equals(""));
        return s;
    }
}
