package ExceptionHandling;

public class OverloadMethods8 extends Number{
    public static void main(String[] args) {
        try{
            System.out.println(method(55.66d,99.02547d));
            System.out.println(method(true));
            System.out.println(method(59, 67));
            System.out.println(method(198));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Number Doesnot Divided by 0");
        }
    }
}
class Number{
    static double method(double x, double y){
        return x+y;
    }
    static int method(int x, int y){
        return x-y;
    }
    static boolean method(boolean a){
        return !a;
    }
    static float method(int n) throws Exception{
        return n/0;
    }
}
