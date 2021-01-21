public class InheritanceAssignmentProgram2 {
    public static void main(String[] args) {
        Parent obj=new Parent();
        obj.ParentClass();
        Child obj1=new Child();
        obj1.ChildClass();
        obj1.ParentClass();
    }
    
}
class Parent{
    private void ParentClass(){
        System.out.println("This is parent class");
    }
}
class Child extends Parent{
    public void ChildClass(){
        System.out.println("This is child class");
    }
}