public class ContinueDoWhile {
    public static void main(String[] args) {
        int i=4,div=48;
        do{
            if(i==2){
                i--;
                continue;

            }
            div/=i;
            System.out.println(div);
            i--;
             }while(i>0);
    }
    
}
