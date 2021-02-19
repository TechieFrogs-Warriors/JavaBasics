public class MEth {
    public static void main(String[] args) {
        
        abc obj1=new abc();
       // abc obj2=new abc(10);
        //abc obj3=new abc(20, 30);
        
       
    }
   
    
}
class abc extends bcd {
    public abc(){
        this(1);
        System.out.println("default constructor");
    }
    void display(){

    }
    public abc(int x){
        this(2,3);
        //x=50;
        System.out.println("constructor with one parameter" +x);
    }
    public abc(int x, int y){
        //x=20;
        //y=30;
        System.out.println("constructor with two parameters");

    }
    
}

class bcd{
    public bcd(){
        System.out.println("default");
    }
}

