package WiproPrograms;

import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter String (Num,Spcchar,alpha):");
        String str=scan.nextLine();

        char ch[]=str.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='@' | ch[i]=='!'| ch[i]=='#'| ch[i]=='$' | ch[i]=='%'| ch[i]=='^'|ch[i]=='*'){
                if(ch[i-1]=='1'| ch[i-1]=='2' | ch[i-1]=='3'| ch[i-1]=='4'|ch[i-1]=='5'| ch[i-1]=='6'| ch[i-1]=='7'|ch[i-1]=='8'| ch[i-1]=='9'|ch[i-1]=='0'){
                    System.out.println("Number is: "+ch[i-1]);
                    break;
                }
                else{
                    System.out.println("No integer is Present Before special charecter.");
                }
            }
        }
        scan.close();
    }
}
