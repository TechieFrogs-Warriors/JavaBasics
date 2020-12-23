public class WhileExample {
    public static void main(String[] args) {
        int i=1,mul=1;
        while(i<=6){
            if(i==5){
                i++;
                break;
            }
            mul*=i;
            System.out.println(mul);
            i++;
        }
    }
    
}
