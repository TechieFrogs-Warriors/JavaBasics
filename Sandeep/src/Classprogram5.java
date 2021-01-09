class Rectangle1 {
    int length;
    int breadth;

    Rectangle1(int l, int b) {
        length = l;
        breadth = b;
    }

    void getarea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle of length :" + length + " breadth : " + breadth + " is : " + area);
    }
}

public class Classprogram5 {
    public static void main(String[] args) {

        Rectangle1 obj = new Rectangle1(4, 5);
        obj.getarea();

        Rectangle1 obj1 = new Rectangle1(5, 8);
        obj1.getarea();

    }

}
