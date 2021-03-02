import java.util.Scanner;

public class Assesment4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String sentence=inputValidation(scanner);
        sentence=sentence.toLowerCase();//coversts the string in to lower case
        String words[]=sentence.split(" ");//spliting the string into words array by spaces
        int count=0,uniquewords=0;
        for(int i=0;i<words.length;i++)//for loop for first word 
        {
            for(int j=i+1;j<words.length;j++)//for loop for next word
            {
                if(words[i].equals(words[j]))//checks whether the two words are equal 
                {
                    count++;//if true count will be increamented
                }
            }
        }
        uniquewords=uniquewords+words.length-2*(count);//expression to get unique words count in the given string
        System.out.println("No.of uniquewords "+uniquewords);
        
    }
    //input validation...
    public static String inputValidation(Scanner scanner)
    {
        String sentence;
        do
        {
            System.out.println("Enter valid String");
            while(!scanner.hasNext("[A-Za-z]*"))
            {
                System.out.println("Entered String is not valid .Please enter valid STring");
                scanner.hasNext();
            }
            sentence=scanner.nextLine();
        }while(sentence.equals(" "));
        return sentence;
    }

    
}
