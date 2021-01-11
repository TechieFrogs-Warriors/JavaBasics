import java.util.Scanner;
public class PracticeProgramOnClassAndObject9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Real Part: ");
        int a=scan.nextInt();
        System.out.println("Enter Imaginary Part: ");
        int b=scan.nextInt();
        Complex C1 = new Complex(a,b);
        C1.printComplexNumber();
        Complex C2 = new Complex(b,a);
        C2.printComplexNumber();
        Complex C3 = new Complex();       
        C3 = C3.addComp(C1, C2);
        System.out.print("Sum of ");
        C3.printComplexNumber();
        C3 = C3.subtractComp(C1, C2);
        System.out.print("Difference of ");
        C3.printComplexNumber();
        C3 = C3.mulComp(C1, C2);
        System.out.print("Product of ");
        C3.printComplexNumber();
        scan.close();     
    }
    
}
class Complex {
    int real, imaginary;
    Complex(){
    }
    Complex(int R, int  I) {
        real = R;
        imaginary = I;
    }
    Complex addComp(Complex C1, Complex C2) {
        Complex temp = new Complex();
        temp.real = C1.real + C2.real;
        temp.imaginary = C1.imaginary + C2.imaginary;
        return temp;
    }
    Complex subtractComp(Complex C1, Complex C2) {
        Complex temp = new Complex();
        temp.real = C1.real - C2.real;
        temp.imaginary = C1.imaginary - C2.imaginary;
        return temp;
    }
    Complex mulComp(Complex C1, Complex C2) {
        Complex temp = new Complex();
        temp.real = C1.real * C2.real;
        temp.imaginary = C1.imaginary * C2.imaginary;
        return temp;
    }
    void printComplexNumber() {
        System.out.println("Complex number: " + real + " + " + imaginary + "i");
    }
}
