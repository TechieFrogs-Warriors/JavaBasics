import MyProgram.*;
public class EncaptulationPracticeProgram2 extends EncaptulationPracticeProgram1 {
    public static void main(String[] args)
     {
        Rectangle3 obj=new Rectangle3(6,8);
        obj.getArea(8,8);
        EncaptulationPracticeProgram2 obj1=new EncaptulationPracticeProgram2();
        obj1.setMarks(85);
        System.out.println("Marks Of The Student:"+obj1.getMarks());
        
    }
    
}
class Rectangle3{
    int a;
    int b;
    Rectangle3(int a,int b){
       this. a=a;
       this. b=b;
    }
    public void getArea(int e,int d){
        if(e==d){
            System.out.println("Both Are Same:"+e);
        }

        int c=a*b;
        System.out.println("Area oF The Rectanle is:"+c);
    }

    
}
