public class WhileContinue {
    public static void main(String[] args) {
        int i=1,mul=1;
        while(i<=6){
            if(i==3){
                i++;
                continue;
            }
            mul*=i;
            System.out.println(mul);
            i++;
        }
    }
    
    
}
