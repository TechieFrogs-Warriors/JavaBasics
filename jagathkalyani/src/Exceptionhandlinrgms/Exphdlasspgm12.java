package Exceptionhandlinrgms;

public class Exphdlasspgm12 {
    public static void main(String[] args) {
        try 
        { 
            Class.forName("warriors"); //to call class class.forname()  or loadclass() can use
        } 
        catch (ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException");
        } 
    }
    
}
