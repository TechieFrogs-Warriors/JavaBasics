public class LabledForExample {
    public static void main(String[] args) {
        int k,sum=0;
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                
                if(i==2&&j==2){
                    
                    break bb;
                }
            
            if(i==1&&j==3){
                continue bb;
            }
        
            System.out.println(i+ " " +j);
            }  }
            cc:
            
            for(k=1;k<=10;k++){
                sum=sum+k;

            
            
        }
    }
    
}
