package ProgramizExamplePrograms;

public class ConvertBinaryToDeciml {
    public static void main(String[] args) {
        long number = 110110111;
        int decimal = ConvertBinaryToDecimal(number);

        System.out.println("Binary to decimal is :: " + number + " :: " + decimal);
    }

    public static int ConvertBinaryToDecimal(long number) {
        int decimalnumber = 0, i = 0;
        long reminder;

        while (number != 0) {
            reminder = number % 10;
            number /= 10;
            decimalnumber += reminder * Math.pow(2, i);
            i++;
        }
        return decimalnumber;
    }

}
