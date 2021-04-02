package ArrayListPrograms;

import java.util.*;

//sort data in descending order based on pno?
class Product1 implements Comparable<Product> {
    int pno;
    String pname;
    double price;

    public Product1(int pno, String pname, double price) {
        this.pno = pno;
        this.pname = pname;
        this.price = price;
    }

    public String toString() {
        return pno + "-" + pname + "-" + price;
    }

    public int compareTo(Product p) {
        if (this.pno < p.pno) {
            return 1;
        } else if (this.pno > p.pno) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Program14 {
    public static void main(String[] args) {
        List<Product> lst = new ArrayList<Product>();

        lst.add(new Product(101, "B", 2000));
        lst.add(new Product(100, "A", 1000));
        lst.add(new Product(102, "C", 3000));
        Collections.sort(lst);
        Iterator<Product> i = lst.iterator();
        while (i.hasNext()) {
            Product p = i.next();
            System.out.println(p.pno + "-" + p.pname + "-" + p.price);
        }

    }
}
