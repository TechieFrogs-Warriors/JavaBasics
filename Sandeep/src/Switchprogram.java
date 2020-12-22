public class Switchprogram {
    public static void main(String[] args) {
        String ch = "body Fitness";
        switch (ch) {
            case "body Fitness":
                int weight = 75;
                if (weight <= 60) {
                    System.out.println("he is fit");
                } else if (weight > 60 && weight <= 70) {
                    System.out.println("he / she is ok but need sone trainging in the weight loss");

                } else if (weight > 70 && weight <= 80) {
                    System.out.println("he is not up to mark in fitness and need to traineed and motivated");

                } else {
                    System.out.println("he is having over weight");
                }
                break;
            case "yoga":
                System.out.println("yoga trainning");
                break;

            default:
                System.out.println("other reqirements");
                break;
        }
    }

}
