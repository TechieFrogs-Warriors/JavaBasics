import java.util.Scanner;

public class Maximumcharacter 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String Str;
        //input validation.....
        do
        {
            System.out.println("Enter Valid String ");
            while(!scan.hasNext("[A-Za-z]*"))
            {
                System.out.println("Entered string is not valid.Please enter valid String");
                scan.next();
            }
            Str=scan.nextLine();
        }while(Str==" ");
        int len=Str.length();
        int f[]=new int[len];
        int i,j,max;
        char ch=Str.charAt(0);
        char arr[]=Str.toCharArray();
        for(i=0;i<arr.length;i++)//for loop for taking elements
        {
            f[i]=1;
            for(j=i+1;j<arr.length;j++)//for loop for comparing remaining all elements to taken element
            {
                if(arr[i]==arr[j]&&arr[i]!=' '&&arr[i]!='0')//checks whether any character is repeated or not
                {
                    f[i]++;
                    arr[j]='0';
                }
            }
        }
        max=f[0];
        for(i=0;i<f.length;i++)
        {
            if(max<f[i])//checks the maximum occured character
            {
                max=f[i];
                ch=arr[i];//assign charcter to maximum occured
            }
        }
        System.out.println("Maximum occured character in a String "+ch);
        
    }
    
}
