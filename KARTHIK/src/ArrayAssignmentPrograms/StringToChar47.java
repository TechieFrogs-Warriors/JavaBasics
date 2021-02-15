package ArrayAssignmentPrograms;

import java.util.Arrays;

public class StringToChar47 {
    public static void main(String[] args) {
        char[] ch={'k','b','p','s'};
        String str=new String(ch);
        System.out.println("Char to String: "+str);

        System.out.print("String to char: ");
        char[] ch1=str.toCharArray();
        System.out.println(Arrays.toString(ch1));
    }
}
