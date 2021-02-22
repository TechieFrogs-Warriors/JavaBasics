public class Assesmentpgm19 {
    public static void main(String[] args) {
       int i,j;
       for(i=1;i<=5;i++){
           int ch=65;
           for(j=1;j<=i;j++){
               System.out.print((char)(ch+i-1)+" ");
           }
           System.out.println();
       }
       
    }
    
}
