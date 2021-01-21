public class AccessModifiersPracticeProgram1 {

    public static void main(String[] args) {
        Square obj=new Square();
        obj.Square1();
        obj.display();
    }
    
}
class Triangle2{
    int a=10;
    protected void display(){
        System.out.println(a);
    }
}
class Square extends Triangle2{
    void Square1(){
        int a=90;int b=0;
        b=a*a;
        System.out.println("Area Of The Square: "+b);
    }
}
