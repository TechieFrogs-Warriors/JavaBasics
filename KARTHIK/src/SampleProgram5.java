import java.util.Scanner;

public class SampleProgram5 {
    public static void main(String[] args) {
        //	Java Program to Check Whether an Alphabet is Vowel or Consonant
        Scanner scan=new Scanner(System.in);
        char word;
        do{
            System.out.println("Eneter Single Charecter");
            while(!scan.hasNext("[A-Z&a-z]")){
                System.out.println("Eneter Character Only");
                scan.next();
             }
            word=scan.next().charAt(0);
        }
        while(word<=0);
        if(word=='a'||word=='e'||word=='i'||word=='o'||word=='u'||word=='A'||word=='E'||
        word=='I'||word=='O'||word=='U'){
            System.out.println("Given Alphabet Is An Vowel  "+word);
         }
         else 
         System.out.println("Given Alphabet Is An Consonant: "+word);
         scan.close();

        
    }
    
}
