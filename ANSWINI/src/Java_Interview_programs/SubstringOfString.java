package Java_Interview_programs;
//program to find substrings of a string
public class SubstringOfString {
    public static void main(String[] args) {
        //take a string
        String s ="java";

        //logic to find substrings within a string
        System.out.println("Substrings in the string "+s+" are:");
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                System.out.println(s.substring(i, j));
            }
        }

    }
}
