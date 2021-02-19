import java.util.Scanner;

public class PracticeProgramOnClassAndObject8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1st Value: ");
        int x=scan.nextInt();
        System.out.println("Enter 2nd Value: ");
        int y=scan.nextInt();
        System.out.println("Enter 3rd Value: ");
        int z=scan.nextInt();
        Avarage obj=new Avarage(x,y,z);
        System.out.println("Avarage Of The Three Numbers Are: "+obj.A);
        scan.close();
    }
    
}
class  Avarage{
    int A;
    Avarage(int a,int b,int c){
     A=(a+b+c)/3;
    }

}

    
