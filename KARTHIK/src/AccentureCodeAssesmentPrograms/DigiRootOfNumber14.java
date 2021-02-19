package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

public class DigiRootOfNumber14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        do{
            System.out.println("Enter Number:");
            while(!scan.hasNextInt()){
                System.out.println("Enter integer Number only:");
                scan.next();
            }
            number=scan.nextInt();
        }
        while(number<=0);
        int s1 = 0, s2 = 0;
        String str1=Integer.toString(number);
        char ch1[]=str1.toCharArray();
        for(int i=0;i<ch1.length;i++){
            s1= s1 + ch1[i];
        }
        
        if(s1>=10){
            String str2=Integer.toString(s1);
            char ch2[]=str2.toCharArray();
            for(int i=0;i<ch2.length;i++){
                s2= s2 +ch2[i];
            }
        }
        System.out.println("Digi Root Of Number is: "+s2);
        scan.close();
    }
}
