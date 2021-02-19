package Accenturepgms;
import java.util.*;

public class Ass20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        // validation
        do {
            System.out.println("Enetr String: ");
            while (!sc.hasNext("[A-Za-z]*")) {// String Regular expression
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            str = sc.nextLine();
        } while (str.equals(""));
        System.out.println("Enter  String Is valid " + str);

        
        int[] freq=new int[str.length()];
        char maxchar=str.charAt(0);
        int i,j,max;
        str = str.toLowerCase();// converting given string to lowe cases
        char Str1[]=str.toCharArray();// Converting given string into character array
        for(i=0;i<Str1.length;i++){// Count each word in given string and store in array freq
            freq[i]=1;
            for(j=i+1;j<Str1.length;j++){
                if(Str1[i]==Str1[j]&&Str1[i]!='0'){
                    freq[i]++;
                    Str1[j]='0';
                }
            }
        }
        max=freq[0];// If max is less than frequency of a character then, store frequency in max and
                         // corresponding character in maxChar
        for(i=0;i<freq.length;i++){
            if(max<freq[i]){
                max=freq[i];
                maxchar=Str1[i];

            }
        }
        System.out.println("maximum occuring character :" +maxchar);

    }
    
}
