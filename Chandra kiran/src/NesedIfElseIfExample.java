public class NesedIfElseIfExample {
    public static void main(String[] args) {
        int runs=100;
        if(runs>0)
        {
            
           if(runs==50){
            System.out.println("batsman scored half century");}
            else if(runs==100){
            System.out.println("batsman scored century");}
        }
        else{
            System.out.println("batsman out for duck");
        }
    }
    
}
