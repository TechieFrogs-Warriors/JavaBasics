package StringsPrograms.StringBuffersPrograms;

public class Details1 {
    String name;
    int age;
    String address;
    char gender;
    long phone;

    Details1() {
        String name = "Sai";
        int age = 25;
        String address = "bhacb ib icb";
        char gender = 'm';
        long phone = 321865156;
    }

    Details1(String name, int age, String address, char gender, long phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.phone = phone;

    }

    Details1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        System.out.println("in toString");
        return name + "\n" + age + "\n" + address + "\n" + gender + "\n" + phone;
    }

    public static void main(String[] args) {
        // Details1 obj = new Details1();
        // System.out.println(obj);
        // // System.out.println(obj.toString());
        // System.out.println("--------------------------");
        // Details1 obj1 = new Details1("sandeep", 26, "bjb jhb", 'm', 25852684);
        // System.out.println(obj1);
        // System.out.println();
        // // System.out.println(obj1.toString());
        // System.out.println("\n-------------");
        Details1 obj2 = new Details1("Veknata", 30);
        System.out.println(obj2);
        // // System.out.println(obj2.toString("sandy", 33));

    }

}
