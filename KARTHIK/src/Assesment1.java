public class Assesment1 {
    public static void main(String[] args) {
        
        Area(5, 4);
        Area(5);
        
    }
    public static int Area(int Length,int Breath){
        int Area=Length*Breath;
        System.out.println("Area of The Rectangle: "+Area);
        return Area;
    }
    public static int Area(int Side){
        int Area=Side*Side;
        System.out.println("Area Of the Square:"+Area);
        return Area;
    }
}
