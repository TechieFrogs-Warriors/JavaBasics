package Collections;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorPractice 
{
    public static void main(String[] args) 
    {
        //creating a vector
        List<Integer> myvector = new Vector<>();
        //Adding elements to a vector
        myvector.add(1);
        myvector.add(2);
        myvector.add(3);
        myvector.add(4);
        myvector.add(5);
        myvector.add(6);

        //printing vector elements
        myvector.forEach(System.out::println);

        //adding element at specific position
        myvector.add(3, 10);
        myvector.forEach(System.out::println);

        //creating vector by using vector claa instead of list interface
        Vector<Integer> newvector = new Vector<>();
        //Adding elements to a vector
        newvector.addElement(7);
        newvector.addElement(8);

        //Iterating a vector using Enumeration(extra type to print elements which is not in arraylist)
        Enumeration eval = newvector.elements();
        System.out.println("Vector elements are: ");
        while(eval.hasMoreElements())
        System.out.println(eval.nextElement());
        
        //to display vector current capacity
        System.out.println(newvector.capacity());

        //cloning vector
        Object v = new Vector<>();
        v =  newvector.clone();
        System.out.println(v);
        //creating new empty vector and cloning newvwctor elements into it
        Vector<Integer> vecclone = new Vector<Integer>();
        vecclone = (Vector) newvector.clone();
        System.out.println(vecclone);
        //displays clone of newvector elements
        System.out.println(newvector.clone());

        //copying vector into array
        Integer[] arr = new Integer[5]; //array size is 5   
        newvector.copyInto(arr);//but newvector has only 2 elements..so 'null' is placed in remaining indexes
        for(Integer num : arr)  
        {  
            System.out.println(num);  //printing array elements
        }  
        
        //removing elements from vector
        System.out.println( myvector.remove(3));
        System.out.println(newvector);
        newvector.removeElement(8);
        System.out.println(newvector);
        newvector.removeElementAt(0);
        System.out.println(newvector);

        //To set size for vector
        newvector.setSize(10);

        //set vector element
        newvector.setElementAt(20,5 );
        System.out.println(newvector);

        //sublst method in vector
        System.out.println(myvector.subList(1, 4));

        //displaying first and last elements
        System.out.println(newvector.lastElement());
        System.out.println(newvector.firstElement());


        

        


    


    }
    
}
