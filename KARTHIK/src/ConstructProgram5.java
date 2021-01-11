public class ConstructProgram5 {
    public static void main(String[] args) {
        Number n=new Number();
        System.out.println("Value of N: "+" "+n.i);
        Number n2=new Number();//copy constructor
        System.out.println("Value Of N: "+n2.i);
        
    }
    
}
class Number{
    int i=10;
     Number(){
        
    }
    Number(Number n){
        i= n.i;

    }
}