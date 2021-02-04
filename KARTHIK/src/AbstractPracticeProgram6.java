public class AbstractPracticeProgram6 {
    public static void main(String[] args) {
        Area2 obj=new Area2();
        obj.RectangleArea(5.5f, 8.9f);
        obj.SquareArea(8.3f);
        obj.CircleArea(4.6f);
    }
    
}
abstract class Shape2{
    abstract float RectangleArea(float length,float breath);
    abstract float SquareArea(float side);
    abstract float CircleArea(float radius);
}
class Area2 extends Shape2{
    float RectangleArea(float length, float breath) {
        System.out.println("Area Of The Rectangle: "+length*breath);
        return 0;
    }
    float SquareArea(float side) {
        System.out.println("Area Of The Square: "+side*side);
        return 0;
    }
    float CircleArea(float radius) {
        System.out.println("Area Of The Circle: "+Math.PI*radius*radius);
        return 0;
    }

}
