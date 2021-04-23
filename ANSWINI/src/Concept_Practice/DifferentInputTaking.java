
import java.io.*;
import java.util.Scanner;

public class DifferentInputTaking 
{
    public static void main(String[] args) throws IOException 
    {
        System.out.println("enter name");
        String name=System.console().readLine();//using console()
        System.out.println("you are: "+name);

        System.out.println("enter name2");
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));//using buffered reader
        String name1=rdr.readLine();
        System.out.println("you are: "+name1);

        //taking file from system as input
        File file = new File("E:\\TECHIE FROGS\\JAVA\\inputfilename.txt") ;
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
        {
            String myName=sc.nextLine();
            System.out.println("the name in the file is: "+myName);
        }
        while(sc.hasNextInt())
        {
            int num=sc.nextInt();
            System.out.println(" the number in the file is: "+num);
        }
        
        sc.close();
  
        
        
    }
    
}
