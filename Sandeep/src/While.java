public class While {
    public static void main(String[] args) {
        System.out.println("-------- while loop ---------");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("------- do while loop ---------");
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

}
