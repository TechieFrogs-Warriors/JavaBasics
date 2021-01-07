public class MethodExcerciseProgram8 {
    public static void main(String[] args) {
        A.print();
        B.print();
    }  
}
class A{
    public static void print(){
        String str="Parent";
        System.out.println("String Is:"+str);
    }
}
class B{
    public static void print(){
        String str="Child";
        System.out.println("String Is:"+str);
    }
}
