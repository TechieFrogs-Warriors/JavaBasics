public class StringsPrg25 
{
    public static void main(String[] args) 
    {
        String S="ChandraKiran";
        int v=0,c=0;
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                v++;
            }
            else
            {
                c++;
            }

        }
        System.out.println("Vowels "+v);
        System.out.println("Consonants "+c);
        
    }
    
}
