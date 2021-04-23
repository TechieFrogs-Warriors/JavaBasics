package Java_Interview_programs;
//program to reverse a string
public class StringReverse {
    public static void main(String[] args) 
    {
        //using for loop
        String name ="aswini"; //original string
        String revName ="";//empty string to store the string after reversing original string
        for(int i=name.length()-1;i>=0;i--)
        {
            //appending each letter from the end of the to the taken emepty string 
            revName = revName + name.charAt(i);
        }
        System.out.println(revName);//printing the reversed string


        //using stringbuffer
        //creating string buffer object and passing string as an argument
        StringBuffer sb = new StringBuffer(name);
        System.out.println(sb.reverse()); //reversing the string using reverse() method available in stringbuffer

       
    }
}
