import java.util.Scanner;

public class Example3 
{
  public static void main(String[] args) 
  {
      Scanner Scan1=new Scanner(System.in);
      int n;
      do
      {
          System.out.println("Enter Positive Number");
          while(!Scan1.hasNextInt())
          {
              String S = Scan1.next();
              System.out.printf("\"%s\" is not a valid number.please enter a valid number\n"+S);
          }
          n=Scan1.nextInt();
      }while(n<0);
      char ch='A';
      for(int i=0;i<=n;i++)
      {
          for(int j=n;j>i;j--)
          {
              System.out.print((char)(ch)+" ");
          }
          for(int j=0;j<=i;j++)
          {
              System.out.print((char)(ch+i)+" ");
          }
          System.out.println();
      }
    
      Scan1.close();
  }  
}
