import java.util.Scanner;

public class ConstructorProgram4 {
    public static void main(String[] args) {
        Add obj1=new Add();
        obj1.show();

    }
    
}
class Add{
    int z,x;
    Add(int a){
        x=a;
        Scanner scan=new Scanner(System.in);
       int Number;//validation part
        do{
            System.out.println("Enter Integer Value:");
            while(!scan.hasNextInt()){
                System.out.println("Please Enter Integer Value:");
                scan.next();

            }
            Number=scan.nextInt();
        }
        while(Number<=0);
        z=Number;
        scan.close();
    }
    void show(){
        System.out.println("Output Pattern");
    }
     Add(){
         this(65);
        int b,c;
        for(b=0;b<=z;b++){
            for(c=0;c<=b;c++){
                System.out.print((char)(x+c)+" ");
            }
            System.out.println();
        }

    }
}
   