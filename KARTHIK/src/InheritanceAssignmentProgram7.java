public class InheritanceAssignmentProgram7 {
    public static void main(String[] args) {
        Mycount obj=new Mycount();
        obj.count();
    }
    
}
class Counter{
    int i=0;
    public void Increment(){
        i++;
    }
}
class Mycount extends Counter{
    int Mycount;
    public Mycount(){
        Mycount=0;
    }
    public void count(){
        super.Increment();
        Mycount++;
        super.Increment();
        Mycount++;
        super.Increment();
        Mycount++;
        System.out.println("i="+Mycount);

    }
}