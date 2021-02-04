public class ArraysExample1 
{
    int b[]={10,30,40};
    public static void main(String[] args) 
    {
        
        int a[]={10,100,1000,10000};
        char b[]={'a','b','c','d'};
        int c[]={'c','h','a','d','u'};
        
        String S[]= new String[10];
         double d[] = new double[5];
         char ch[]={65,66,67,68,69};
        
        for(int i=0;i<a.length;i++)
        {
         System.out.println(a[i]+10);
         System.out.println(b[i]);
         System.out.println(S[i]="chandra kiran");
         
        }
         for(int i =0;i<b.length;i++)
         {
             if(a[i]>0)
             {
                 System.out.println(a[i]+b[i]);
             }
         }
         for (int i : a) 
         {
              System.out.println(i+25); 
         }
         for(int i=0;i<5;i++)
         {
            d[i]=d[i]+i;
            System.out.println(d[i]*2);
         }
         System.out.println(c);
         for (int i=0;i<c.length;i++) 
         {
             System.out.println(c[i]);
        }
        for(int j=0;j<ch.length;j++)
        {
            System.out.println(ch[j]);
        }
        int n[]= new int[10];
        int m[]= new int[100];
        m=n;
        n=m;
        System.out.println(m.length);
        System.out.println(n.length);
        int l[] = new int[-7];
        System.out.println(l.length);
    
    }
    
}
