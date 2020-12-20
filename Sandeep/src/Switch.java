public class Switch {
    public static void main(String[] args) {
        System.out.println("----------Switch case condition-----------");
        String ch = "abc party";

        switch (ch) {
            case "abc party":
                System.out.println("you voted abc party");

                break;
            case "xyz party":
                System.out.println(" you voted xyz party");
                break;

            case "ijk party":
                System.out.println(" you voted ijk party");
                break;
            case "other partys":
                System.out.println("you voted other partys");
                break;

            default:
                System.out.println("your vote is in valid");
                break;
        }
    }

}
