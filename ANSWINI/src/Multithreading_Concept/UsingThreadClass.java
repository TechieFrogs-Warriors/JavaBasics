package Multithreading_Concept;

public class UsingThreadClass 
{
    //class extending thread class
    class Sample  extends Thread
    {
        //run method for thread to run the process written in the method
        public void run()
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("hi");
                //exception handling the sleep method of thread class
                try
                {
                    Thread.sleep(500);
                }catch(Exception e)
                {

                }
            }
        }
    }
    //class extending thread class
    class Sample2 extends Thread
    {
        //run method for thread to run the process written in the method
        public void run()
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("hello");
                //exception handling the sleep method of thread class
                try
                {
                    Thread.sleep(500);
                }catch(Exception e)
                {

                }
            }
        }
    }
    public static void main(String[] args) 
    {
        //creating objects for classes normally
        UsingThreadClass obj =new UsingThreadClass();
        Sample obj1 = obj.new Sample();
        Sample2 obj2 = obj.new Sample2();
        //starting the first thread
        obj1.start();
        //to handle the collision between threads using sleep method 
        try
        {
            Thread.sleep(10);
        }catch(Exception e){}
        //starting the second thread
        obj2.start();
    }
    
}
