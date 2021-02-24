package WiproPrograms;

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=vallidation(scan);
        //split the words
        String words[]=str.split(" ");
        boolean arr[]=new boolean[words.length];
        int count=0;
        //logic
        for(int i=0;i<words.length;i++){
            if(!arr[i]){
                count++;
                for (int j = i + 1; j < words.length; j++){
                    if (words[j].compareTo(words[i]) == 0){
                        arr[j] = true;
                        count--;
                    }
                }

            }
        }
        System.out.println("unique Words: "+count);
    }
    //string vallidation
    public static String vallidation(Scanner scan){
        String str;
        do{
            System.out.println("Enter String: ");
            while(!scan.hasNext("[a-z&A-z& ]*")){
                System.out.println("Please Enter String only: ");
                scan.next();
            }
            str=scan.nextLine();
        }
        while(str.equals(""));
        return str;
    }
}
