import java.util.*;
public class Inputscanner {
    public static void main(String[] args) {
        //string scaner
        
        Scanner scan2=new Scanner(System.in);
        System.out.println("enter string: ");
        String z =scan2.nextLine();
        String y =scan2.nextLine();
        if (z.equals(y)){
            System.out.println("karthik");
        }
            else {
            System.out.println("not karthik");
            }
            

        System.out.println("eneter p and s values:");
        Scanner scan=new Scanner(System.in);
        int p,s;
       p=scan.nextInt();
        s=scan.nextInt();
        scan.close();
        scan2.close();
        for(int a=p;a<=5;a++){
          for(int b=s;b<=a;b++){
             System.out.print(a +" " +b);
           }
          System.out.println();
        }

        
        }



    


        
    }
    

