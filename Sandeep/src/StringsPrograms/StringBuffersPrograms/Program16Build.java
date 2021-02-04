package StringsPrograms.StringBuffersPrograms;

public class Program16Build {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        System.out.println(s1.capacity());// Defalut it is a 16
        s1.append("Sai Sandeep");
        System.out.println(s1.capacity());// now also its a 16
        s1.append("India is my county");
        System.out.println(s1.capacity());// now its (16*2)+2=34
        s1.append("Iam Sai Sandeep");
        System.out.println(s1.capacity());// (34*2)+2=70

        StringBuilder s2 = new StringBuilder();
        System.out.println(" EnsureCapcity() ");
        System.out.println(s2.capacity());
        s2.append("Sai Sandeep");
        System.out.println(s2.capacity());// 16
        s2.append("India is my county");
        System.out.println(s2.capacity());// now its (16*2)+2=34
        s2.ensureCapacity(10);
        System.out.println(s2.capacity());// 34
        s2.ensureCapacity(50);
        System.out.println(s2.capacity());// (34*2)+2=70
        s2.ensureCapacity(100);
        System.out.println(s2.capacity());// (70*2)+2=142

    }

}
