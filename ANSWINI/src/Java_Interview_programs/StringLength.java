package Java_Interview_programs;
//program to find length of a string without using inbuilt method
public class StringLength {

    public static int len(String str) {
        //Assumong string length as zero.
        int length=0;
        //logic loop to find length of string
        for(int i=0;i<str.length();i++)
        {
            //for each character in the string length will be incremented
            length++;
        }
        return length;
        
    }
    public static void main(String[] args) {
        //Take a string
        String s ="Hello World";
        //passing the string to 'len()' method to get the length of the string
        System.out.println("Length of the string< "+s+" >is: "+len(s));
    }
}
