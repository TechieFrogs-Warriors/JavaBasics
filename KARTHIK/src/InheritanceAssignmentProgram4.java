public class InheritanceAssignmentProgram4 {
    public static void main(String[] args) {
        Square3 obj=new Square3(6.2f);
        obj.Area();
        obj.Perimeter();

    }
    
}
class Rectangle4{
    float length;
    float breath;
    public Rectangle4(){

    }
    public Rectangle4(float length,float breath){
        this.length=length;
        this.breath=breath;
    }
    public void Area(){
        float Area=length*breath;
        System.out.println("Area Of The Rectangle: "+Area);
    }
    public void Perimeter(){
        float Perimeter=(length+breath)*2;
        System.out.println("Perimeter Of The Rectangle: "+Perimeter);
    }

}
class Square3 extends Rectangle4{
    float Side;
    public Square3(float side){
        super(side, side);
        this.Side=side;
    }
    public void Area(){
        super.Area();
        float Area=Side*Side;
        System.out.println("Area Of The Square: "+Area);
    }
    public void Perimeter(){
        super.Perimeter();
        float Perimeter=4*Side;
        System.out.println("Perimeter Of The Square: "+Perimeter);
    }

}
