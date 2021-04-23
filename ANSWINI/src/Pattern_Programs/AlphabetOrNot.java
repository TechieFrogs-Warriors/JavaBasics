import java.util.Scanner;

public class AlphabetOrNot 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR CHARACTER");
        char character=obj.next().charAt(3);//verifies character at the specified position only
        if(character>='A' && character<='Z'||character>='a' && character<='z')
        System.out.println("YES IT IS ALPHABET");
        else
        System.out.println("NO IT IS NOT ALPHABET");
        obj.close();
    }
    
}
