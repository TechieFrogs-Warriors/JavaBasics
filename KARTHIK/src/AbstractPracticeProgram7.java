public class AbstractPracticeProgram7 {
    public static void main(String[] args) {
        Circle4 obj1= new Circle4();
        System.out.println("Area Of The Circle : " + obj1.getArea());
        System.out.println("Peremeter Of The Circle : " + obj1.getPerimeter());
        Circle4 obj2 = new Circle4(3.0);
        System.out.println("Area of The Circle : " + obj2.getArea());
        System.out.println("Peremeter of The Circle : " + obj2.getPerimeter());
        Circle4 obj3 = new Circle4(2, "yellow", false);
        System.out.println("Area Of The Circle : " + obj3.getArea());
        System.out.println("Peremeter Of The Circle : " + obj3.getPerimeter());
        System.out.println("Color Of The Circle : " + obj3.getColor());
        System.out.println("Color Filled In The Circle: " + obj3.isFilled());
        System.out.println(obj3.toString());
        Rectangle7 obj4 = new Rectangle7();
        System.out.println("Area Of The Rectangle : " + obj4.getArea());
        System.out.println("Perimeter Of  The Rectangle : " + obj4.getPerimeter());
        Rectangle7 obj5 = new Rectangle7(4.5, 2.25);
        System.out.println("Area Of The Rectangle : " + obj5.getArea());
        System.out.println("Perimeter Of The Rectangle : " + obj5.getPerimeter());
        Rectangle7 obj6 = new Rectangle7(4.5, 2.25, "blue", true);
        System.out.println("Area Of The Rectangle : " + obj6.getArea());
        System.out.println("Perimeter Of The Rectangle : " + obj6.getPerimeter());
        System.out.println("Colour Of The Rectangle: " + obj6.getColor());
        System.out.println("Colour Filled In The Rectangle : " + obj6.isFilled());
        System.out.println(obj6.toString());
        Square7 obj7=new Square7(3.2, "Green", true);
        System.out.println(obj7.toString());
    }
    
}


abstract class Shape4 {
    protected String color = "red";
    protected boolean filled = true;

    public Shape4() {
        this.color = "red";
        this.filled = true;
    }

    public Shape4(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape [ color = " + color + " filled = " + filled + " ]";
    }
}

class Circle4 extends Shape4 {
    protected double radius = 1.0;

    public Circle4() {
        this.radius = 1.0;
    }

    public Circle4(double radius) {
        this.radius = radius;
    }

    public Circle4(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return Math.PI * radius;
    }

    public String toString() {
        return "Shape[Circle [ color = " + color + " filled = " + filled + " ]  radius = " + radius + " ]";
    }
}

class Rectangle7 extends Shape4 {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle7() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle7(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle7(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "shape[Rectangle [ color = " + color + " filled = " + filled + " ]  length = " + length + " width = "
                + width + " ]";
    }
}

class Square7 extends Rectangle7 {
    double side = 2.0;

    public Square7() {
        this.side = 2.0;
    }

    public Square7(double side) {
        this.side = side;
    }

    public Square7(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    public String toString() {
        return "Shape[Square [ color = " + color + " filled = " + filled + "   length = " + length + " width = "
                + width + " ]";
    }

}

