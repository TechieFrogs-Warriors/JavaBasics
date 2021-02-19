 class valid
{
    static boolean shuffle(String S,String S1,String result)
    {
      if(S.length() + S1.length() != result.length())
      {
          return false;

      }
      int i=0,j=0,k=0;
      while(k!=result.length())
      {
          if(i<S.length()&&S.charAt(i)==result.charAt(k))
          {
              i++;
          }
          else if(j<S1.length()&&S1.charAt(j)==result.charAt(k))
          {
              j++;
          }
          else
          {
              return false;
          }
          k++;
        }
          if(i<S.length()||j<S1.length())
          {
              return false;
          }
        
          
          return true;
}

      
    
    
    public static void main(String[] args)
    {
        String S="ABCD";
        String S1="1234";
        String[] results ={"AB1234CD","CD1243AB"};
        for (String result : results) 
        {
            if(shuffle(S,S1,result) == true)
            {
                System.out.println(result+"is a valid shuffle of "+S + "and"+S1);

            }
            else
            {
                System.out.println(result+"is a  invalid shuffle of "+S + "and"+S1);
            }
            
        }
    }

            
        
        
    }
    

