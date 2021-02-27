package TcsPrograms;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String ParentName= vallidation(scan);
        int SchemeAmount=5000;
        int ParentCommission=0,ChildCommission=0;
        System.out.println("Do you have children?");
        char Children=vallidation1(scan);
        switch(Children){
            //if it yes
            case 'Y': System.out.println("Enter the children name");
                      String Childnames[] = vallidation(scan).split(",");//array of elements seperated by comma
                      System.out.println("Total members "+(Childnames.length+1));//total members
                      System.out.println("Commission Details");
                      ChildCommission=(SchemeAmount*5)/100;//5%  to child
                      ParentCommission= Childnames.length * (SchemeAmount*10)/100;//10%  to parent
                      System.out.println(ParentName+":"+ParentCommission);
                      for(int i=0;i<Childnames.length;i++){
                        System.out.println(Childnames[i]+": "+ChildCommission);
                      }
                      break;
            //if it is no 
            case 'N': System.out.println("Total members:"+"1");
                      System.out.println("Commission Details");
                      ParentCommission=(SchemeAmount*5)/100;
                      System.out.println(ParentName+": "+ParentCommission);
                      break;
        }
        scan.close();
    }
    //stsring vallidation
    public static String vallidation(Scanner scan)
    {
        String str;
        do{
            System.out.println("Enter valid String");
            while(!scan.hasNext("[a-zA-Z,]*")){
                System.out.println("Entered string is invalid.Please enter valid String");
                scan.next();
            }
            str=scan.nextLine();
        }
        while(str.equals(""));
        return str;
    }
    public static char vallidation1(Scanner scan){
        char ch;
        do{
            System.out.println("Enter the valid character");
            while(!scan.hasNext("[a-zA-Z]")){
                System.out.println("Entered number  is not valid .Please enter valid number");
                scan.next();
            }
            ch=scan.next().charAt(0);
        }
        while(ch=='0');
        return ch;
    }
}
