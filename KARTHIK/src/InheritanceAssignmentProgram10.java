public class InheritanceAssignmentProgram10 {
    public static void main(String[] args) {
        Banana obj=new Banana();
        obj.show();
    }
    
}
class Apple{
    int number_of_items=75;
}
class Banana extends Apple{
    int number_of_items;
    public Banana(){
        this.number_of_items=25;
    }
    public void show(){
        System.out.println("No Of Apples:"+number_of_items);
        System.out.println("No of Bananas:"+super.number_of_items);
    }
}
