package ArrayListPrograms;

import java.util.*;

public class Practice1 {

    public static void main(String[] args) {
        // here list is thename of the array list
        // we are implemnting the list of string type using arrayList of same type
        // List is a interface and Arraylist is a class

        List<String> alist = new ArrayList<>();
        // we added 5 names to the list
        // we have used add() method to add the vakes into our list
        // here we need not to delcare size of the arrayList here size is dynamic the
        // size depends on the data we insert
        //arry lis can grow dinamically and can srink dynamically
        //we have a size() methid to find out the size of an arraylist
        //list allows dublicate values

        alist.add("sai");
        alist.add("Sandeep");
        alist.add("Krishna");
        alist.add("Venkata");
        alist.add("Maddipati");
        //System.out.println(alist.size());

        //trying to reomove elemnt of index 2  i.e krishna
        alist.remove(2);
        //System.out.println(alist.size());

        //removing the entire kise using clear() method
        alist.clear();
        System.out.println(alist.size());

    }
}
