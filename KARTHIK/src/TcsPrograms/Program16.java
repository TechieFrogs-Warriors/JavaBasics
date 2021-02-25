package TcsPrograms;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = vallidation(scan); 

        //split wors
        String words[] = str.split(" ");
        for(int i=0;i<words.length;i++){
            if(i==0){
               char[] ch =words[i].toCharArray();
               for(int j=0;j<ch.length;j++){
                    if(ch[j]=='a'|| ch[j]=='e' || ch[j]=='i'|| ch[j]=='o'|| ch[j]=='u'){
                        ch[j]='%';
                    }
                }
                for(char a:ch){
                    System.out.print(a);
                }
                
            }
            System.out.print(" ");
            if(i==1){
                char[] ch =words[i].toCharArray();
                for(int j=0;j<ch.length;j++){
                    if(ch[j]!='a'&& ch[j]=='e'&& ch[j]!='i'&& ch[j]!='o'&& ch[j]!='u'){
                        ch[j]='#';
                    }
                }
                for(char a:ch)
                System.out.print(a);
            }
            System.out.print(" ");
            if(i==2){
                words[i]=words[i].toUpperCase();
                System.out.print(words[i]);
            }
        }
    }
    //String vallidation
    public static String vallidation(Scanner scan){
        String str;
        do{
            System.out.println("Enter String: ");
            while(!scan.hasNext("[A-Za-z]*")){
                System.out.println("Enter String only: ");
                scan.next();
            }
            str = scan.nextLine();
        }
        while(str.equals(" "));
        return str;
    }
}
