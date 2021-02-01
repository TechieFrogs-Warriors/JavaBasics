public class StringsPrg46 
{
    public static boolean Palindrome(String a)
    {
        boolean flag =true;
        for(int i=0;i<a.length()/2;i++)
        {
            if(a.charAt(i)!=a.charAt(a.length()-i-1))
            {
                flag =false;
                break;
            }

        }
        return flag;
    }
        public static void main(String[] args) 
        {
            String S ="madam mam sees";
            String word="",smallP="",bigP="";
            String[] words = new String[100];
            int temp = 0, c=0;
            S=S.toLowerCase();
            S=S+" ";
            for(int i=0;i<S.length();i++)
            {
                if(S.charAt(i)!=' ')
                {
                    word = word+S.charAt(i);

                }
                else
                {
                    words[temp]=word;
                    temp++;
                    word="";

                }
            }
            for(int i=0;i<temp;i++)
            {
                if(Palindrome(words[i]))
                {
                    c++;
                    
                }
                if(c==1)
                {
                    smallP=bigP=words[i];
                }
                else
                {
                    if(smallP.length()>words[i].length())
                    {
                        smallP=words[i];
                    }
                    if(bigP.length()<words[i].length())
                    {
                        bigP=words[i];
                    }
                }

            }
            if(c==0)
            {
                System.out.println("No palindrome is present in the given string");
            }
            else
            {
                System.out.println("Smallest Palindrome word "+smallP);
                System.out.println("Biggest Palindrome word "+bigP);
            }

            
        }

    
    
}
