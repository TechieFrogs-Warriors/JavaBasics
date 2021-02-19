public class PolymorphismPractice {
    public static void main(String[] args) {
        mydetails obj=new mydetails();
        obj.sd("karthik");
        obj.sd(8919015201l);
        concatenation obj1=new concatenation();
        obj1.str("karthik", "raju");
        sound obj2=new sound();
        obj2.str1("karthik", 419);
        sound1 obj3=new sound1();
        obj3.str1(4944444944441l, 4987998488468484l);
        BankP obj4=new BankP();
        obj4.display();
        obj4.display(8);

    }
    
}
class mydetails{
    String Name;
    long PhoneNumber ;
    public void sd(String name){
        this.Name=name;
        System.out.println("Name: "+Name);
    }
    public void sd(long PhoneNumber){
        this.PhoneNumber=PhoneNumber;
        System.out.println("Phone Number "+PhoneNumber);
    }
}
class concatenation{
    String a;
    String b;
    public void str(String c,String d){
        this.a=c;
        this.b=d;
        System.out.println("String Concatenation: "+(a+b));
    }
}
class sound{
    String a;
    int b;
    public void str1(String c,int d){
        this.a=c;
        this.b=d;
        System.out.println("String Concatenation To Number:"+(c+d));
    }

}
class sound1{
    long a;
    double b;
    public void str1(long c,double d){
        this.a=c;
        this.b=d;
        System.out.println("Long and Double Type Promotion:"+(c+d));
    }

}
class BankM{
    public float getBalence(float Amount){
        System.out.println("Balence Of Bank:"+Amount);
        return Amount;
    }
}
class BankN extends BankM{
    public float getBalence(float Amount){
        super.getBalence(0);
        System.out.println("Balence Of BankA:"+Amount);
        return Amount;
    }
}
class BankO extends BankN{
    public float getBalence(float Amount){
        super.getBalence(1000);
        System.out.println("Balence Of BankB:"+Amount);
        return Amount;   
    }
    void display(){
        System.out.println("Method overriding1");
    }
}
class BankP extends BankO{
    public float getBalence(float Amount){
        super.getBalence(1500);
        System.out.println("Balence Of BankC:"+Amount);
        return Amount;
    }
    void display(){
        System.out.println("Method overriding 2");
    }
    void display(int a){
        System.out.println("Method overriding 3");
    }
}
