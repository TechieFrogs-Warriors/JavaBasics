package AccenturePrograms;
//program to find max tree height in inches
public class Cal_TreeHeight 
{
    public static void main(String[] args) 
    {
        //Taking input
        int [] trees={10,23,21,27};
        int[] inches={4,5,2,7};
        int i;
        //Logic
        for(i=0;i<trees.length;i++)
        {
            inches[i]=inches[i] + (12 * trees[i]);
        }
        //printingarray of final inches
        for(i=0;i<trees.length;i++)
        {
            System.out.print(inches[i]+" ");
        }
        //checking from max inches
        int max=0;
        for(i=0;i<inches.length;i++)
        {
            if(max < inches[i])
            {
                max=inches[i];
            }
        }
        
        System.out.println("\nMax height of tree is: "+max);
         
    }
    
}
