package StringAssignmentPrograms2;

import java.util.Scanner;

public class MaximumAndMinimumcharecter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String:");
        String str = scan.nextLine();
        int[] freq = new int[str.length()];  
        char minChar = str.charAt(0), maxChar = str.charAt(0);  
        int  min, max;           
        char string[] = str.toCharArray();  

        for(int i = 0; i < string.length; i++) {  
            freq[i] = 1;  
            for(int j = i+1; j < string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
                    freq[i]++;    
                    string[j] = '0';  
                }  
            }  
        }  
        min = max = freq[0]; 

        for(int i = 0; i <freq.length; i++) {   
            if(min > freq[i] && freq[i] != '0') {  
                min = freq[i];  
                minChar = string[i];  
            }   
            if(max < freq[i]) {  
                max = freq[i];  
                maxChar = string[i];  
            }  
        }  
        System.out.println("Maximum occurring character: " + maxChar); 
        System.out.println("Minimum occurring character: " + minChar);  
        scan. close();
    }
}