public class AdvArray3 
{
    public static void main(String[] args) 
    {
        String a[]={"my ","name", "is", "chandra","kiran"};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                          String  temp = a[i];
                            a[i]=a[j];
                             a[j]=temp;

                }
            }
            System.out.println(a[i]);
        }

    }
    
}
