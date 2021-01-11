import java.util.Scanner;

public class PracticeProgramOnClassAndObject11 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter 1st Disteance: ");
        int a=scan.nextInt();
        System.out.println("Enter 2nd Disteance: ");
        int b=scan.nextInt();
        Distence obj=new Distence(a,b);
        System.out.println("The Distence In Feets: "+obj.getDistence());
        System.out.println("The Disteance In Inches: "+obj.getInches()); 
        scan.close();
    }
}
class Distence{
    int d1;
    int d2;
    Distence(int i,int f){
        d1=i;
        d2=f;
    }//total distence in feets
    public int getDistence(){
        int distence=(d1+d2);
        return distence;
    }//feets to inches conversion
    public int getInches(){
        int distence=d1+d2;
        int inches=distence*12;
        return inches;

    }
}
