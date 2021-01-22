package Abstractclass;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    float subject1, subject2, subject3;

    public A(float s1, float s2, float s3) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }

    double getPercentage() {
        return (subject1 + subject2 + subject3) / 300 * 100;
    }
}

class B extends Marks {
    float subject1, subject2, subject3, subject4;

    public B(float s1, float s2, float s3, float s4) {
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
        subject4 = s4;
    }

    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 400 * 100;
    }

}

public class Excercises4 {
    public static void main(String[] args) {
        A obj = new A(60, 60, 60);
        System.out.println("peresentage of A : " + obj.getPercentage());

        B obj1 = new B(40, 60, 25, 90);
        System.out.println("Percentage of B : " + obj1.getPercentage());
    }

}
