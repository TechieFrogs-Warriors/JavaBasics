import java.util.Arrays;

public class ArrayPracticeprogram {
    public static void main(String[] args) {
        //Array declaration
        System.out.println("Array declaration: ");
        int a[]=new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        for(int i=0;i<a.length;i++){
            System.out.println("Value of Arrays: "+a[i]);
        }
        //int b[]=new int[-2];//java.lang.NegativeArraySizeException: -2
        //b[-1]=1;//Index -1 out of bounds for length 2

        //Anonymous  array declaration
        System.out.println("Anonymous  array declaration: ");

        System.out.println(new int[]{1, 2, 3, 4, 5}.length); 
  
        System.out.println(new int[]{21, 14, 65, 24, 21}[1]);

        //value assigning of same type not depend on size of array
        int c[]=new int[10];
        int d[]=new int[100];
        c=d;
        System.out.println("lengthof c:"+c.length);
        d=c;
        System.out.println("length of d: "+d.length);

        int[] e={1,2,3};
        for(int i=0;i<e.length;i++){
            System.out.println(e[i]);
        }

        //copying of array using for loop
        System.out.println("copying of array using for loop: ");
        int f[]=new int[e.length];
        for (int i=0;i<e.length;i++){
             f[i]=e[i];
             System.out.println(f[i]);
        }
        //copying of array using copy of method
        System.out.println("copying of array using copy of method: ");
        int g[]={12,56,43};
        int h[]=Arrays.copyOf(g, g.length);
        for(int i=0;i<g.length;i++){
            System.out.println(h[i]);
        }
        //copying of array using clone();
        System.out.println("copying of array using clone(): ");
        int i[]={78,54,43};
        int j[]=i.clone();
        for(int k=0;k<i.length;k++){
            j[k]=j[k];
            System.out.println(j[k]);
        }
        //for each 
        System.out.println("for each: ");
        for(int ch1: i){
            System.out.println(ch1);
        }
    }
}

