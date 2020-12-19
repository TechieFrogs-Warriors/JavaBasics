public class Controlstatementprogram2 {
    public static void main(String[] args) {
        System.out.println("IF ELSE....");
        int temp = 30;
        int humidity =88;
        if(temp>30 && humidity<100){
            System.out.println("too sunny");
        }
        else{
            System.out.println("its cool");
        }
        System.out.println("NESTED IF....");
        int c = 10;
        if (c == 10){
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
        else if (d < f)
        System.out.println("d is less than f"); 
        else
        System.out.println("please give values");
    
    System.out.println("SWITCH....");
    char z = 'j';
    String size;
    switch (z){
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
    

    
    }
}
    

