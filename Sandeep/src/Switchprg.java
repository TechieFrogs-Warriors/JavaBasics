public class Switchprg {
    public static void main(String[] args) {
        char ch = 'c';
        switch (ch) {
            case 'a':
                System.out.println("a");

                break;
            case 'b':
                System.out.println("b");
                break;
            case 'c':
                System.out.println('c');
                break;
            default:
                System.out.println("no match found");
                break;
        }
    }

}
