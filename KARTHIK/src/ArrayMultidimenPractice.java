public class ArrayMultidimenPractice {
    public static void main(String[] args) {
        //initilization of 2-D Array
        int a[][]=new int[2][2];//NegativeArraySizeException: -2
        a[0][0]=5;
        a[0][1]=10;
        a[1][0]=15;
        a[1][1]=20;
        System.out.println("Length of the Array: "+a.length);
        if((a[1][1])/4==a[0][0]){
            System.out.println(a[1][1]+" is divisable by "+a[0][0]);
        }

        //print the values in the 2-D array
        int b[][]={{1,2},{3,4}};
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        //jagged arrays
        System.out.println("jagged Array: ");
        int c[][]=new int[3][];
        c[0]=new int[5];
        c[1]=new int[10];
        c[2]=new int[15];
        int count=0;
        //value Assigning of an array
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                c[i][j]=count++;
            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        //class name of an array
        System.out.println("Class Name Of the array: ");
        int d[][]={{1,2,3},{4,5,6}};
        Class c1=d.getClass();
        String Name=c1.getName();
        System.out.println("Class Name: "+Name);

        //copying Array:
        int e[]={'a','b','c','d','e','f'};
        int f[]=new int[3];
        System.arraycopy(e, 1, f, 0, f.length);
        //print the copy of e
        System.out.println(String.valueOf(f));

        //Cloning of an Array:
        System.out.println("cloning of ana array: ");
        int g[]={1,2,3};
        for(int ch:g){
            System.out.print(ch+" ");
        }
        int h[]=g.clone();
        System.out.print("After Clone");
        for(int ch1:h){
            System.out.println(ch1+" ");
        }
        System.out.println(g==h);

        //string example
        System.out.println("String 2-D array: ");
        String k[][]={{"raj","ram","jar"},{"pen","dim","rim"}};
        for(int i=0;i<k.length;i++){
            for(int j=0;j<k[i].length;j++){
                System.out.print(k[i][j]+"  ");
            }
            System.out.println();
        }

        int m[]=new int[]{1,2,3,4,5};
        int n[]=new int []{2,3};
        n=m;
        System.out.println(n.length+" "+n[4]);
        
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]+" ");
        }

    }
}
