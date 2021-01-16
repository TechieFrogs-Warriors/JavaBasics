import java.util.Scanner;

public class PracticeProgramOnClassAndObject6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Length: ");
        int a=scan.nextInt();
        System.out.println("Enter Breath: ");
        int b=scan.nextInt();
        scan.close();
        Area obj=new Area();
        obj.length=a;
        obj.breath=b;
        obj.setDim();
        //obj.getArea(a, b);
        System.out.println("Area Of The Rectangle :"+obj.getArea(a,b));
    }
    
}
class Area{
    int length;
    int breath;
    public void setDim(){
        int A= length *breath;
        System.out.println("The Area Of The Rectangle Is: "+A);
    }
    public int getArea(int l,int m){
        length=l;
        breath=m;
        int A=length*breath;
        return A;

    }

}
