package StringAssignmentPrograms2;

import java.util.Scanner;

public class MaxMinCharOccur {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=scan.nextLine();

        str=str.toLowerCase();
        char ch[]=str.toCharArray();
        char ch1=str.charAt(0);
        char ch2=str.charAt(0);
        int min=Integer.MAX_VALUE;
        int max=0;

        for(int i = 0; i < ch.length; i++){    
            int count = 1;   
            for(int j = i+1; j < ch.length; j++){    
                if(ch[i]==(ch[j])){    
                    count++;  
                }     
            }    
            if(count > max){    
                max = count;    
                ch1 = ch[i];    
            }
            if(count < min && ch[i]!='0')
			{    
                min = count;    
                ch2 = ch[i];    
            }   
              
        }
        System.out.println("Maximum occured character in the string is: " + ch1);
        System.out.println("Minimum occured character in the string is: " + ch2);
        scan.close();
        
    }
    
}
