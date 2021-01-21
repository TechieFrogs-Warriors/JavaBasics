public class InheritanceAssignmentProgram8 {
    public static void main(String[] args) {
        B1 obj=new B1();
        obj.Show();
    }
    
}
class A10{
    int i;
    int j;
    public A10(){
        i=5;
        j=88;
    }
    public void Show(){
        System.out.println("Value Of I:"+i);
        System.out.println("Value Of J:"+j);
    }
}
class B1 extends A10{
    int k;
    public B1(){
        this.k=5;
    }
    public void Show(){
        super.Show();
        System.out.println("Value Of K:"+k);
    }

}