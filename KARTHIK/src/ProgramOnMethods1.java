import java.util.Scanner;

class  Operation {
    public String add(int n1, int n2, String s){
       int s1=n1+n2;
       return s+s1;
    }
    public int sub(int n1, int n2){
        int s1=n1-n2;
        return s1;
    }
}

public class ProgramOnMethods1{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Value: ");
        int a=scan.nextInt();
        System.out.println("Enter b Value: ");
        int b=scan.nextInt();
        System.out.println("Enter String: ");
        String str=scan.next();
        Operation testObj=new Operation();
        String c=testObj.add(a , b , str);
        System.out.println("The Addition Value "+a+"+"+b+"="+c);
        int d = mul (a , b);
        System.out.println("Multiplication Result"+a+"*"+b +"="+d);
        int e=testObj.sub(a , b);
        System.out.println("The Subtraction Value "+a+"-"+b +"="+e);
        int f = div(a , b);
        System.out.println("Division Result"+a+"/"+b +"="+f);
        scan.close();
    }
    public static int mul(int n1,int n2){
        int m = n1 * n2;
        return m;
    }
    public static int div(int n1,int n2){
        int d = n1 / n2;
        return d;
    }

}

