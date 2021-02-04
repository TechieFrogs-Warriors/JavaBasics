public class ArraysPrg48 
{
    public static void main(String[] args) 
    {
       int a[]={20,30,40,50,70};
       int b=70,c=0;
       for(int i=0;i<a.length;i++)
       {
           if(a[i]==b)//checks each element with given value
           {
             c=1;
           }
       }
       if(c==1)//checks whether the Array contains the value
       {
           System.out.println("Array contains the given value");

       }
       else
       {
           System.out.println("Array does not contains the given value");
       }
        
    }
    
}
