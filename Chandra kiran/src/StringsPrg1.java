public class StringsPrg1 
{
    public static void main(String[] args) 
    {
        String S="Chan dra Kir677an";
        int v=0,d=0,s=0,c=0;
        for(int i=0;i<S.length();i++)//goes through the string 
        {
            char ch = S.charAt(i);
            if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))//checks the vowels
            {
                v++;
            }
        
            else if(ch>='0'&& ch<='9')// checks the digits
            {
                d++;
            }
            else if(ch ==' ')//checks the spaces
            {
               s++;
            }
            else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))//checks the consonents
            {
                c++;
            }
        }
        
            System.out.println("Vowels "+v);
            System.out.println("Digits "+d);
            System.out.println("Spaces "+s);
            System.out.println("Consonants "+c);
     }
    
}
