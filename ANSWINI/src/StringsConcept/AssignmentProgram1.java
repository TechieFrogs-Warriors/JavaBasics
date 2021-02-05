package StringsConcept;

import java.util.Scanner;

public class AssignmentProgram1 
{
    public static void main(String args[])
    {
        int i,VOWELS=0,CONSONANTS=0,DIGITS=0,SPACES=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character sequence including digits and special characters:"+"\n");
        String str=sc.nextLine();
        sc.close();
        char s[] = str.toCharArray();
        int n= s.length;
        for(i=0;i<n;i++)
        {
            if(s[i]=='a' || s[i]=='e' || s[i]=='i' ||s[i]=='o' || s[i]=='u' || s[i]=='A' ||s[i]=='E' || s[i]=='I' || s[i]=='O' ||s[i]=='U')
            {
                VOWELS ++;
            }
            else if((s[i]>='a'&& s[i]<='z') || (s[i]>='A'&& s[i]<='Z'))
            {
                CONSONANTS ++;
            }
            else if(s[i]>='0' && s[i]<='9')
            {
                DIGITS ++;
            }
            else if (s[i]==' ')
            {
                SPACES ++;
            }
        }
        System.out.println("Vowels = "+VOWELS);
        System.out.println("Consonants = "+CONSONANTS);
        System.out.println("Digits = "+DIGITS);
        System.out.println("White spaces = "+SPACES);
    }
    
}
