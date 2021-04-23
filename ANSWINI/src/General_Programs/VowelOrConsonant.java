import java.util.Scanner;

public class VowelOrConsonant 
{
    public static void main(String[] args)
     {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER YOUR CHARACTER");
        char alphabet=obj.next().charAt(0);
        switch(alphabet)
        {
            case 'a':System.out.println("THE CHARACTER YOU ENTERED  "+alphabet+ "  IS :   VOWEL");break;
            case 'e':System.out.println("THE CHARACTER YOU ENTERED  "+alphabet+ "  IS :   VOWEL");break;
            case 'i':System.out.println("THE CHARACTER YOU ENTERED  "+alphabet+ "  IS :   VOWEL");break;
            case 'o':System.out.println("THE CHARACTER YOU ENTERED  "+alphabet+ "  IS :   VOWEL");break;
            case 'u':System.out.println("THE CHARACTER YOU ENTERED  "+alphabet+ "  IS :   VOWEL");break;
            
            default: System.out.println("THE CHARACTER YOU ENTERED  "+alphabet+ "   IS :   CONSONANT ");
        }
        obj.close();   
    } 
}
