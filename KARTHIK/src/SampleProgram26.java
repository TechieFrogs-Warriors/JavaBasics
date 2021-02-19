import java.util.Scanner;

public class SampleProgram26 {
    public static void main(String[] args) {
        //Print Pascal's triangle
        Scanner scan=new Scanner(System.in);
        int Number;
        do{
            System.out.println("Enter Integer Value:");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Value:");
                scan.next();

            }
            Number=scan.nextInt();
        }
        while(Number<=0);
        int  a,b,d,e=1;
      for( a = 0; a < Number; a++) {
        for( b = 1; b < Number - a; b++) {
        System.out.print(" ");
      }

      for(d=0;d<=a;d++) {
        if (d==0 || a==0)
          e = 1;
        else
          e=e*(a-d+ 1)/d;

        System.out.print(" "+e);
      }

      System.out.println();
    }
  } 
    
}
