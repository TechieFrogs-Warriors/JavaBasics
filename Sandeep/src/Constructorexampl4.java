class Operation {
    int number;

    Operation(int num) {
        number = num;
        if (number % 2 == 0) {
            System.out.println(number + " is a even number");
        } else {
            System.out.println(number + " is a odd number");
        }
    }

}

public class Constructorexampl4 {
    public static void main(String[] args) {

        Operation obj = new Operation(20);
        Operation obj1 = new Operation(21);

    }

}
