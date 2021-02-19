class Complex {

    // Declaring variables
    int real, imaginary;

    // Empty Constructor
    Complex() {
    }

    // Constructor to accept real and imaginary part
    Complex(int tempReal, int tempImaginary) {
        real = tempReal;
        imaginary = tempImaginary;
    }

    // Defining addComp() method for adding two complex number
    void addComp(Complex C1, Complex C2) {

        // adding real part of complex numbers
        real = C1.real + C2.real;

        // adding Imaginary part of complex numbers
        imaginary = C1.imaginary + C2.imaginary;

        // returning the sum

    }

    // Defining subtractComp() method for subtracting two complex number
    void subtractComp(Complex C1, Complex C2) {

        // subtracting real part of complex numbers
        real = C1.real - C2.real;

        // subtracting Imaginary part of complex numbers
        imaginary = C1.imaginary - C2.imaginary;

    }

    /*
     * // Defining mulComp() method for subtracting two complex number Complex
     * mulComp(Complex C1, Complex C2) { // creating temporary variable Complex temp
     * = new Complex();
     * 
     * // subtracting real part of complex numbers temp.real = C1.real * C2.real;
     * 
     * // subtracting Imaginary part of complex numbers temp.imaginary =
     * C1.imaginary * C2.imaginary;
     * 
     * // returning the difference return temp; }
     */
    // Function for printing complex number
    void printComplexNumber() {
        System.out.println("Complex number: " + real + " + " + imaginary + "i");
    }
}

public class Classprogram9 {
    public static void main(String[] args) {

        // taking input from user

        /*
         * Scanner sc=new Scanner(System.in); int c1,c2;
         * System.out.println("Enter Complex number c1 : "); c1=sc.nextInt();
         * System.out.println("Enter Complex numeber c2 : "); c2=sc.nextInt();
         */

        // First Complex number
        Complex C1 = new Complex(3, 2);
        C1.printComplexNumber();

        // Second Complex number
        Complex C2 = new Complex(9, 5);
        C2.printComplexNumber();

        // for Storing the data
        Complex C3 = new Complex();

        // calling addComp() method
        C3.addComp(C1, C2);
        System.out.print("Sum of ");
        C3.printComplexNumber();

        // calling subtractComp() method
        C3.subtractComp(C1, C2);
        System.out.print("Difference of ");
        C3.printComplexNumber();

        /*
         * // calling mulComp() method C3 = C3.mulComp(C1, C2);
         * System.out.println("Product of "); C3.printComplexNumber();
         */
    }

}
