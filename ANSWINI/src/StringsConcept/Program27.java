package StringsConcept;

import java.util.Scanner;

public class Program27 
{
    // Method to print n equal parts of str 
    static void divideString(String str, int n) 
    { 
        int len = str.length(); 
        int part_size; 
      
        // Check if string can be divided in n equal parts  
        if (len % n != 0) 
        { 
            System.out.println("Invalid Input: String size is not divisible by n"); 
            return; 
        } 
      
        // Calculate the size of parts to find the division points 
        part_size = len / n; 
          
        for (int i=0;i<len;i++) 
        { 
            if(i % part_size == 0) 
            {
                System.out.println();//equal length string bit is printed in seperated line
            }
            System.out.print(str.charAt(i)); 
        } 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();

        str=str.replace(" ", "");//removing spaces from the input string
        System.out.println(str);//printing the updated string without spaces

        System.out.println("Into how many parts you want to divide the string ? ");
        int noParts=sc.nextInt();

        //calling the method to divide string
        divideString(str,noParts); 
        sc.close();
    } 

}
