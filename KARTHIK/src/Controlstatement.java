public class Controlstatement {
     public static void main(String[] args) {
     System.out.println("IF STSTEMENT.....");
     int TEMP = 100;
     if(TEMP>80){
     System.out.println("too sunny");
     }
   
    int a = 24;
    int b = 20;
    System.out.println("IF ELSE STATEMENT.....");
     if (a > b) {
     System.out.println("a is grater than b");
     }    
     else {
     System.out.println("b is grater then a");
     }
     System.out.println("NESTED IF....");
     int c = 10; 
      if (c == 10) { 
            if (c < 15) 
                System.out.println("c is smaller than 15"); 
 
            if (c < 12) 
                System.out.println("c is smaller than 12"); 
            else
                System.out.println("c is greater than 15"); 
        } 
        System.out.println("ELSE IF LADDER....");
        int d = 19;
        int f =  8; 
  
        if (d == f ) 
            System.out.println("both are same"); 
        else if (d > f) 
            System.out.println("d is bigger than f"); 
        else if (d < f) {
            System.out.println("d is less than f"); 
            System.out.println("d is smaller");
        }
        else
            System.out.println("please give values"); 
        
            System.out.println("SWITCH....");
            char z = 'j';
            String size;
            switch (z) {
            case 'k':
            size = "shallow";
            break;
            case 'l':
            size = "deep";
            break;
            case 'j':
            size = "deapth";
            break;
            case 'n':
            size = "height";
            break;
            default:
            size = "Unknown";
            break;
        
            }
            System.out.println("Size: " + size);
            

            System.out.println("if statement");
            String language = "Java";
            if (language == "Java"){
            System.out.println("Best Programming Language");
            }
            System.out.println("IF-ELSE-IF.....");{
            int marks=55;
            if(marks >= 80)
            System.out.println("DISTINCTION");
            else if(marks >=35)
            System.out.println("PASS");
            else
            System.out.println("FAIL");
            }
          
           
        

    }
}

    
    
 
