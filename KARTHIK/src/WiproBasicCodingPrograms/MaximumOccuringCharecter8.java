package WiproBasicCodingPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumOccuringCharecter8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = vallidation(scan);
        //convert string to chararray
        char ch[] = str.toCharArray();
        char[] ch1 = new char[str.length()];

        //logic  to find maximum charecter
        int max = 0,count=0;
        int k=0;
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                }
                if(count>max){//max repeted charecter
                    max=count;
                    ch1[k] = ch[i];
                    k++;
                }
            }
        }
        //store only repeted values in another array
        char ch3[] = new char[k];
        for(int i=0;i<k;i++){
            ch3[i]=ch1[i];
        }
        //sort the array
        Arrays.sort(ch3);
        //print repeted word using lexiographical order
        System.out.println(ch3[0]);
    }
    //string vallidation
    public static String vallidation(Scanner scan){
        String str;
        do{
            while(!scan.hasNext("[a-zA-Z]*")){
                System.out.println("Enter string only: ");
                scan.next();
            }
            str = scan.nextLine();
        }
        while(str.equals(" "));
        return str;
    }
}
