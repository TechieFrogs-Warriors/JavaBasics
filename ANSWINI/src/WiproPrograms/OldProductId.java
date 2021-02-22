package WiproPrograms;

import java.util.Arrays;
import java.util.Scanner;

//program to find smallest product id from old batch id
public class OldProductId 
{
    public static void main(String[] args) 
    {
        //Taking user input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter old batch id");
        int idNum=sc.nextInt(); 
        
        //finding given number length
        int digit = 0;
        int temp=idNum;//placing the input number into temporary variable
        while ( temp > 0)
        { 
            digit++; 
            temp /= 10; 
        } 
       //giving length of digit as array size
        int id[]=new int[digit];
        for(int i=0;i<id.length;i++) 
        {
            id[i]=idNum % 10;
            idNum = idNum / 10;
        
        }
    
        // To find smallest old product id from a batch
        Arrays.sort(id);
        
        System.out.println("oldest product id in the batch is: "+id[0]);
        sc.close();
        
    }
    
}
