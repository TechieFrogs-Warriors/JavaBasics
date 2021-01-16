import java.util.Scanner;

public class PracticeProgramOnClassAndObject7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Length: ");
        int a=scan.nextInt();
        System.out.println("Enter Breath: ");
        int b=scan.nextInt();
        Area1 obj=new Area1(a,b);
        System.out.println("The Area Of The Rectangle Is: "+obj.getArea());
        scan.close();

    }
    
}
class Area1{
    int length;
    int breath;
    public Area1(int l, int m){
        length=l;
        breath=m;
    }
    public int getArea(){
        int A=length*breath;
        return A;
    }
}