package InfosisPrograms;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = vallidation(scan);
        String s[] = str.split("=");//split and store strings 
        String s1 = s[0];//1st string
        String s2 = s[s.length-1];//last string

        int LHS =Integer.parseInt(s1);//string to int
        int RHS = Integer.parseInt(s2);//string to int


        int rem =0 ,sum =0, count =0;
        //find number of pluses
        while(LHS!=0){
            rem = LHS%10;//gives last digit
            sum = sum+rem;//adding numbers
            count++;
            LHS = LHS/10;//remove last digit
            if(RHS==(LHS+sum)){//hear cheak two parts
                System.out.println(count);
                break;
            }
        }

    }
    // string vallidation
    public static String vallidation(Scanner scan){
        String s;
        do{
            System.out.println("Enter string ");
            while(!scan.hasNext("[0-9&=]*")){
                System.out.println("Its not valid string.Enter again");
                scan.next();
            }
            s=scan.nextLine();
        }while(s.equals(""));
        return s;
    }
}
