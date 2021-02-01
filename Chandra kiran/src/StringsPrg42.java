public class StringsPrg42 
{
    public static void main(String[] args) 
    {
        String S ="chandra kiran chandra";
        String S1=S.toLowerCase();
        String words[] = S1.split(" ");
        String word =" ";
        int n=0;
        for(int i=0;i<words.length;i++)
        {
            int m=0;
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].equals(words[j]))
                {
                    m++;
                }
            }
             if(m>n)
             {
                 n=m;
                 word = words[i];
             }
        }
        if(n==0)
        {
            System.out.println("No word is repeated");

        }
        else
        {
            System.out.println("Most repeated word is "+word);
        }
        

    }
    
}
