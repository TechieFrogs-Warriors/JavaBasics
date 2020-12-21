public class Newoperators 
{
 public static void main(String[] args) 
 {
     //unary operators
     System.out.println("UNARY OPERATORS");
     int a = 19;
     System.out.println("post increment " +(a++));
     System.out.println("pre incremenet"  +(++a));
     System.out.println("post decrement"  +(a--));
     System.out.println("pre decrement"   +(--a));
     System.out.println("both pre " +(++a + --a));
     System.out.println("both post" +(a-- + a++));

     //operator ~ and !
     System.out.println("OPERATORS ~ AND !");
     int b = -8;
     int c = 19;
     boolean d = false;
     boolean e = true;
     System.out.println("tlide    negitive " +(~b));
     System.out.println("tlide    positive " +(~c));
     System.out.println("not "               +(!d));
     System.out.println("not "               +(!e));

     //arithmetic operators
     System.out.println("ARITHMETIC OPERATORS");
     int f = 19;
     int g =  8;
     System.out.println("addition"          +(f+g));
     System.out.println("substraction "     +(f-g));
     System.out.println("multiplication "   +(f*g));
     System.out.println("division "         +(f/g));
     System.out.println("modulus "          +(f%g));
     
     //logical operations
     System.out.println("LOGICAL OPERATORS");
     int h = 8;
     int i= 19;
     System.out.println("left shift "      +(h<<i));
     System.out.println("right shift"      +(h>>i));
     System.out.println("logical and "+(h<i && h>i));
     System.out.println("bitwise and " +(h<i & h<i));
     System.out.println("logical or " +(h<i || h>i));
     System.out.println("bitwise or "  +(h<i | h>i));
     
     //assignment operators 
     System.out.println("ASSIGNMENT OPERATORS");
     int j = 19;
     short k =10;
     System.out.println("assign " +(j+=7));
     System.out.println("assign " +(k-=5));
     System.out.println("assign "+(j=j+k));
     System.out.println("tlide "    +(~k));

     //ternary operator
     System.out.println("TERNARY OPERATORS");
     int l=8;
     int m=19;
     int n;
     System.out.println( "ternary " +(n=(((l+m)<19)?l:m)));
    
     //comparison operator
     System.out.println("COMPARISON OPERATORS");
     int o = 12;
     int p = 17;
     System.out.println("equal to "           +(o==p));
     System.out.println("less then or equal"  +(o<=p));
     System.out.println("grater then or equal"+(o>=p));
     System.out.println("grater then "         +(o>p));
     System.out.println("less then "           +(o<p));
     System.out.println("not equal "          +(o!=p));

    
 }
    
}
