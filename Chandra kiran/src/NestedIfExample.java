public class NestedIfExample {
    public static void main(String[] args) {
        int c=30;
        if(c%3==0)
        {
            System.out.println("c is multiple of 3");
            if(c%2==0){
                System.out.println(" c is even number");
            }
        }
    else {
        System.out.println("c is odd number");
    }
    }
    
}
