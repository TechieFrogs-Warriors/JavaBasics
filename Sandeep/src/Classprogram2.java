class StudentY {
    String name;
    String address;
    int roll_no;
    long phone;
}

public class Classprogram2 {
    public static void main(String[] args) {

        StudentY obj = new StudentY();
        obj.name = "jhon";
        obj.address = "1-246,hyd";
        obj.roll_no = 56;
        obj.phone = 1234567980;

        StudentY obj1 = new StudentY();
        obj1.name = "sam";
        obj1.address = "2-5989,vij";
        obj1.roll_no = 66;
        obj1.phone = 663352214;

        System.out.println("Name : " + obj.name + "\nAddress : " + obj.address + "\nRool_no : " + obj.roll_no
                + "\nPhone : " + obj.phone);
        System.out.println("Name : " + obj1.name + "\nAddress : " + obj1.address + "\nRool_no : " + obj1.roll_no
                + "\nPhone : " + obj1.phone);

    }

}
