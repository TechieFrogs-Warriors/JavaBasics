public class ToStringPracticeProgram1 {
    public static void main(String[] args) {
        //details56 p1=new details56("karthik", 8919015201l, "bbbbbb");
        //details56 p2=new details56("kbps", 7993411419l, "kkkkkk");
        details56 p3=new details56("Ramya");
        //System.out.println(p1);
        //System.out.println(p2);
        System.out.println(p3.toString("raj"));
        System.out.println(p3);
        
    }
    
}
class details56{
    String Name;
    long phoneNumber;
    String Address;
    details56(String Name){
        this.Name=Name;
    }  
    // details56(String Name,long phoneNumber,String Address){
    //     this.Name=Name;
    //     this.phoneNumber=phoneNumber;
    //     this.Address=Address;
    // }
    // public String toString(){
    //     return Name+" "+phoneNumber+" "+Address;  
    // }
     //public String toString(){    //Duplicate method
      //  return Name+" "+phoneNumber+" "+Address;  
    //} 
    public String toString(String Name){
        return Name;

    }

}