package Arrayprogramms;

import java.util.Arrays;

public class Diffmethds {
    // arrays.tostring()method
    public static void main(String[] args) {
        boolean[] boolarr=new boolean[] {true,true,false,false};
        char[] chararr= new char[]{'w','a','r','r','i','o','r','s'};
        double[] dblarr =new double[]{1.2,3.2,2.2};
        int[] intarr=new int[]{1,2,3};
        System.out.println("boolean array : " + Arrays.toString(boolarr));
        System.out.println("character array : " + Arrays.toString(chararr));
        System.out.println("double array : " + Arrays.toString(dblarr));
        System.out.println("integer array : " + Arrays.toString(intarr));
    }
    
    
}



// using stringbuilder append(char[])
class sb1{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("warriors ready to fight");
        System.out.println(sb);
        char[] ss=new char[] {'c','h','a','l','l','e','n','g','e','r','s'};
        sb.append(ss);
        System.out.println("after appending : "   +   sb );
    }
}
class sb2{
    public static void main(String[] args) {
        int[] stringarray={'a','b'};
        //boolean b=Arrays.asList(stringarray).contains("a");
        System.out.println(stringarray);
    }
}
