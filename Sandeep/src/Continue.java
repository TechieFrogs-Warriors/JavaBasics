public class Continue {
    public static void main(String[] args) {
        System.out.println("-------- Continue ----------");
        for (int i = 0; i <= 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("---------- Continue ----------");
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 10; j++) {
                if (i == 5 || j == 5) {
                    continue;
                }
                System.out.println("i:" + i + " j:" + j);
            }
        }
        System.out.println("------- break -------------");
        aa: for (int i = 1; i <= 3; i++) {
            bb: for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    continue aa;
                }
                System.out.println(i + " " + j);
            }
        }
        System.out.println("----------break----------");
        int i = 1;
        int j = 1;
        while (i <= 10 && j <= 10) {
            if (i == 5 || j == 5) {
                i++;
                j++;
                continue;
            }
            System.out.println("i:" + i + " j:" + j);
            i++;
            j++;
        }
        System.out.println("---------break-----------");
        int k = 1;
        int l = 1;
        do {
            if (k == 5 && l == 6) {
                k++;
                l++;
                continue;
            }
            System.out.println("k:" + k + " l:" + l);
            k++;
            l++;

        } while (k <= 10 && l <= 10);
    }

}
