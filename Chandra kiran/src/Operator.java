public class Operator {
    public static void main(String[] args) {
        int  x=30,y=70,z=-50,l=20,m=40;
        boolean a=true,b=false;
        System.out.println("x value is "+(++x));
        System.err.println(x);
        System.out.println("x value is "+x++);
        System.out.println(x);
        System.out.println("y value is "+--y);
        System.out.println(y);
        System.out.println("y value is "+y--);
        System.out.println(y);
        System.err.println("negation");
        System.out.println(~x);
        System.out.println(~z);
        System.out.println(!a);
        System.out.println(!b);
        System.out.println("Arthematic operations");
        System.out.println(m+l);
        System.out.println(m-l);
        System.out.println(l*m);
        System.out.println(m/l);
        System.out.println(m%l);
        System.out.println("Right shift and Left shift");
        System.out.println(l<<3);
        System.out.println(m>>5);
        System.out.println("logical and and bitwise and");
        System.out.println(l>m&&m++>l);//false&&m=40
        System.out.println(m);//expected 41 but second condition is not verified so m=40
        System.out.println(l-->m&m>l);//false&true l=20
        System.out.println(l);//l=19
        System.out.println("logical or and bitwise or");
        System.out.println(l>m||m++>l);//false||true m=40
        System.out.println(m);//41
        System.out.println(l--<m|m<l);//true|false l=20
        System.out.println(l);//l=19
        System.out.println("Assignment");
        System.out.println(l+=30);
        System.out.println(m-=20);
short p=100;
short q=50;
p+=q;
System.out.println(p);
System.out.println("comparision ");
System.out.println(p>q);
System.out.println(p<q);
System.out.println(p>=q);
System.out.println(p<=q);
System.out.println(p!=q);
System.out.println(p==q);


    }
    
}
