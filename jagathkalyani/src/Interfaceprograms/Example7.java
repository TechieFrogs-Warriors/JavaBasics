package Interfaceprograms;

public class Example7 {
    
}
interface A{
    public void x();
}
interface B{
   public int x();
}
class C implements A,B{
    public void x(){ //error--------two interfaces have same method name with diff return types

    }
    public int x(){

    }
    public static void main(String[] args) {
       // System.out.println(x);
        System.out.println(A.x);
        System.out.println(B.x);
    
    }
