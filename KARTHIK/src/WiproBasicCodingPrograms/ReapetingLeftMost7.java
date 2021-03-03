package WiproBasicCodingPrograms;

import java.util.Scanner;

public class ReapetingLeftMost7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = vallidation(scan);
        //convert string into lowercase
        str = str.toLowerCase();
        //convert string to char array
        char ch[] = str.toCharArray();
        //logic
        int count = 0;
        int temp = ch[0];//store left most element only
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[0]==ch[j]){
                    count ++;
                }
            }
        }
        if(count!=0){
            System.out.println("left most repeted word: "+(char)temp);
        }
        else{
            System.out.println("-1");
        }
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
