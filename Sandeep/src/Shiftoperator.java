public class Shiftoperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("------Left Shift Operator---------");
        System.out.println(a << 2);// 10*2^2=10*4=40
        System.out.println(a << 3);// 10*2^2^2=10*8=80
        System.out.println(a << 5);// 10*2^2^2^2^2=10*32=320
        System.out.println(a << 4);// 10*2^2^2^2=10*16=160
        System.out.println(15 << 4);// 15*2^2^2^2=15*16=240
        System.out.println(5 << 3);// 5*2^2^2=5*8=40

        System.out.println("----------Right shift Operator------");
        System.out.println(b >> 2);// 20/2^2=20/4=5
        System.out.println(b >> 2);// 20/2^2=20/4=5
        System.out.println(b >> 3);// 20/2^2^2=20/8=2
        System.out.println(40 >> 3);// 40/2^2^2=20/8=5
        System.out.println(15 >> 3);// 15/2^2^2=20/8=1

    }

}
