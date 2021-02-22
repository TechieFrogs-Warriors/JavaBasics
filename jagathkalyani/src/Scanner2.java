import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
      
       Scanner scan =new Scanner("warriors challengers");
       String pattern = "warriors";
       if (scan.hasNext(pattern)){
           System.out.println("pattern found");
       }
       else{
           System.out.println(("pattern not found"));
       }
       Scanner sc=new Scanner(System.in);
       while (sc.hasNext()){
           if (sc.hasNextFloat()){
               System.out.println("found float value : "+sc.nextFloat());
              
           }
           else{
            System.out.println(("not found float() value : "+sc.next()));   
           }
       }
       String s="gfg 9 + 6 = 12.0 ";
       Scanner sc2=new Scanner(s);
       while(sc2.hasNext()){
           if (sc2.hasNextLong()){
               System.out.println("found big integer : "+sc2.nextLong());
              
           }
           else{
            System.out.println("not found biginteger value : "+sc2.next());
        }
       }
       String s1="gfg 9 + 6 = 12.0 ";
       Scanner sc1=new Scanner(s1);
       while(sc1.hasNext()){
           if (sc1.hasNextBigInteger()){
               System.out.println("found big integer : " +sc1.nextBigInteger());
               
           }
           else{
            System.out.println("not found biginteger value : "+sc1.next());
        }
       }
       sc1.close();
       sc2.close();
       sc.close();
       scan.close();

    }
    
}
