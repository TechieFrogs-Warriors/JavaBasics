package Stringprograms;

public class Strass25 {
    public static void main(String[] args) {
        String str="warriors get ready to fight";
        int vocount= 0,concount=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vocount++;
            }
            else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
            {
                concount++;
            }
        }
        System.out.println("number of vowels in string is : " + vocount);
        System.out.println("number of consonents in string is :" + concount);




    }
    
}
