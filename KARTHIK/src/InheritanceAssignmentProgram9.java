public class InheritanceAssignmentProgram9 {
    public static void main(String[] args) {
        Counteditem obj1=new Counteditem();
        obj1.setName("milk");
        obj1.setUnitPrice(50);
        obj1.setQuantity(2);
        obj1.dispalay();
        Weigheditem obj2=new Weigheditem();
        obj2.setName("Suger");
        obj2.setUnitPrice(54.25);
        obj2.setWeight(2);
        obj2.display();

    }
    
}
class Purchaseitem{
    private String Name;
    private double UnitPrice;
    public Purchaseitem(){
    }
    public Purchaseitem(String Name,double UnitPrice){
        this.Name=Name;
        this.UnitPrice=UnitPrice;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public double getUnitPrice(){
        return UnitPrice;
    }
    public void setUnitPrice(double unitprice) {
        this.UnitPrice=unitprice;
    }
    public double getPrice(){
        return UnitPrice;
    }
    public void display() {
    System.out.println("Name: "+Name);
    System.out.println("Unit Price:"+UnitPrice);
    }
}
class Counteditem extends Purchaseitem{
    private int quantity;
    public Counteditem() {
    }
    public Counteditem(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice(){
        return quantity*super.getPrice();
    }

    public void dispalay() {
        super.display();
        System.out.println("Quantity: "+quantity+" "+"liters");
        System.out.println("Total Price: "+getPrice());
    }
}
class Weigheditem extends Purchaseitem{
    private double weight;
    public Weigheditem() {
        super("suger", 55);
    }
    public Weigheditem(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        weight=2;
        this.weight = weight;
    }
    public double getPrice(){
        return weight*super.getPrice();
    }
    public void display() {
        super.display();
        System.out.println("Weight: "+weight+"Kgs");
        System.out.println("Total Price:"+getPrice());
    }
}