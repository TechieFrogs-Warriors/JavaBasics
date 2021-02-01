package StringAssignmentPrograms2;

import java.util.Scanner;

public class FrequencyOfCharecters19 {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=Scan.nextLine();
        str.toLowerCase();
        char ch[]=str.toCharArray();
        int l=ch.length;
        int count;
        for(int i=0;i<l-1;i++){
            count=1;
            for(int j=i+1;j<l;j++){
                if(ch[i]==ch[j]){
                    count++;
                    for(int k=j;k<l-1;k++){
                        ch[k]=ch[k+1];
                    }
                    l--;
                }
            }
            System.out.println("The Frequency of charecter: "+ch[i]+" is: "+count);
        }//..outer for loop
        Scan.close();
    }//..main ends
}
