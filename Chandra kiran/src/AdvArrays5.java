public class AdvArrays5 
{
    public static void main(String[] args) 
    {
       int a[][]={{70,60,80},{50,30,40},{90,10,20}}; 
       int temp=0;
       int n1=0,n2=n1+1;
      System.out.println("Before Sorting");
       for(int i=0;i<a.length;i++)
       {
           for(int j=0;j<a.length;j++)
           {
               System.out.print(a[i][j]+" ");
           }
           System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = n1; j < n2; j++) {
                for (int k = 0; k < a.length; k++) {
                    for (int l = n1; l < n2; l++) {
                        if (a[i][j] < a[k][l]) {
                             temp = a[k][l];
                            a[k][l] = a[i][j];
                            a[i][j] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("After sorting");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
         }

            
     }
        
}
    

