public class InheritancePracticeProgram4 {
    public static void main(String[] args) {
        A2 obj=new A2(2);
        System.out.println("Radius Of The Circle: "+obj.Radius);
    }
    
}
class A1{
    int radius=5;
    float pi=3.14f;
    public A1(){
        this(5, 4);
        float Area=pi*radius*radius;
        System.out.println("Area Of The Circle: "+Area);
    }
    public A1(int a,int b){
        if (a!=b){
            int Diameter=2*radius;
            System.out.println("Diameter Of The Circle: "+Diameter);
        }

    }
}
class A2 extends A1{
    int Radius=5;
    float Pi=3.14f;
    public A2(int a){
        float Circumference=2*Pi*Radius;
        System.out.println("Circumference Of The Circle: "+Circumference);
    }
}
