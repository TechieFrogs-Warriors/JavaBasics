import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner S= new Scanner(System.in);
        //input validation..
        int n;
        do{
            System.out.println("enter positive number");
            while(!S.hasNextInt())
            {
                String input = S.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=S.nextInt();
          
        }while(n<0);

        int temp,sum=0,r;

        temp=n;//n value is stored to temp
      while(n>0){
          r=n%10;//remainder is taken here
          sum=sum+(r*r*r);//r value is cubed and added to sum
          n=n/10;
      }
      if(temp==sum){
          System.out.println("given number is Amstrong number");

      }
      else{
          System.out.println("given number is not Amstrong number");
      }
        S.close();
    
    }
    
}
