public class StringsPrg24 
{
    public static void main(String[] args) 
    {
        String S = "cha?n,dra.kir:an;";
        int p=0;
        for(int i=0;i<S.length();i++)
        {
            char ch =S.charAt(i);
            if(ch=='?'||ch==','||ch=='.'||ch==':'||ch==';')
            {
                p++;

            }
        }
        System.out.println("Puntuations "+p);
        
    }
    
}
