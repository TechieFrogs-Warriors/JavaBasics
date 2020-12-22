public class Conditionalprogram {
    public static void main(String[] args) {
        System.out.println("----- a to z consultant -------");
        String ch = "software";
        if (ch == "software") {
            int i = 3;
            char c = 'b';
            switch (i) {
                case 1:
                    System.out.println("python");

                    break;
                case 2:
                    System.out.println("java");
                    break;
                case 3:
                    System.out.println("sql");
                    switch (c) {
                        case 'a':
                            System.out.println("My SQL");

                            break;
                        case 'b':
                            System.out.println("mongodb");
                            break;

                        default:
                            System.out.println("select the Database you want to learn");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("AI");
                default:
                    System.out.println("wrong choice");
                    break;
            }

        } else if (ch == "non software") {
            int j = 2;
            switch (j) {
                case 1:
                    System.out.println("sales");

                    break;
                case 2:
                    System.out.println("marketing");
                    break;
                case 3:
                    System.out.println("Finance");
                    break;

                default:
                    System.out.println("select the correct option");
                    break;
            }
        } else if (ch == "education") {
            int k = 1;
            switch (k) {
                case 1:
                    System.out.println("JRE/ILETS trainning");

                    break;
                case 2:
                    System.out.println("govt jobs trainning");
                    break;
                case 3:
                    System.out.println("GATE trainning");
                    break;

                default:
                    System.out.println("choice correct option");
                    break;
            }

        } else if (ch == "job Consyltation") {
            System.out.println("job consultation");

        } else {
            System.out.println("please choice the correct field you want to get the trainning");
        }

    }

}
