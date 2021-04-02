package Collections;
import java.util.*;

public class LinkListpractice2 
{
    
    public static void main(String[] args) 
    {
        //Creating Books  
        Book b1 = new Book(101,"Core Java","Answini","Own Publications",2) ;
        Book b2 = new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
        Book b3 = new Book(103,"Operating System","Galvin","Wiley",6); 
        
        //Creating list of Books  
        List<Book> list = new LinkedList<Book>();

        //Adding Books to list  
        list.add(b1);  
        list.add(b2);  
        list.add(b3);  

        //Traversing list  
        for(Book b:list)
        {  
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        }  
        
    }
    
}

class Book 
{  
    int id,quantity;  
    String name,author,publisher;  
              
    public Book(int bookId, String bookName, String bookAuthor, String bookPublisher, int bookQuantity) 
    {  
        this.id = bookId;  
        this.name = bookName;  
        this.author = bookAuthor;  
        this.publisher = bookPublisher;  
        this.quantity = bookQuantity;  
    }  
}  
