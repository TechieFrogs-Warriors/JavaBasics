public class ConstructorProgram3 {
    public static void main(String[] args) {
        Even obj1=new Even(75);
        obj1.show();
        
    }
    
}
class Even{
    Even(){
        System.out.println("Two Diffrent Programs Result");
    }
    int i,j,k;
    Even(int a){
        this(5,10);
        i=a;
        if (a%2==0){
            System.out.print("Given Value Is Even: ");
        }
        else {
            System.out.print("Given Value Is Not Even: ");
        }
    }
    void show(){
        System.out.println(i);
    }
    Even(int a,int b){
        this();
        if(a>=b){
            System.out.println("a Is Bigger");
            j=a;
        }
        else{
            System.out.println("b Is Bigger");
            j=b;
        }
    }

}

