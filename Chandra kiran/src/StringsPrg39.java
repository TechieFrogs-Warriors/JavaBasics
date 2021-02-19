public class StringsPrg39 
{
    public static void main(String[] args) 
    {
        String S="chandra chandu Kiran chandra Kiran chandra ";
        String words[]= S.split(" ");
        
        for(int i=0;i<words.length;i++)
        {
           
          for(int j=i+i;j<words.length;j++)
          {
              if(words[i].equals(words[j]))
              {
                  System.out.println(words[j]);
                  words[j]="";
              }
          }
        
        }
    }
    
}
