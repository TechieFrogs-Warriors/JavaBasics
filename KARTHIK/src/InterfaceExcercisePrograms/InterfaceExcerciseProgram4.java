package InterfaceExcercisePrograms;

public class InterfaceExcerciseProgram4 implements display {
    public static void main(String[] args) {
        System.out.println("a="+a+"\nb="+b+"\nc="+c+"\nd="+d+"\ne="+e);

    }
}
interface display{
    static int a=1;
    final int b=2;
    public int c=3;
    public static final int d=4;
    int e=4;
}