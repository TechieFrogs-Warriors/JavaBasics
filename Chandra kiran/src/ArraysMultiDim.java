public class ArraysMultiDim 
{
    public static void main(String[] args) 
    {
        int a[][]={{10,20,30},{50,60,70},{80,90,100}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //cloning 
        int b[][]=a.clone();
        for (int[] is : b) {
            System.out.println(is);
            
        }
        System.out.println();
        System.out.println(a==b);
        
    }
    
}
