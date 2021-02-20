

public class Compilepolymerism {
    public static void main(String[] args) {
        Value obj= new Value();
        System.out.println(obj.add(5,5));
        System.out.println(obj.add(5,5,5));
        System.out.println(obj.add(5,55.5));
        System.out.println(obj.add(1000.5,5));
       
    }
    
}
class Value{
    public int add(int x,int y){
        return x+y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public int add(double x,int y){
        return (int)x+y;
    }
    public int add(int x,double y){
        return x+(int)y;
    }
}

