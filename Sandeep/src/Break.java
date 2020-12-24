public class Break {
    public static void main(String[] args) {
        System.out.println("---------break---------------");
        for (int i = 0; i <= 10; i++) {
            if (i > 7) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("----------break-----------");
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (i == 2) {
                    if (j == 2) {
                        break;
                    }

                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("----------break------------");
        int i = 1;
        while (i <= 10) {
            if (i == 4) {

                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("-----------break--------------");
        int j = 1;
        do {
            if (j == 2) {
                break;
            }
            System.out.println(j);
            j++;
        } while (j <= 10);
    }

}
