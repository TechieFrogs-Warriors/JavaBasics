package Exceptionhandlinrgms;

public class Exphdlasspgm14 {
    public static void main(String[] args) {
        int marks[]={40,50,60};
            try{
            marks[5]=20;
           
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }

    }
    
}
