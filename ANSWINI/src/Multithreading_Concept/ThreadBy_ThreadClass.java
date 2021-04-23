package Multithreading_Concept;
//Thread Program by extending Thread class

public class ThreadBy_ThreadClass 
{
    public static void main(String[] args) 
    {
        //creating object for customthread class
        CustomThread ct  = new CustomThread();
        //to start the thread using thread object
        ct.start();
    }
    
}
//class extending thread class
class CustomThread extends Thread
{
    //should override run() method of thread class to customize it
    public void run()
    {
        System.out.println("Im in thread run method");
    }
}
