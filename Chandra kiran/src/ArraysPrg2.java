public class ArraysPrg2 
{
    public static void main(String[] args) 
    {
        //char a[] ={'c','h','a','n','d','r','a','k','i','r','a','n'};
        int a[]={1,2,3,3,3,5,4,4,6};
        int f[]=new int[a.length];
        int c=-1;
    
        for(int i=0;i<a.length;i++)
        {
            int b=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    b++;
                    f[j]=c;
                    

                }
            }
            if(f[i]!=c)
           {
               f[i]=b;
            }
            
        }
        for(int i=0;i<f.length;i++)
        {
            if(f[i]!=c)
            {
                System.out.println(a[i]+"-"+f[i]);
            }
        }

        
        
            
            
        
        
    }
    
}
