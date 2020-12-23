public class hackerrankpractice {
    public static void main(String[] args) {
        
        int n=3;
        if ((n>2&n<5)&&n%2==0)
        System.out.println("not weird");
        else if  ((n>6&n<20) && n%2==0)
        System.out.println(" weird");
        else if ((n>20&n<100) && n%2==0)
        System.out.println("not weird");
        else 
        System.out.println("weird");

        int m=3;
        if (((m>2&m<5)&&m%2==0)|((m>20&m<100)&&m%2==0))
        System.out.println("not weird");
        else 
        System.out.println("weird");
        
        int o=24;
        if(o%2==1 || (o>=6 && o <= 20)){
            System.out.println("Weird");
          }else{
            System.out.println( "Not Weird");
          }
          int p=3;

          if (p%2 == 0 && (p>20 || p< 6)) { 
            System.out.println("Not weird ");
             }
             else {
             System.out.println("Weird");
            }
            int w=3;
            if(w<100){
            System.out.println((w%2==1 || (w>=6 && w<=20)) ? "Weird" : "Not Weird");
            }
        
    }
    
}
