package StringAssignmentPrograms2;

public class NumberOfCharecters1 {
    public static void main(String[] args) {
        String str1="karthik raju";
        int count=0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Total Number of Charecters of a String is:"+count);
    }   
    
}
