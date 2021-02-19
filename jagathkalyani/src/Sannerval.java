
import java.util.Scanner;

public class Sannerval {
    public static void main(String[] args) {
        Scanner s1  =new Scanner(System.in);
        float k;
        do{
            System.out.println("enter password : ");
            while(!s1.hasNextFloat()){
           
                System.out.println("incorrect : ");
                s1.next();
            }
            k=s1.nextFloat();
        }
        while(k<=152);
        System.out.println("correct");
        

        }
        

    }
    

