import javax.lang.model.util.ElementScanner14;

public class Conditional1 {
    public static void main(String[] args) {
        int age=18;
        double height=7.2;

        if(age <18 || height <= 5.0){
            System.out.println("you are not eligible for course");
        }
        else{
            if(age<=60 & height <=6.3){
                System.out.println("you are eligible");
                System.out.println("please fill your form");
            }
            else{
                System.out.println("you are not eligible");
            }
        }
            
        
    }

}
