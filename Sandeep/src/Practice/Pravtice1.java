package Practice;

class A// class A
{
    int i = 40, j = 50;// intilizing the values of i and j

    A()// Constructor
    {
        System.out.println("A class");
    }

    void show()// method to print
    {
        System.out.println("i value is : " + i + "\n j value is : " + j);
    }

    void display() {
        System.out.println(" abc");
    }

}

class B extends A// B class extends A class
{
    int k = 100;// intilizing value to k

    B()// Constructor
    {
        System.out.println("class B");
    }

    void show()// method to print k value
    {
        // super.show();
        System.out.println("k value is : " + k);
    }

}

public class Pravtice1 {
    public static void main(String[] args) {
        B obj = new B();
        // creating object for class B as B extends A ned not to create object foe class
        // A

        obj.show();
        obj.display();
    }

}
