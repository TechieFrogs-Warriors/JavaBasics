public class Assesmentpgm24 {
    public static void main(String[] args) {
        int k=5;
        for(int i=k;i>=1;--i){
            for(int m=1;m<=k-i;++m){
                System.out.print(" ");

            }
            for(int j=i;j<=2*i-1;++j){
                System.out.print("*");
            }
            for(int j=0;j<i-1;++j){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
