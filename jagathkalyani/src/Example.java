public class Example {
   
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c = 15;
        short d=20;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(a++ + --d);
        System.out.println(~c);
        System.out.println( a+b +" " +b*c +" "  +c/d +" " +d%a +" " +a*b);
        System.out.println(c>>b);
        System.out.println(a++ + --d);
        System.out.println(a>b||b<c && a<b|d>c);
        char k = 'j';

     String size;
     switch(k){
        case 'q':
        size = "1";
        break;
        case 'l':
        size = "2";
        break;
        case 'm':
        size = "3";
        break;
        case 'n':
        size = "4";
        break;
        default:
        size = "Unknown";
        break;
        
    }
    System.out.println("output " + size);
}


            

        

    
}