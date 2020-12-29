import java.util.Scanner;

public class NumberPattern 
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
    int  k = 0, count = 0, count1 = 0;
    for (int i = 1; i <= n; ++i) 
    {
      for (int j = 1; j <= n - i; ++j) 
      {
        System.out.print("  ");
        ++count;
      }
      while (k != 2 * i - 1) 
      {
        if (count <= n - 1) 
        {
          System.out.print((i + k) + " ");
          ++count;
        } else 
          {
            ++count1;
            System.out.print((i + k - 2 * count1) + " ");
          }
          ++k;
      }
      count1 = count = k = 0;
      System.out.println();
    }
    obj.close();
  }
}
    

