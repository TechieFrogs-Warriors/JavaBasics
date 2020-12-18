public class OperatorProgram {

    public static void main(String[] args) {
        System.out.println("********ARITHMATIC OPERATION OUTPUT********");
        //ARITHMATIC OPERATIONS
        int a=500;int b=10;int c;
        System.out.println("Arithmatic Addition of a+b = " +(c=a+b));
        System.out.println("Arithmatic Subtraction of a-b = " +(c=a-b));
        System.out.println("Arithmatic Multiplication of a*b = " +(c=a*b));
        System.out.println("Arithmatic Division of a/b = " +(c=a/b));
        System.out.println("Arithmatic Modulus of a%b = " +(c=a%b));

        System.out.println("********UNARY OPERATIONS OUTPUT*******");

        //UNARY OPERATIONS
        int k=45;boolean n=false;int j=-45;
        System.out.println("Print first and then increment = "+(k++));
        System.out.println(k);
        System.out.println("Increment first and then print = "+(++k));
        System.out.println(k);
        System.out.println("Print first and then decrement = "+(k--));
        System.out.println(k);
        System.out.println("Decrement first and then print = "+(--k));
        System.out.println("Negate = "+(~k));
        System.out.println("Negate = "+(~j));
        System.out.println("Not operator = "+(!n));

        System.out.println("********SHIFT OPERATION OUTPUT*******");
        //SHIFT OPERATORS
        int d=8;int e=2;int f;
        System.out.println("Left shift operation = "+(f=d<<e));
        System.out.println("Right shift operation = "+(f=d>>e));

        System.out.println("*******BITWISE AND LOGICAL OPERATORS AND & RELATIONAL OPERATORS*********");
        //BITWISE AND LOGICAL OPERATORS & RELATIONAL OPERATORS
        int s=5;int t=6;int u=2;
        System.out.println("Bitwise AND(&) = "+(t<s&t++<u));
        System.out.println(t);
        System.out.println("Logical AND(&&) = "+(s>t&&t++<u));
        System.out.println(t);//did'nt check second condition.so not incremented.
        System.out.println("Bitwise OR(|) = "+(s>t|++t>u));
        System.out.println(t);
        System.out.println("Logical OR(||) = "+(s>t||t++>u));
        System.out.println(t);

        System.out.println("*******Assignment Operation Output********");
        //ASSIGNMENT OPERATORS 
        int p=3;int q=8;
        System.out.println("Addition Assignment = "+(p+=7));
        System.out.println("Addition Assignment = "+(p+=q));
        System.out.println("Subtraction Assignment = "+(q-=p));
        System.out.println("Subtraction Assignment = "+(p-=2));
        System.out.println("Multiplication Assignment = "+(p*=q));
        System.out.println("Divison Assignment = "+(p/=q));
        System.out.println("Modulus Assignment = "+(q%=p));
        System.out.println("Equal Assignment = "+(p==q));

        System.out.println("********TERNARY OPERATION OUTPUT**********");
        //TERNARY OPERATOR
        int x=80;int y=50;int sum;
        sum=((x+y)<100)?x:y;
        System.out.println(sum);
        
        

        




       
   }
        
    
    
}
