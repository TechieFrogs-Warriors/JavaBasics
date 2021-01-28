package StringsPrograms.StringBuffersPrograms;

public class Details {
    String name;
    int age;
    String address;
    char gender;
    long phone;

    Details() {
        String name = "Sai";
        int age = 25;
        String address = "bhacb ib icb";
        char gender = 'm';
        long phone = 321865156;
    }

    Details(String name, int age, String address, char gender, long phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.phone = phone;

    }

    public static void main(String[] args) {
        Details obj = new Details();
        System.out.println(obj);
        System.out.println(obj.toString());
    }
}
