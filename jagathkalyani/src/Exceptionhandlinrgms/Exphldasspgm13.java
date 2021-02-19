package Exceptionhandlinrgms;

public class Exphldasspgm13 {
    public static void main(String[] args) {
        try{
            int num1=80,num2=0;
            int output=num1/num2;
            System.out.println("answer :" + output);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
    }
    
}
