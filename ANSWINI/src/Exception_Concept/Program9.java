package Exception_Concept;

import java.io.*;

public class Program9 
{
    //program to handle checked exceptions
    public static void main(String[] args) 
    { 
        try 
        { 
            FileInputStream Program9 = new FileInputStream("/downloads/except.txt");
            Program9.toString();
        } 
        catch (FileNotFoundException e) 
        { 
            System.out.println("File does not exist"); 
        } 
    } 
    
}
