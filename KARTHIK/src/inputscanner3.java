import java.util.Scanner;

public class inputscanner3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a;
        do{
            System.out.println("enter name:");
            System.out.println(scan.hasNext("[a-z]"));
            while(!scan.hasNext("[A-za-z]*")){
                System.out.println("please enter valid name only.....");
                scan.next();
            }
            a=scan.next();
        }
        while(a.equals(""));
        System.out.println("valid name: "+a);
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
        scan.close();
    
    }
}


    

