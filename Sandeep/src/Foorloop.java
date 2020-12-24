
public class Foorloop {
    public static void main(String[] args) {

        System.out.println("--------- For loop -------");
        for (int i = 0; i <= 3; i++) {
            System.out.println("i value is:" + i);
        }
        System.out.println("------ Nested For loop -------");
        for (int i = 0; i <= 3; i++) {
            System.out.println("i value is:" + i);
            for (int j = 0; j <= 4; j++) {
                System.out.println("j value is:" + j);
            }
        }
        System.out.println("-------- Labled For loop -------");

        aa: for (int i = 1; i <= 3; i++) {
            bb: for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
                cc: for (int k = 1; k <= 2; k++) {
                    System.out.println(k);
                }
            }

        }
    }

}
