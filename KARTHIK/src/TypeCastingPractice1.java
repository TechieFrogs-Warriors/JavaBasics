

public class TypeCastingPractice1 {
    public static void main(String[] args) {
        //refernce child class method
        Fruit obj=new Apple1();
        obj.show();//it shows child class show method only
        System.out.println("Variable a:"+ obj.a);

        try{
            Fruit obj1=new Fruit();
            Apple1 obj2=(Apple1)obj1;
            obj2.dispaly();
        }
        catch(ClassCastException e){
            System.out.println("class cast Exception****"+e);
        }
        

        //calling unique method in child calss
        Apple1 obj3=(Apple1)obj;
        obj3.dispaly();//prints display method in child class
        System.out.println("variable b: "+obj3.b);

        //instance of
        if(obj instanceof Apple1){
            Apple1 obj4=(Apple1)obj;
            obj4.dispaly();
        }
        //Down Casting
        ((Apple1)obj).dispaly();//calling unique method
        System.out.println("Variable B: "+((Apple1)obj).b);

        Apple1 obj5=new Apple1();
        obj5.show();//child class object call child method only both contains same methods
    }
}
//Base Class
class Fruit{
    int a=10;
    public void show(){
        System.out.println("Fruit is a parent class");
    }
}
//Child Class
class Apple1 extends Fruit{
    int b=10;
    public void show(){
        System.out.println("Apple is a Child class of Fruit class");
    }
    public void dispaly(){
        System.out.println("Display is the unique method in the Apple child class");
    }
}
