public class PracticeProgramOnClassAndObject5 {
    public static void main(String[] args) {
        Rectangle obj1=new Rectangle(4,5);
        Rectangle obj2=new Rectangle(5,8);
        System.out.println("Area Of The 1st Rectangle: "+obj1.Area());
        System.out.println("Area Of The 2nd Rectangle: "+obj2.Area());
    }
}
class Rectangle{
    int length;
    int breath;
    Rectangle(int l,int b){
        length=l;
        breath=b;
    }
    public int Area(){
        int A=length*breath;
        return A;
    }
}