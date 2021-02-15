public class UpCastingPractice {
    public static void main(String[] args) {

        //upcasting 
        BranchB obj=new BranchB();
        obj.student();//call with in the class
       // obj.Student2();
       // obj.Student1();
       BranchA obj1=new BranchB();
       obj1.student();//call child class method
       Myclass obj2=new BranchA();
       obj2.student();//call child class method
       //obj2.display();//its not possible in upcasting to call the child class method

       //Down Casting
       BranchA obj3=(BranchA)obj2;
       obj3.display();//it prints unique method dispaly in Child class

    }
}
class Myclass{
     void student(){
        System.out.println("No.of Students in a Myclass is:"+85);
    }
}
class BranchA extends Myclass{
     void student(){
        System.out.println("Students In Branch a is: "+43);
    }
    void display(){
        System.out.println("2nd Method in BranchA");
    }
}
class BranchB extends BranchA{
     void student(){
        System.out.println("Students in Branch b is: "+42);
    }
}