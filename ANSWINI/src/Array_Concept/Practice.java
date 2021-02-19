package Array_Concept;
import java.util.Arrays;

public class Practice 
{
    
    //Any access modifier can be given for array
   // protected static String b[] = new String[5];

    //throwing error
     /* int b[];
     b=new int[5]; */
     
 

    //passing arrays to methods
    public static void printArray(double[] list) 
    {
        for (int i = 0; i < list.length; i++) 
        {
            System.out.print(list[i] + " ");
        }
        int b[];
        b=new int[5];
    }
    
    public static void main(String[] args) 
    {
        //different types of array declarations,initializations and instantiation

        int[] a;//declaring array of integer type by name 'a'
        a=new int[5];//allocating memory to array 'a' with some size 
        System.out.println(a);

        //Declaring array literal
        int[] c={1,2,3,4,5,6,7,8,9,10};
        System.out.println(c);
        c=new int[5];
        for(int i=0;i<c.length;i++)
        System.out.println(c[i]);

        char d[]={'a','b','c','d','e'};
        System.out.println(d);//prints abcde
        for(int i=0;i<d.length;i++)
        System.out.print(d[i]+" ");//prints a b c d e

        String st[]={"acv","hgdh"};
        System.out.println(st);

        //printing all the elements of the array
        double []list={1.2,2.5,1.4,3.7,8.5};
        for(int i=0;i<list.length;i++)
        {
            System.out.print(list[i]+" ");//prints all values of list[]
        }
        //if given this code along with above...nothing is executed..why?
        list=new double[2];
        list[0]=2;
        list[1]=3;
        System.out.println("length of list"+list.length);
       // list[2]=4;//throws out of bound exception
        for(int i=0;i<list.length;i++)
        {
            System.out.print(list[i]+" ");
        } 

       // String st[]=new int[5];//cannot instantiate with different datatypes
       //String st[];System.out.println(st);//array have to be initialised otherwise error when you use it


       //for each loop
       int z[]=new int[]{9,8,7,6,5};
       for(int i:z)
       {
        System.out.println(i);
       }

        

        //Array of an object can be created as follows
        Practice ar[]=new Practice[5];//'practice' is user defined class
        System.out.println(ar); 

        //Arrays index out of bound exception case
        /* int[] arr = new int[2]; 
        arr[0] = 10; 
        arr[1] = 20; 
  
        for (int i = 0; i <= arr.length; i++) 
        System.out.println(arr[i]); */

        //calling method to which array is passed as parameter
        printArray(list);

        //takes negative values in array but not size
        int k[]=new int[]{-1,-2,3,4,5};
        for(int i=0;i<k.length;i++)
        System.out.println(k[i]);

        //size of small array is increased implicitly
        int n[]=new int[10];
        int m[]=new int[100];
        n=m;
        System.out.println(n.length);
        m=n;
        System.out.println(m.length);

        int b[];
        b=new int[5];

        
    
        
    }
    


    
}
