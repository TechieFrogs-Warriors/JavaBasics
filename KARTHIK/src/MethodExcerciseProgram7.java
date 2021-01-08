import java.util.Scanner;

public class MethodExcerciseProgram7 {
    public static void main(String[] args) {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        int a,b;
        do{
            System.out.println("Enter Two Integers:");
            while(!scan1.hasNextInt()&&!scan2.hasNextInt()){
                System.out.println("Please Enter Integer Value:");
                scan1.next();
                scan2.next();

            }
            a=scan1.nextInt();
            b=scan2.nextInt();
            scan1.close();
            scan2.close();
        }
        while(a<=0&&b<=0);
        I obj1=new I();
        obj1.printNum(a);
        J obj2=new J();
        obj2.printNum(b);

    }
    
}
class I{
    public int printNum(int i){
        System.out.println("Value Of i Is:"+i);
        return i;
    }
}
class J{
    public int printNum(int j){
        System.out.println("value Of j Is:"+j);
        return j;
    }
}
