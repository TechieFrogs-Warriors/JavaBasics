package Stringprograms;

public class Strbufex4 {
    public static void main(String[] args) {
       //using reverse 
     StringBuffer str=new StringBuffer("warriors ready to fight");
     System.out.println(" string = " + str);
     str.reverse();//using reverse
     System.out.println( str);



      // using del()  and delchar()
      StringBuffer s=new StringBuffer("warriors ready to fight");
      System.out.println(" string = " + s);
      s.delete(22,23);//using delete
      System.out.println( s);
      s.deleteCharAt(9);//using deletechar
      System.out.println( s);

 


        
    }
    
}
