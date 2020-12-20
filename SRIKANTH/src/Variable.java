public class Variable {
    public static void main(String[] args){
        int x=25;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
        int a=8;
        int b=7;
        System.out.println(a++ + ++a);
        System.out.println(b++ + b++);
        int e=10;
        int f=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~e);
        System.out.println(~f);
        System.out.println(!c);
        System.out.println(!d);
        int p=10;
        int q=5;
        System.out.println(p+q);
        System.out.println(p-q);
        System.out.println(p*q);
        System.out.println(p/q);
        System.out.println(p%q);
        int i=10;
        int y=5;
        int z=20;
        System.out.println(i<y&&i<z);
        System.out.println(i<y&i<z);
        int m=10;
        int n=5;
        int o=20;
        System.out.println(m<n&&m++<o);
        System.out.println(m);
        System.out.println(m<n&m++<o);
        System.out.println(m);
        
    }
    
}
