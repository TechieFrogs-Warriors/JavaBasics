public class NestedForBreak {
    public static void main(String[] args) {
        int i,j,term=5;
        for( i=1;i<=term;i++)
        {
            for(j=term;j>=i;j--)
            {
                if(i==2&&j==2){
                    break;
                }
                if(i==3&&j==3){
                    continue;
                }
                
                System.out.print(j);

            }
        
        System.out.println();
        }

    }
    
    
}
