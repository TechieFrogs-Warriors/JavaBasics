public class Switchprogram {
    public static void main(String[] args) {
        String ch = "body Fitness";
        switch (ch) {
            case "body Fitness":
                int x = 10;
                System.out.println(x);
                int weight = 60;
                if (weight <= 60) {
                    int m = 20;
                    System.out.println("he is fit");
                } else if (weight > 60 && weight <= 70) {
                    int m = 20;
                    System.out.println("he / she is ok but need sone trainging in the weight loss");
                    System.out.println(x);
                } else if (weight > 70 && weight <= 80) {
                    int m = 20;
                    System.out.println("he is not up to mark in fitness and need to traineed and motivated");

                } else {

                    System.out.println("he is having over weight");
                }
                break;
            case "yoga":

                System.out.println("yoga trainning");
                break;

            default:
                int x = 10;
                System.out.println(x);
                System.out.println("other reqirements");
                break;

        }
    }

}
