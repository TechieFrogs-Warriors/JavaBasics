public class ConstructorProgram1 {
    public static void main(String[] args) {
        Temp obj1=new Temp(85, "*******");
        System.out.println(obj1.value+"   "+obj1.Name);
        Temp obj2=new Temp(8567);
        obj2.display();
        Temp obj3=new Temp(979797, 4677.889f);
    }
}
class Temp{
    int value;
    String Name;
    Temp(int a){
        value=a;
    }
    void display(){
        System.out.println("Value Of a Is: "+value);
    }
    

    Temp(int a, String s) {
        value=a;
        Name=s;
    }
    Temp(int a,float b){
        System.out.println("Value of a Is:"+a);
        System.out.println("Value Of b Is: "+b);
    }


}