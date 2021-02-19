package Stringprograms;

public class Strass32 {
    public static void main(String[] args) {
        String name ="warriors GET READY to fight";
        StringBuffer newstr=new StringBuffer(name);
        for(int i=0;i<name.length();i++){
            if(Character.isLowerCase(name.charAt(i)))
            {
                newstr.setCharAt(i,Character.toUpperCase(name.charAt(i)));
            }
            else if(Character.isUpperCase(name.charAt(i)))
            {
                newstr.setCharAt(i,Character.toLowerCase(name.charAt(i)));
            }
        
            

        }
        System.out.println("string conversion : " + newstr);
        

    }
    
}
