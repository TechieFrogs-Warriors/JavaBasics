package StringAssignmentprograms;

public class ValidShuffule21 {
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="12345";
        String[] results ={"ABCD12345","CD1243AB","AB12345CD","12345ABCD","12AB345CD"};
        for (String result : results) {
            if(shuffle(str1,str2,result) == true){
                System.out.println(result+" Is a valid shuffle of "+str1 + " and "+str2);
            }
            else{
                System.out.println(result+" Is a  invalid shuffle of "+str1 + " and "+str2);
            }
        }
    }
    static boolean shuffle(String str1,String str2,String result){
      if(str1.length() + str2.length() != result.length()){
          return false;
      }
      int i=0,j=0,k=0;
      while(k!=result.length()){
          if(i<str1.length()&&str1.charAt(i)==result.charAt(k)){
            i++;
          }
          else if(j<str2.length()&&str2.charAt(j)==result.charAt(k)){
            j++;
          }
          else{
            return false;
          }
          k++;
        }
        if(i<str1.length()||j<str2.length()){
              return false;
          }
          return true;
      }
    
}
