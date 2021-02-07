public class AdvArrays7 
{
    public static void main(String[] args) 
    {

        String S="The quick brown fox jumps over the lazy dog.";
        char ch='a';
        for(int i=0;i<26;i++)
        {
            char c= (char) (ch + i);
            System.out.println(c+"-"+S.indexOf(ch+i, 0));
        }
    }
    
}
