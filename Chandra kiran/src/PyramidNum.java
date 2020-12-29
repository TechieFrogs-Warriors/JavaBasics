import java.util.Scanner;
public class PyramidNum 
 {
    public static void main(String[] args) 
    {
        Scanner S= new Scanner(System.in);
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!S.hasNextInt())
            {
                String input = S.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=S.nextInt();


        }while(n<0);
        int i,k=0,count=0,count1=0;
       for(i=1;i<=n;++i)
        {
            for(int space=1;space<=(n-i);++space)
            {
                System.out.print(" ");
                ++count;

            }
        
            while(k !=(2*i-1)) 
          {
            if(count<=n-1)
           {
             System.out.print((i+k)+" ");
              ++count;
           }
           else
          {
              ++count1;
              System.out.print((i+k- 2 * count1)+" ");
           }
           ++k;
         }
          count=count1=k=0;
          System.out.println();
        }
        S.close();
     }
 }
     
   