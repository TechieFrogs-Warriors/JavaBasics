public class ClassProgram {
    public static void main(String[] args) {
        outerOne obj1=new outerOne();
        outerOne.innerOne obj2=obj1.new innerOne();
        obj2.print();
    }
    
}
class outerOne{
    int Number;
    class  innerOne{
        void print(){
            System.out.println("*******Hi This is Karthik*******");
        }
    }
}
