import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class Assesmentpgm23 {
    public static void main(String[] args) {
        int r=5,k=0,c=0,c1=0;
        for(int i=1;i<=r;++i){
            for (int s=1;s<=r-i;++s){
                System.out.print(" ");
                ++c;
            }
            while(k!=2*i-1){
                if(c<=r-1){
                    System.out.print((i+k)+" ");
                    ++c;
                }
                else{
                    ++c1;
                    System.out.print((i+k-2*c1)+" ");
                }
                ++k;
            }  
            c1=c=k=0;
            System.out.println();     
         }
    }
    
}
