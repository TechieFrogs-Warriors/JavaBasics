package Exceptionhandlinrgms;

public class Exphdlpgm1 {
    public static void main(String[] args) {
        int a=10,b=20,sum;
        try{
            sum=a+b;
            System.out.println(sum);
        }catch(ArithmeticException e){
            System.out.println("arithmetic exception");
        }
    }
    
}
