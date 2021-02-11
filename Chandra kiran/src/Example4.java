import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) throws IOException {
        String S = System.console().readLine();
        System.out.println(S.length());
        File f = new File("C:\\Users\\chand\\Documents\\input.txt");
        BufferedReader Br = new BufferedReader(new FileReader(f));
        String S1 = Br.readLine();
        System.out.println(S1+60);
        Br.close();
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter the String");
        char S2;
        System.out.println("Enter the n value ");
        int n1=scan.nextInt();
        int len=S.length();
        int m=len/n1;
        String S3;
        if(len%n1==0)
        {
        for(int i=0;i<n1;i++)
        {
             S3="";
            for(int j=i*m;j<m*(i+1);j++)
            {
                S3=S3+S.charAt(j);
            }
            System.out.println(S3);
        }
    }
        else
        {
            System.out.println("Cannot be divide into equal parts");
        }
    StringBuffer Sb=new StringBuffer(S2);
        for(int i=0;i<S.length();i++)
        {
            if(Character.isUpperCase(Sb.charAt(i)))
            {
                Sb.setCharAt(i, Character.toLowerCase(Sb.charAt(i)));
            }
            else if(Character.isLowerCase(Sb.charAt(i)))
            {
                Sb.setCharAt(i, Character.toUpperCase(Sb.charAt(i)));
            }
            System.out.print(Sb.charAt(i));
        }
    int n[]=new int[S.length()];
    int i=0,j=0;
    //String S3[]=S2.split(" ");
    char ch[]=S.toCharArray();
    for(i=0;i<S.length();i++)
    {
        n[i]=1;
    
        for(j=i+1;j<S.length();j++)
        {
            
            if(ch[i]==ch[j])
            {
                n[i]++;
                ch[j]='0';
                
            }
        }
    }
    for(i=0;i<n.length;i++)
    {
        if(ch[i]!=' '&ch[i]!='0')
        {
            System.out.println(ch[i]+"-"+n[i]);
        }
    }
        do
        {
            System.out.println("Enter the valid String");
            while(!scan.hasNext("[A-Za-z]"))
            {
                System.out.println("Entered value is not valid character.Please enter valid character");
                scan.next();
            }
            S2=scan.next().charAt(0);
        }while(S2=='0');

        scan.close();
    }
      
    
}
