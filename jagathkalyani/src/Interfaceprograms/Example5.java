package Interfaceprograms;

public class Example5 {
    
}
interface A{
    int x=10;
}
interface B{
    int x=100;
}
class C implements A,B{
    public static void main(String[] args) {
       // System.out.println(x);
        System.out.println(A.x);
        System.out.println(B.x);
    
    }
    

    

    
}