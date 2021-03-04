package JavaInterviewCodingQuestions;

import java.util.Scanner;

public class ReverseStringPreceedingSpaces5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //taking string as a input
        System.out.println("Enter String: ");
        String str = scan.nextLine();
        //convert string to chararray
        char input[] = str.toCharArray();
        char result[] = new char[str.length()];

        //insert sapces in result array
        for(int i=0;i<input.length;i++){
            if(input[i]==' '){//if it space same position is space in result
                result[i]=' ';
            }
        }
        int j = input.length-1;//last position
        for(int i=0;i<input.length;i++){
            if(input[i]!=' '){//leave the space from input
                if(result[j]==' '){//leave the space from result 
                    j--; //dectressing position
                }
                result[j]=input[i];//if there is no space it print cahrecter 
                j--;//again decterment the position
            }
        }
        System.out.print(String.valueOf(result));
        /* for(char a: result){
            System.out.print(a+" ");
        } */
        scan.close();
    }
    //String vallidation
    public static String vallidation(Scanner scan){
        String str;
        do{
            while(!scan.hasNext("[A-Za-z]*")){
                System.out.println("Enter String only:");
                scan.next();
            }
            str = scan.next();
        }while(str.equals("="));
        return str;
    }
}
