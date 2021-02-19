public class PracticeProgramOnClassAndObject4_ {
    public static void main(String[] args) {
        Triangle obj1=new Triangle(3,4,5,2);
        obj1.show();
        Triangle obj2=new Triangle(3,4,5);
        obj2.display();
       //System.out.println("Area Of Triangle: "+obj2.Area);
    }
    
}
class Triangle{
    //for parimeter of Triangle
    Triangle(int a,int b,int c,int d){
        double p=(a+b+c)/d;
        System.out.print(p);
    }
    void show(){
        System.out.println(" :Is The Perimeter Of The triangle");
    }
    // for area of Triangle
    Triangle(int a,int b,int  c){
        int p=(a+b+c)/2;
        double Area=(p*(p-a)*(p-b)*(p-c));
        System.out.print(Area);
    }
    void display(){
        System.out.println(" :Is The Area Of The triangle");
    }
}