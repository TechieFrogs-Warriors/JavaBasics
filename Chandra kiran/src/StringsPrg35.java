public class StringsPrg35 
{
    public static void main(String[] args) 
    {
        String S = "abcde";
        String S1 = "efgh";
        String S2;
        S2=S+S;//S will be concatinate 
        if(S2.contains(S1))//checks whether S2 contains S1 
        {
            System.out.println("S1 is Rotation of S");
        }
        else 
        {
            System.out.println("S1 is not a Rotation of S");
        }

    }
    
}
