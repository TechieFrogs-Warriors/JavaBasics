public class ToStringPracticeProgram {
    public static void main(String[] args) {
        details55 p1=new details55("karthik", 8919015201l, "bbbbbb");
        //details55 p2=new details55("kbps", 7993411419l, "kkkkkk");
        System.out.println(p1.Name);
        System.out.println(p1.toString());
       // System.out.println(p2);

    }
    
}
class details55{
    String Name;
    long phoneNumber;
    String Address;
    details55(String Name,long phoneNumber,String Address){
        this.Name=Name;
        this.phoneNumber=phoneNumber;
        this.Address=Address;
        System.out.println("hello"+Name);
    }
    public String toString(){
        return "HELLO";
    }

}
