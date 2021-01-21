package Inhertanceprograms;

class PurchaseItem {
    private String name;
    private double unitPrice;

    public PurchaseItem() {
        this.name = "item1";
        this.unitPrice = 22;
    }

    public double getPrice() {
        return unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}

class WeighedItem extends PurchaseItem {
    private double weight;

    public WeighedItem(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return weight * super.getPrice();
    }
}

class CountedItem extends PurchaseItem {
    private int quantity;

    public CountedItem(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return quantity * super.getPrice();
    }
}

public class Inhertanceprogram9 {
    public static void main(String[] args) {

        WeighedItem obj = new WeighedItem(20);
        obj.getWeight();
        obj.getUnitPrice();
        obj.getPrice();
        System.out.println(
                "weight : " + obj.getWeight() + "\nUnit price : " + obj.getUnitPrice() + "\nprice : " + obj.getPrice());

        CountedItem obj1 = new CountedItem(2);
        obj1.getQuantity();
        obj1.getPrice();
        obj1.getUnitPrice();
        System.out.println("\n\n\nQuantity : " + obj1.getQuantity() + "\nUnit price : " + obj1.getUnitPrice()
                + "\nPrice : " + obj1.getUnitPrice());

    }

}
