package StringsPrograms.StringBuffersPrograms;

public class Details3 {
    String name;
    int age;
    String address;
    char gender;
    long phone;

    Details3(String name, int age, String address, char gender, long phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.phone = phone;

    }

    public String toString() {
        return name + "\n" + age + "\n" + address + "\n" + gender + "\n" + phone;
    }

    public static void main(String[] args) {

        Details3 obj1 = new Details3("sandeep", 26, "bjb jhb", 'm', 25852684);
        System.out.println(obj1);
        System.out.println();
        System.out.println(obj1.toString());
        String s = new String("Krishna");
        System.out.println(s);
        StringBuffer s1 = new StringBuffer("Venkata");
        System.out.println(s1);

    }

}
