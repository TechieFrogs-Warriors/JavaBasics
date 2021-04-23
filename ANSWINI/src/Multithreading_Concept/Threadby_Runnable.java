package Multithreading_Concept;
//Thread program  by implementing runnable interface
public class Threadby_Runnable 
{
    public static void main(String[] args) 
    {
        //creating class(which is implementing runnable) object 
        RunThread rt = new RunThread();
        //creating thread class object and passing customclass object as argument
        Thread t = new Thread(rt);
        //starting thread
        t.start();
        
    }
    
}

//class implementing Runnable
class RunThread implements Runnable
{
    //overriding run method of runnable interface
    public void run()
    {
        System.out.println("Im in runnable interface run method");
    }
}
