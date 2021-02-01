public class StringsPrg41 
{
    public static void main(String[] args) 
    {
        String S="my name is chandra kiran";
        String words[]=S.split(" ");
        String Small="",Large="";
        int Smalllength=Integer.MAX_VALUE,Largelength=0;
        for(int i=0;i<words.length;i++)
        {
            String word = words[i];
            int len = word.length();
            if(len>Largelength)
            {
                Largelength = len;
                Large = word;
            }
            if(len<Smalllength)
            {
                Smalllength = len;
                Small = word;

            }

        }
        System.out.println("Smallest word "+Small);
        System.out.println("Largest  word "+Large);
    }
}
