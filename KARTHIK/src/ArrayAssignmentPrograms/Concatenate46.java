package ArrayAssignmentPrograms;

import java.util.Arrays;

public class Concatenate46 {
    public static void main(String[] args) {
       String []str1={"abc","def","ghi"};
       String []str2={"abc","def","ghi"};
       int a=str1.length;
       int b=str2.length;
       String []str3=new String[a+b];
       
       System.out.println("Concatination Array: ");
       
       System.arraycopy(str1, 0, str3, 0, a);
       System.arraycopy(str2, 0, str3, a, b);

        System.out.println(Arrays.toString(str3));

    }
}
