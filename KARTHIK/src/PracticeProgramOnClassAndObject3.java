public class PracticeProgramOnClassAndObject3 {
    public static void main(String[] args) {
        Triangle1 obj=new Triangle1();
        obj.a=3;
        obj.b=4;
        obj.c=5;
        System.out.println("Area Of The Triangle: " +obj.Area());
        System.out.println("Perimeter Of The Triangle: "+obj.Perimeter());
    }
    
}
class Triangle1{
    int a,b,c,d;
    public int Perimeter(){
        int P=(a+b+c)/2;
        return P;
    }
    public int Area(){
        int p=(a+b+c)/2;
        int A=(p*(p-a)*(p-b)*(p-c));
        return A;
    }
}