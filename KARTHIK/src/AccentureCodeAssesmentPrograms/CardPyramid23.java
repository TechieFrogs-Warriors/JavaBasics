package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class CardPyramid23 {
   public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int level;
       //vallidation part
       do{
           System.out.println("Enter Number of levels:");
           while(!scan.hasNextInt()){
               System.out.println("please Enter Integer Value Only:");
               scan.next();
           }
           level=scan.nextInt();
       }
       while(level<=0);
       System.out.println("Number of levels: "+level);

       //required cards
       int cards=level*(3*level+1)/2;
       System.out.println("Number of cards required to form Phyramid is: "+cards);
       scan.close();
   } 
}
