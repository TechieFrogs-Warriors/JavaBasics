package TcsPrograms;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String:");
        String msg = scan.nextLine();
        System.out.println("Enter key: ");
        int key = vallidation(scan);
        //logic
        char ch[] = msg.toCharArray();//string to char array
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                ch[i]=ch[i];
            }
            else{
                ch[i]= (char) (ch[i] + key);//key is added to each charecter
            }
            
        }
        //print output
        for(int a:ch){
            System.out.print((char)a);
        }
    }
    //integer vallidation part
    public static int vallidation(Scanner scan){
        int number;
        do{
            System.out.println("Enter positive integer: ");
            while(!scan.hasNextInt()){
                System.out.println("Enter Integer  value only: ");
                scan.next();
            }
            number = scan.nextInt();
        }
        while(number<0);
        return number;
    }
}
