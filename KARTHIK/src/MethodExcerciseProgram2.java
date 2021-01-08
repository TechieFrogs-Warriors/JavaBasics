import java.util.Scanner;

public class MethodExcerciseProgram2 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        char word;
        int i;
        do{
            System.out.println("Eneter values: ");
            while(!scan1.hasNext("[A-Z&a-z]*")&&!scan2.hasNext()){
                System.out.println("Eneter Character and integer Only");
                scan1.next();
                scan2.next();
             }
            word=scan1.next().charAt(0);
            i=scan2.nextInt();
        }
        while(word<=0&&i<=0);
        method(i,word);
        method(word,i);
        scan1.close();
        scan2.close();
    }
    public static int method(int a,char b){
        System.out.println("Integer Is: "+a);
        System.out.println("Charecter Is: "+b);
        return a;
    }
    public static char method(char a,int b){
        System.out.println("Charecter is: "+a);
        System.out.println("Integer Is: "+b);
        return a;
    }
}
