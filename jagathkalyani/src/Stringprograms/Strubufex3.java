package Stringprograms;

public class Strubufex3 {
    public static void main(String[] args) {
        //string buffer using insert()
        //syntax: 
        //str.insert(int position,char x);
        //str.insert(int position,boolean x);
        //str.insert(int position,float x);
       // str.insert(int position,double x);
        //str.insert(int position,long x);
        //str.insert(int position,int x);
        //str.insert(int position,char[] x);
       
       
       // StringBuffer str=new StringBuffer("warriors ready to fight");// using boolean
       // System.out.println(" string = " + str);
        //str.insert(8,'true');//inserting true in 8 place
        //System.out.println(" after insertion = " + str); 



       // StringBuffer str=new StringBuffer("warriors ready to fight");// using char
        //System.out.println(" string = " + str);
        //str.insert(8,'f');//inserting f in 8 place
        //System.out.println(" after insertion = " + str);



        //StringBuffer str1=new StringBuffer("warriors ready to fight");// using chararray
        //System.out.println(" string = " + str1);
        //char chararray[]={'a','b','c'};
        //str1.insert(8,chararray);//inserting abc in 8 place
        //System.out.println(" after insertion = " + str1);



       //StringBuffer str=new StringBuffer("warriors ready to fight");// using float
        //System.out.println(" string = " + str);
        //str.insert(8, 89.56f);//inserting 89.56f in 8 place
        //System.out.println(" after insertion = " + str);



       // StringBuffer str=new StringBuffer("warriors ready to fight");// using long
        //System.out.println(" string = " + str);
        //str.insert(8,267945665l);//inserting 267945665l in 8 place
        //System.out.println(" after insertion = " + str);



        //StringBuffer str=new StringBuffer("warriors ready to fight");// using int
        //System.out.println(" string = " + str);
        //int x=35;
        //str.insert(8,x);//inserting 35 in 8 place
        //System.out.println(" after insertion = " + str);



        StringBuffer str=new StringBuffer("warriors ready to fight");// using all synatxes
        System.out.println(" string = " + str);
        int x=35;//using int
        str.insert(8,x);
        System.out.println( str);
        str.insert(8," for ");//using char
        System.out.println( str);
        str.insert(8,true);//using boolean
        System.out.println(str);
        str.insert(8,54.22d);//using double
        System.out.println(str);
        str.insert(8,11.2f);//using float
        System.out.println(str);
        char d_arr[]={'f','o','r'};
        str.insert(8,d_arr);//using char arr
        System.out.println(str);

        






    }
    
}
