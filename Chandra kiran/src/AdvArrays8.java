public class AdvArrays8 
{
    public static void main(String[] args) 
    {
        String S="the quick brown fox";
        String S1="queen";
        char b[]= new char[256];
        for(int i=0;i<S1.length();i++)
        {
             b[S1.charAt(i)]++;
            
        }
        for(int i=0;i<S.length();i++)
        {
            if(b[S.charAt(i)]==0)
            {
                System.out.print(S.charAt(i));
            }
        }
        
    }
    
}
