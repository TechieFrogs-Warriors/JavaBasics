public class ArraysPrg40 
{
    public static void main(String[] args) 
    {
         double a[]={30,50,40,70,80};
         int n=a.length;
         double sum=0,average=0,S=0;
         for(int i=0;i<a.length;i++)
         {
             sum=sum+a[i];
         }
         average=(sum)/n;
         for(double i=0;i<a.length;i++)
         {
             S=S+Math.pow(i-average, 2);//squares the average
          }
         double S1= Math.sqrt(S/n);//squareroot is assigned
            System.out.println("Standard Deviation "+S1);
    }
    
}
