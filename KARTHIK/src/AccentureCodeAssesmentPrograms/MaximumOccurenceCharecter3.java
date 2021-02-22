package AccentureCodeAssesmentPrograms;

import java.util.Scanner;

class Max_char{
    public void maxChar(String str){
        str.replace(" ", "");
        char ch[]=str.toCharArray();
        char ch1=str.charAt(0);
        int count=1;
        int max=0;
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                } 
            }
            if(count > max){    
                max = count;    
                ch1 = ch[i];    
            }
        }
        System.out.println("Maximum Occurence Of a Charecter is: "+ch1);
    }
}

public class MaximumOccurenceCharecter3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str;
        do{
            System.out.println("Enter String: ");
            while(!scan.hasNext("[a-z&A-z& ]*")){
                System.out.println("Please Enter String only.");
                scan.next();
            }
            str=scan.nextLine();
        }
        while(str.equals(""));
        Max_char obj=new Max_char();
        obj.maxChar(str);
        scan.close();
    }
}

