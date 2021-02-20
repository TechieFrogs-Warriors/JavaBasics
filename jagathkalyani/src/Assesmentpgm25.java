public class Assesmentpgm25 {
    public static void main(String[] args) {
        int k=6,l=1;
        for(int i=0;i<k;i++){
            for(int m=1;m<k-i;++m){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(j==0 || i==0)
                    l=1;
                    else
                    l=l*(i-j+1)/j;
                    System.out.printf("%4d",l);
            

            }
            System.out.println();
        }
    }
    
}
