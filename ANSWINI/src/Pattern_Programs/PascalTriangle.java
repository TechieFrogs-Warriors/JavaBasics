import java.util.Scanner;

public class PascalTriangle 
{
  public static void main(String[] args) 
  {
    Scanner obj=new Scanner(System.in);
    // INPUT NUMBER VALIDATION
    int n;
    do 
    {
      System.out.println("ENTER YOUR NUMBER");
      while (!obj.hasNextInt()) 
      {
        System.out.println("THIS IS NOT INTEGER VALUE.PLEASE ENTER POSITIVE NUMBER: ");
        obj.next();
      }
      n=obj.nextInt();
    } while (n <= 0);
    System.out.println("YES IT IS POSITIVE NUMBER : " + n);

    //LOGIC
    int temp=1;
    for(int i = 0; i < n; i++) 
    {
      for(int j = 1; j < n - i; j++) 
      {
        System.out.print("  ");
      }
      for(int k = 0; k <= i; k++) 
      {
        if (k == 0 || i == 0)
        temp = 1;
        else
        temp = temp * (i - k + 1) / k;
        System.out.printf("%4d", temp);
      }
      System.out.println();
    }
    obj.close();
  }
}
        
    
    

