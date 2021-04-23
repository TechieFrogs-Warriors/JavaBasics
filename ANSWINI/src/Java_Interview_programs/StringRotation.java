package Java_Interview_programs;
//Program to find whether one string is rotation of another string
public class StringRotation {

    //logic method to check rotation
    public static boolean isRotation(String str1,String str2) {
        String str3 = str1 + str1; //here we are rotating our string 
        //now compare this rotated string with second string given
        if(str3.contains(str2))
        {
            return true;
        }
        return false;
        
    }

    public static void main(String[] args) {
        
        //calling the rotation check method in driver class
        //since the rotation method is static..
        //we call it by its classname instead of creating object for the class where the method exists
        System.out.println("Is second string rotation of first string? : "+isRotation("java", "vaja"));

    }
}
