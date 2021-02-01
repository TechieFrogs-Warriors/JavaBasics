package StringAssignmentPrograms2;

import java.util.Scanner;

public class DuplicateCharecters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String: ");
        String Str=scan.nextLine();
        char[] ch=Str.toCharArray();
        for(int i=0;i<=Str.length();i++){
            for(int j=i+1;j<Str.length();j++){
                if(ch[i]==ch[j]){
                    System.out.print(ch[j]+" ");
                    break;
                }
            }
        }
        scan.close();
    }
    
}
