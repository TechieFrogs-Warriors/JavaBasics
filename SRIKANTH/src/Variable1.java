public class Variable1 {
    public static void main(String[] args){
    int a=10;
    int b=5;
    int c=20;
    System.out.println(a>b||a<c);
    System.out.println(a>b|a<c);
    System.out.println(a>b||a++<c);
    System.out.println(a);
    System.out.println(a>b|a++<c);
    System.out.println(a);
    int d=2;
    int e=3;
    int min=(d<e)?d:e;
    System.out.println(min);
    int p=10;
    int q=20;
    p+=4;
    q-=4;
    System.out.println(p);
    System.out.println(q);
    short m=10;
    short n=10;
    m=(short)(m+n);
    System.out.println(m);
    }}

