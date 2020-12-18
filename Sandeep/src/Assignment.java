public class Assignment {
    public static void main(String[] args) {
        int x = 10;
        int y = 30;
        x += 5;// x=x+4 (x=10+5)
        y -= 5;// y=y-4 (y=30-5)
        System.out.println(x);
        System.out.println(y);

        short i = 20;
        short j = 40;
        // i+=j;//i=i+j internally so fine
        // i=i+j;//Compile time error because 20+40=60 now int
        i = (short) (i + j);// 60 which is int now converted to short
        System.out.println(i);

    }

}
