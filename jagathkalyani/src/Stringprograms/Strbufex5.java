package Stringprograms;

public class Strbufex5 {
    public static void main(String[] args) {
     StringBuffer str=new StringBuffer("warriors ready to fight");
     System.out.println(" string = " + str);
     int index=str.indexOf("to");//using indexof
     System.out.println(" index of 'to' : " + index);

     StringBuffer str1=new StringBuffer("warriors ready to fight");
     System.out.println(" string = " + str1);
     int x=str1.indexOf("for");//using indexof but for is out of string so output will be -1
     System.out.println(" index of 'to' : " + x);


     StringBuffer str2=new StringBuffer("warriors ready to fight");
     System.out.println(" string = " + str2);
     int i=str.indexOf("to",21);//using indexof but to is greater than the index value 21 so output will be -1
     System.out.println(" index of 'to' : " + i);


    }
    
}
