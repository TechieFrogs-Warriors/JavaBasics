public class AbstractPracticeProgram3 {
    public static void main(String[] args) {
        A5 obj1=new A5(90,85,89);
        obj1.getPercentage();
        B3 obj2=new B3(89,45,78,69);
        obj2.getPercentage();
    }
    
}
abstract class Marks{
    abstract int getPercentage();
}
class A5 extends Marks{
    int s1;
    int s2;
    int s3;
    public
     A5(int s1,int s2,int s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    public int getPercentage(){
        float Percentage=((s1+s2+s3)/3);
        System.out.println("Percentage Of The Student A: "+Percentage);
        return 0;
    }
}
class B3 extends Marks{
    int s1,s2,s3,s4;
    public B3(int s1,int s2,int s3,int s4){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=s4;
    }
    public int getPercentage(){
        float Percentage=(s1+s2+s3+s4)/4;
        System.out.println("Percentage Of The Student B: "+Percentage);
        return 0;
    }
}