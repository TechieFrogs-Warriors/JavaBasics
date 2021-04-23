package Java8_Features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Product 
{
    //variables
    int id;
    String name;
    int price;

    //parameterized constructor
    Product(int pid,String pName,int price)
    {
        this.id = pid;
        this.name  = pName;
        this.price = price;
    }
    //setters and getters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    //tostring() method
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    
    //Driver class
    public static void main(String[] args) 
    {
        //creating arraylist object with 'Product'(user-defined) as generic type here
        List<Product> pobj = new ArrayList<>();
        pobj.add(new Product(1, "phone", 10000));
        pobj.add(new Product(4, "laptop", 25000));
        pobj.add(new Product(2, "tab", 5000));
        pobj.add(new Product(3, "phone", 25000));
        pobj.add(new Product(1, "tab", 10000));

        //iterate through the arraylist
        pobj.stream().forEach(x->{System.out.println(x);});

        //to get only product names
        pobj.stream().map(x->x.name).forEach(x->{System.out.println(x);});

        //to get product whose price is above 20000
        pobj.stream().filter(x->x.price>20000).map(x->x.name).forEach(x->{System.out.println(x);});

        //to find out product with max price
        Comparator<Product> priceComp = Comparator.comparing(Product :: getPrice);
		Product p = pobj.stream().max(priceComp).get();
		System.out.println(p.getId()+"-"+p.getName()+"-"+p.getPrice());
        
    }

}
