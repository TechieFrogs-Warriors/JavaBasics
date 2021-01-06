import java.util.Scanner;

public class MethodExerciseProgram1 {
    public static void main(String[] args) { 
        PrintNumber testObj=new PrintNumber();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Value: ");
        int n1=scan.nextInt();
        
        System.out.println("Enter String Value: ");
        String n2=scan.next();
       
        System.out.println("Enter Double Value: ");
        double n3=scan.nextDouble(); 
        
        System.out.println("Enter float Value: ");
        float n4=scan.nextFloat();
        
        testObj.printN(n1);
        System.out.println(n1);
        
        testObj.printN(n2);
        System.out.println(n2);
        
        testObj.printN(n3); 
        System.out.println(n3); 
        
        testObj.prinrN(n4);
        System.out.println(n4);
        scan.close();
    } 
}    

class PrintNumber{
    public  int printN(int a){  
        int b,c=25;
        b=a+c;
        System.out.println("The Intger Value Is: "+b);
        return b;
    }
    public  String printN(String b){
        String a="Karthik";
        if (a!=b){
        System.out.println("The String Value Is: "+a);
        }
        return a;
    }
    public  double printN(Double c){
        Double d=895557845855555454.8554554d;
        if(c<=d)
        System.out.println("The Double Value Is: "+c);
        return c;
    }
    public  float prinrN(float d){ 
        float a=5878546548646.544681151f;
        if (a<=d)
        System.out.println("The float Value Is "+d);
        return d;
    }

}

