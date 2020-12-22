public class ForExample {
    public static void main(String[] args) {
        /*lets declare and print in java*/
        int i,sum=0;//Here i,sum are variables
        for(i=1;i<=10;i++){
            if(i==7){
                break;
            }
            if(i==4)
            {
                
                continue;
            }
            sum+=i;/**Here sum will add number by number and stores in it */
            System.out.println(sum);
        }
    }
    
}
